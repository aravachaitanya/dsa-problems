package com.dsa.recursion.math;

/**
 * @author chaitanyaarava
 *
 */
public class findNthFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int number = 5;
		System.out.println("Fibonacci of " + number + " is :" + findFibonacciOfNumber(number));
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	private static int findFibonacciOfNumber(int number) {

		if (number < 2) {
			return 1;
		}
		return findFibonacciOfNumber(number - 1) + findFibonacciOfNumber(number - 2);
	}

}
