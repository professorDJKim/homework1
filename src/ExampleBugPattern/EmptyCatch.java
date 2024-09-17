package ExampleBugPattern;
import spoon.support.Level;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCatch;

public class EmptyCatch extends AbstractProcessor<CtCatch> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());

	public void process(CtCatch element) {
		if (element.getBody().getStatements().isEmpty()) {
			LOGGER.warning("empty catch clause at " + element.getPosition().toString()+ ": \n" +
					element
					);
			
		}
	}
}
