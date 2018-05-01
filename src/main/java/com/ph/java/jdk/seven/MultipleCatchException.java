package com.ph.java.jdk.seven;

/**
 * There are a couple of improvements in the exception handling area. Java 7
 * introduced multi-catch functionality to catch multiple exception types using
 * a single catch block.
 * 
 * @author Prabal
 *
 */
public class MultipleCatchException {
	public static void main(String[] args) {
		MultipleCatchException mce = new MultipleCatchException();
		mce.oldCatchException();
		mce.newCatchException();
	}

	// An old, prior to Java 7 approach to handle multiple exceptions.
	private void oldCatchException() {
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// What Java 7 provides us:
	private void newCatchException() {
		//
		try {
			int array[] = new int[10];
			array[10] = 30 / 0;
		}
		// Compile-time error: The exception ArithmeticException is already caught by
		// the alternative Exception
		// So here, in case when your are catching multiple exceptions,
		// follow the rule of generalized to more specialized. It means that,
		// if you are using super (general) class, don't use child (specialized) class.
		catch (/* Exception | */ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
