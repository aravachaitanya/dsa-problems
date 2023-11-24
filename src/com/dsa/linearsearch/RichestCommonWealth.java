package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class RichestCommonWealth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };

		System.out.println("Maximum Richest customer: " + maximumWealth(accounts));
	}

	/**
	 * 
	 * @param accounts
	 * @return
	 */
	public static int maximumWealth(int[][] accounts) {
		int currentMax = Integer.MIN_VALUE;
		for (int row = 0; row < accounts.length; row++) {
			int count = 0;
			for (int col = 0; col < accounts[row].length; col++) {
				count += accounts[row][col];
			}
			currentMax = count > currentMax ? count : currentMax;
		}
		return currentMax;
	}

}
