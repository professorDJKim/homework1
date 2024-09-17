package resource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class HomeworkFileToBeAnalyzed {

	void method1() {
		int x = 3;
		try {
			x = x + 1;
		} catch (java.lang.Exception e) {
			// Bad Design: Empty Catch Block
		}
	}

	void method2() {
		if (true) { // Bad Design: Always evaluates to true
			// Bad Design: Empty If Statement
		}

		int x = 0;
		if (x < 3) {
			// Bad Design: Empty If Statement
		}
	}

	void method3() {
		// Bad Design: Empty Method
	}

	void method4() {
		int x = 10;
		x = x / 0; // Fault: DivisionByZeroException
	}
	
	void method5() {
		String text;
		int length = text.length(); // Fault: NullPointerException
	}

	void method6() {
		try {
			int[] numbers = new int[5];
			int result = 10 / 0; // Fault: Division by zero
		} catch (ArithmeticException e) {
			System.out.println("An exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An exception occurred"); 
		}
	}

}