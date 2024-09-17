package ExampleBugPattern;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtCatch;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtLiteral;

public class UselessCondition extends AbstractProcessor<CtIf> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());

	@Override
	public void process(CtIf element) {
		CtExpression condition = element.getCondition();
		if (condition instanceof CtLiteral) {
			LOGGER.info("Useless Condition at " + element.getPosition().toString() + ": \n" +
					element
					);
		}
	}
}
