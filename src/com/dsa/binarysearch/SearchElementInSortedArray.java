package com.dsa.binarysearch;

/**
 * @author chaitanyaarava
 *
 */
public class SearchElementInSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int targetElement = 10;
		System.out.println(" "+ findTargetElementUsingBinarySearch(nums, targetElement));

	}

	private static int findTargetElementUsingBinarySearch(int[] nums, int targetElement) {

		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int midElemet = (start + end) / 2;

			if (nums[midElemet] == targetElement) {
				return midElemet;
			} else if (targetElement < nums[midElemet]) {
				end = midElemet - 1;
			} else {
				start = midElemet + 1;
			}
		}
		return -1;
	}

}
