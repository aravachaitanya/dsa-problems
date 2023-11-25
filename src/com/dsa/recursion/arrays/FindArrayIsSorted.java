/**
 * 
 */
package com.dsa.recursion.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class FindArrayIsSorted {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		System.out.println(isArraySorted(nums));
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	private static boolean isArraySorted(int[] nums) {

		if (nums.length == 0) {
			return true;
		}

		int start = 0;
		int end = nums.length - 1;
		boolean isSorted = true;

		return isArraySortedHelper(nums, start, end, isSorted);
	}

	/**
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @param isSorted
	 * @return
	 */
	private static boolean isArraySortedHelper(int[] nums, int start, int end, boolean isSorted) {

		if (start < end) {
			if (nums[start] < nums[start + 1]) {
				return isArraySortedHelper(nums, start + 1, end, isSorted);
			} else {
				return !isSorted;
			}
		}
		return isSorted;
	}

}
