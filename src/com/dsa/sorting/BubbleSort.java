package com.dsa.sorting;

/**
 * @author chaitanyaarava
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 5, 4, 3, 2, 1 };

		System.out.print(" Array Before Sorting: ");
		printArray(arr);

		sortArray(arr);

		System.out.print(" Array After Sorting: ");
		printArray(arr);
	}

	/**
	 * 
	 * @param arr
	 */
	private static void sortArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					swapNums(j, j - 1, arr);
				}
			}
		}
	}

	/**
	 * 
	 * @param i
	 * @param j
	 * @param arr
	 */
	private static void swapNums(int i, int j, int[] arr) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	/**
	 * 
	 * @param arr
	 */
	private static void printArray(int[] arr) {

		for (int num : arr) {
			System.out.print(" " + num);
		}
		System.out.println();
	}

}
