/**
 * 
 */
package com.dsa.sorting;

/**
 * @author chaitanyaarava
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 5, 4, 3, 2, 1 };

		System.out.print("Arrays before sorting: ");
		printArr(nums);

		selectionSortImpl(nums);

		System.out.print("Arrays after sorting: ");
		printArr(nums);

	}

	/**
	 * 
	 * @param nums
	 */
	private static void selectionSortImpl(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			int currentMin = i;
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] < nums[i]) {
					currentMin = j;
				}
			}
			if (i != currentMin) {
				swapNums(i, currentMin, nums);
			}

		}

	}

	/**
	 * 
	 * @param initialIndex
	 * @param currentMaxIndex
	 * @param nums
	 */
	private static void swapNums(int initialIndex, int currentMaxIndex, int[] nums) {

		int temp = nums[initialIndex];
		nums[initialIndex] = nums[currentMaxIndex];
		nums[currentMaxIndex] = temp;
	}

	/**
	 * 
	 * @param nums
	 */
	private static void printArr(int[] nums) {
		for (int num : nums) {
			System.out.print(" " + num);
		}
		System.out.println();
	}

}
