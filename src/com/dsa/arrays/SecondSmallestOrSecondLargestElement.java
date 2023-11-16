package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class SecondSmallestOrSecondLargestElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = { 0, 1 };

		System.out.println("Second Smallest: " + findSecondSmallest(nums));

		System.out.println("Second Largest: " + findSecondLargest(nums));
	}

	/**
	 * This method is to find the second largest.
	 * 
	 * @param nums
	 * @return
	 */
	private static int findSecondLargest(int[] nums) {

		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];

			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}
		return secondLargest;
	}

	/**
	 * This method is used to find the second smallest from an array.
	 * 
	 * @param nums
	 */
	private static int findSecondSmallest(int[] nums) {

		int firstSmallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int num = nums[i];

			if (num < firstSmallest) {
				secondSmallest = firstSmallest;
				firstSmallest = num;
			} else if (num < secondSmallest && firstSmallest != num) {
				secondSmallest = num;
			}
		}
		return secondSmallest;

	}

}
