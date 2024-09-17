package BugPatternToImplement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;

public class nullPointerDetection extends AbstractProcessor<CtElement> {
	private final Logger LOGGER = Logger.getLogger(this.getClass().getSimpleName());


	@Override
	public void process(CtElement element) {
		// TO IMPLEMENT!
		LOGGER.warning("Null Pointer Detection " + element.getPosition().toString());
	}
}
