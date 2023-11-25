/**
 * 
 */
package com.dsa.recursion.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class FindElementInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 2, 6, 10, 39, 43, 67 };
		int targetElemet = 43;

		System.out.println("Element Found at following index: "+findElementInArray(nums, targetElemet));
	}

	/**
	 * 
	 * @param nums
	 * @param targetElemet
	 * @return
	 */
	private static int findElementInArray(int[] nums, int targetElement) {

		if (nums.length == 0) {
			return -1;
		}

		int start = 0;
		int end = nums.length - 1;
		int targetIndex = -1;

		return findElementInArrayHelper(nums, start, end, targetIndex, targetElement);
	}

	/**
	 * 
	 * @param nums
	 * @param start
	 * @param end
	 * @param targetIndex
	 * @return
	 */
	private static int findElementInArrayHelper(int[] nums, int start, int end, int targetIndex, int targetElement) {

		while(start < end) {
			
			if(nums[start] == targetElement) {
				return start;
			} else {
				return findElementInArrayHelper(nums, start + 1, end, targetIndex, targetElement);
			}
		}
		return targetIndex;
	}

}
