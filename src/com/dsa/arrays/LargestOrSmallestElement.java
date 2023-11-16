package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class LargestOrSmallestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * Given an array nums of n integers . Find the maximum number or minimum number from an array.
		 */

		int[] nums = { 10, -1, 100, 3, 6, 99 };
		
		String targetLargest = "Largest";

		System.out.println(targetLargest+" element in the array: " + findLargestOrSmallestElement(nums, targetLargest));
		
		String targetSmallest = "Smallest";

		System.out.println(targetSmallest+" element in the array: " + findLargestOrSmallestElement(nums, targetSmallest));
	}

	/**
	 * This method is used to find the largest/smallest element in the array.
	 * 
	 * TimeComplexity: O(n)
	 * 
	 * @param nums
	 * @param target 
	 * @return
	 */
	private static int findLargestOrSmallestElement(int[] nums, String target) {

		if (nums.length == 0) {
			return -1;
		}

		int maxElement = nums[0];
		int minElement = nums[0];

		for (int i = 1; i < nums.length; i++) {
			
			if (nums[i] > maxElement && "Largest".equalsIgnoreCase(target)) {
				maxElement = nums[i];
			}
			
			if (nums[i] < minElement && "Smallest".equalsIgnoreCase(target)) {
				minElement = nums[i];
			}
		}
		return "Largest".equalsIgnoreCase(target) ? maxElement : minElement;
	}

}
