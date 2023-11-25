package com.dsa.recursion.math;

/**
 * @author chaitanyaarava
 *
 */
public class FactorialOfNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int numberToFind = 5;

		System.out.println("Factorial Of Number " + numberToFind + ":" + findFactorial(numberToFind));
	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	private static int findFactorial(int num) {

		if (num == 1)
			return 1;

		return num * findFactorial(num - 1);
	}

}
