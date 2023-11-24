package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class FindNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 10, -1, 20, -3, 4, 6, 8 };

		int target = 20;

		System.out.println("Index Of the Number: " + findElement(nums, target));
	}

	private static int findElement(int[] nums, int target) {

		/**
		 * If No Elements in the array, then return -1.
		 */
		if (nums.length == 0) {
			return -1;
		}

		/**
		 * run a loop and, check each element with target.
		 */
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}

		return -1;
	}

}
