package com.dsa.recursion.math;

/**
 * @author chaitanyaarava
 *
 */
public class ReverseNumber {

	static int reverse = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num = 23456;
		reverseGivenNumber(num);
	}

	/**
	 * 
	 * @param num
	 */
	private static void reverseGivenNumber(int num) {

		if (num == 0) {
			return;
		}

		int temp = num % 10;
		reverse = reverse * 10 + temp;

		reverseGivenNumber(num / 10);
		System.out.println(reverse);

	}

}
