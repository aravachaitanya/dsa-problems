/**
 * 
 */
package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Given an array of integers nums and an integer target, return indices of the
		 * two numbers such that they add up to target.
		 * 
		 * If there are multiple solutions then you may return the first found indices
		 * of targeted sum.
		 */

		int[] nums = { 2, 11, 15, 2, 7, 7 };
		int target = 9;

		ArrayUtil.printArrayElements(findTwoSum(nums, target), "Indices of two Sum: ");
	}

	/**
	 * This method is used to find the target SUM of two indices in an array.
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[] findTwoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] { -1, -1 };

	}

}
