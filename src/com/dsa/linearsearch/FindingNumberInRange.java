package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class FindingNumberInRange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = {10, 20, 30, -3, 2, 5, 9};
		int target = 9;
		int startIndex = 1;
		int endIndex = 8;
		System.out.println("Target number exists at the Index: "+findNumberInRange(nums, target, startIndex, endIndex));
	}
	
	/**
	 * 
	 * @param nums
	 * @param target
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private static int findNumberInRange(int[] nums, int target, int startIndex, int endIndex) {
		
		// check for base condition, If array is empty just return -1.
		if(nums.length == 0) {
			return -1;
		}
		
		/**
		 * Handle if startIndex/endIndex is passed correctly, If not return -1.
		 */
		if(startIndex > nums.length || endIndex > nums.length) {
			return -1;
		}
		
		/**
		 * loop through the array and check if the target  in the array. 
		 */
		for(int i= startIndex; i < endIndex; i++) {
			if(nums[i] == target) {
				 return i;
			}
		}
		return -1;
	}

}
