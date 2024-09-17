package BugPatternToImplement;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtElement;

public class divisonByZeroDetection extends AbstractProcessor<CtElement> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());

	@Override
	public void process(CtElement element) {
		// TO IMPLEMENT
		LOGGER.warning("Division by Zero  " + element.getPosition().toString());
	}
}
