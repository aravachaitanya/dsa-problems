package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class FindNumberUsing2DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] nums = { { 10, 20, 30 }, { 5, 7, 8, 9, 11 }, { 1, 4, 21, 7 }

		};
		int target = 21;
		
		int[][] targetArr = searchElementsIn2DArray(nums, target);
		printElementsInArray(targetArr);
	}

	/**
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	private static int[][] searchElementsIn2DArray(int[][] nums, int target) {

		if (nums.length == 0) {
			return new int[][] { { -1, -1 } };
		}

		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				if (nums[row][col] == target) {
					return new int[][] { { row, col } };
				}
			}
		}

		return new int[][] { { -1, -1 } };
	}
	
	/**
	 * This method is used to print the elements in the array.
	 * @param nums
	 */
	private static void printElementsInArray(int[][] nums) {
		
		System.out.print("Indexes in the array are: ");
		for(int row = 0; row < nums.length; row++) {
			for(int col = 0; col < nums[row].length; col++) {
				System.out.print(" "+nums[row][col]);
			}
		}
	}

}
