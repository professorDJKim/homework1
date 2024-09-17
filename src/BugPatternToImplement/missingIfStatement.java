package BugPatternToImplement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.filter.TypeFilter;

public class missingIfStatement extends AbstractProcessor<CtIf> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());


	@Override
	public void process(CtIf element) {
		// TO IMPLEMENT!		
		LOGGER.warning(""
				+ "Empty If Statement  " + element.getPosition().toString());
	}
}






//CtBlock bl = (element.getElements(new TypeFilter<>(CtBlock.class)).get(0));
//if (bl.getStatements().size() == 0) {
//	LOGGER.warning(""
//	+ "Empty If Statement  " + element.getPosition().toString());
//}
