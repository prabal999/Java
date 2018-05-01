package com.ph.java.jdk.seven;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Improved Type Inference for Generic Instance Creation (Diamond)
 * 
 * @author Prabal
 *
 */

public class Diamond {

	// We can create class variables using Diamond.
	private static Map<String, List<String>> classVariable = new HashMap<>();

	public static void main(String[] args) {
		// We can create local variables using Diamond.
		Map<String, List<String>> localVariable = new HashMap<>();

		// we can pass by reference to a method.
		Diamond d1 = new Diamond();
		d1.testMethod(localVariable, classVariable);
	}

	public void testMethod(Map<String, List<String>> classVariable, Map<String, List<String>> localVariable) {
		System.out.println(" class:" + classVariable + "\n local:" + localVariable);
	}
}
