package com.dsa.recursion.math;

/**
 * @author chaitanyaarava
 *
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 98765;
		System.out.println("Sum Of digits for " + num + " :" + findSumOfNumber(num));
	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	private static int findSumOfNumber(int num) {

		if (num == num % 10) {
			return num;
		}

		return num % 10 + findSumOfNumber(num / 10);
	}

}
