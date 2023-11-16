/**
 * 
 */
package com.dsa.arrays;

/**
 * @author chaitanyaarava
 *
 */
public class ArrayConcatenation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] nums = {1,2,1};
		ArrayUtil.printArrayElements(getArrayConcatenation(nums), "Array after concatenation: ");
	}

	/**
	 * This method is used to concatenate the array.
	 * 
	 * Time Complexity: O(n)
	 * @param nums
	 * @return
	 */
	private static int[] getArrayConcatenation(int[] nums) {

		int[] outputArr = new int[nums.length * 2];
		
		for(int i=0; i< nums.length; i++) {
			outputArr[i] = nums[i];
			outputArr[i + nums.length] = nums[i];
		}
		return outputArr;
	}

}
