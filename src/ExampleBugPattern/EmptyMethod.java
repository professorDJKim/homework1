package ExampleBugPattern;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

public class EmptyMethod extends AbstractProcessor<CtMethod> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());

	@Override
	public void process(CtMethod element) {
		if (element.getBody().getStatements().isEmpty()) {
			LOGGER.warning("empty method block at " + element.getPosition().toString()+ ": \n" +
					element
					);
		}
		
	}
}
