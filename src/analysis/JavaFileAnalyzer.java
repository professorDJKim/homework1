package analysis;

import java.nio.file.Paths;

import BugPatternToImplement.divisonByZeroDetection;
import BugPatternToImplement.missingIfStatement;
import BugPatternToImplement.nullPointerDetection;
import ExampleBugPattern.EmptyCatch;
import ExampleBugPattern.EmptyMethod;
import ExampleBugPattern.UselessCondition;
import spoon.Launcher;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.factory.Factory;
import spoon.support.QueueProcessingManager;


public class JavaFileAnalyzer {
	//The Spoon Launcher (JavaDoc) is used to create the AST model of a project
	final static Launcher launcher = new Launcher();
	public static void main(String[] args) {
		//Add java file to be parsed in spoon 
		launcher.addInputResource(Paths.get(System.getProperty("user.dir"), 
				"src", "resource",
				"HomeworkFileToBeAnalyzed.java").toString());
		// Parse the java file into AST
		launcher.getEnvironment().setCommentEnabled(false);
		launcher.getEnvironment().setIgnoreDuplicateDeclarations(true);
		launcher.getEnvironment().setCopyResources(false);
		launcher.getEnvironment().setIgnoreSyntaxErrors(true);
		launcher.run();
		
//		
//		// Create a rule
		final EmptyCatch rule1 = new EmptyCatch();
		final UselessCondition rule2 = new UselessCondition();
		final EmptyMethod rule3 = new EmptyMethod();
//		
//		// run the rules
//		addRuleToAnalyze(rule1);
//		addRuleToAnalyze(rule2);
//		addRuleToAnalyze(rule3);
	}
	/**
	 * 
	 * @param rule: add your rule
	 */
	public static void addRuleToAnalyze(AbstractProcessor rule) {
		final Factory factory = launcher.getFactory();
		final ProcessingManager processingManager = new QueueProcessingManager(factory);
		processingManager.addProcessor(rule);
		processingManager.process(factory.Class().getAll());
	}
}
