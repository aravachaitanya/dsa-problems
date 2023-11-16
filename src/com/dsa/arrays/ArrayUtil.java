package com.dsa.arrays;

/**
 * 
 * This class is for utility methods that is needed for solving array questions.
 * 
 * @author chaitanyaarava
 *
 */
public class ArrayUtil {
	
	/**
	 * This method will print all the elements from an array.
	 * 
	 * @param nums
	 * @param outputStr
	 */
	protected static void printArrayElements(int[] nums, String outputStr) {
		
		System.out.print(outputStr);
		
		for(int num: nums) {
			System.out.print(" "+num);
		}
		
		System.out.println("");
	}

}
