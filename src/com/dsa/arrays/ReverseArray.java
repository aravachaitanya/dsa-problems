package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4};

		ArrayUtil.printArrayElements(reverseAnArray(nums), "Array after reversal: ");
	}

	/**
	 * This method is used to reverse an array without extra space
	 * 
	 * @param nums
	 */
	private static int[] reverseAnArray(int[] nums) {

		int start = 0;
		int end = nums.length - 1;

		while (start < end) {

			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;

		}
		return nums;
	}

}
