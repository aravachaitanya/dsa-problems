package com.dsa.linearsearch;

/**
 *  https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
 *  
 * @author chaitanyaarava
 *
 */
public class findNumberWithEvenDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = {12,345,2,6,7896};
		System.out.println("Total Number of Even Digits: "+findNumbers(nums));
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	private static int findNumbers(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			int numToCheck = nums[i];
			if (checkIfNumberHasEvenOrOddDigits(numToCheck)) {
				result++;
			}
		}
		return result;
	}

	/**
	 * 
	 * @param number
	 * @return
	 */
	private static boolean checkIfNumberHasEvenOrOddDigits(int number) {

		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count % 2 == 0 ? true : false;
	}

}
