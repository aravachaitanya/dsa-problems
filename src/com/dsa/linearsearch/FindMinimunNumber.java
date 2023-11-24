package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class FindMinimunNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 10, 9, 8, 7, 6, -1, 2, 3, 4 };

		System.out.println("Minimum Number in an array is: " + findMinNumber(nums));
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	private static int findMinNumber(int nums[]) {

		// Assign minimum Number with an Inter max value.
		int minNumber = Integer.MAX_VALUE;

		if (nums.length == 0) {
			return minNumber;
		}

		for (int i = 0; i < nums.length; i++) {
			// compare each number with minNumber, If the number is less assign minNumber to
			// it.
			if (nums[i] < minNumber) {
				minNumber = nums[i];
			}
		}
		return minNumber;

	}

}
