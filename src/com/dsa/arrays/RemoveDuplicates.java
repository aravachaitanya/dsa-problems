package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		ArrayUtil.printArrayElements(removeDuplicatesFromArray(nums), "removing duplicates from array: ");

		int[] nums1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

		ArrayUtil.printArrayElements(removeTargetedElement(nums1, 3), "removing Targeted element from an array: ");

	}

	/**
	 * This method will remove the targeted element from array and return an array
	 * without targeted element.
	 * 
	 * Time Complexity: O(n)
	 * 
	 * @param nums1
	 * @param target
	 */
	private static int[] removeTargetedElement(int[] nums, int target) {

		int initialIndex = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != target) {
				nums[initialIndex++] = nums[i];
			}
		}

		for (int i = initialIndex; i < nums.length; i++) {
			nums[initialIndex++] = 0;
		}

		return nums;

	}

	/**
	 * This method will remove duplicates from an array and return array with NO
	 * duplicates.
	 * 
	 * Time Complexity: O(n)
	 * 
	 * @param nums
	 * @return
	 */
	private static int[] removeDuplicatesFromArray(int[] nums) {

		/**
		 * If there are no elements in the array return the same array
		 */
		if (nums.length == 0) {
			return nums;
		}

		int intialIndexCount = 1;

		/**
		 * Iterate through the array and check if the current element is greater than
		 * previous element If the condition is satisfied, We add the number to
		 * intialIndexCount.
		 */
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				nums[intialIndexCount++] = nums[i];
			}
		}

		/**
		 * To remove all the other elements, We are setting it to 0.
		 */
		for (int i = intialIndexCount; i < nums.length; i++) {
			nums[intialIndexCount++] = 0;
		}

		return nums;

	}

}
