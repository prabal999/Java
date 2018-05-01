package com.ph.java.jdk.seven;
/**
 * Numerical literals are definitely eye strainers. 
 * I am sure you would start counting the zeroes like me 
 * if you’ve been given a number with, say, ten zeros. 
 * It’s quite error prone and cumbersome to identify a literal 
 * if it’s a million or a billion unless you count the places 
 * from right to left. Not anymore. 
 * 
 * Java 7 introduced underscores in identifying the places.
 * 
 * @author Prabal
 *
 */
public class NumericLiterals {

	public static void main(String[] args) {
		int thousand = 1_000;
		System.out.println(thousand);
		int million = 1_000_000;
		System.out.println(million);
	}

}
