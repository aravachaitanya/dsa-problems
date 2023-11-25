/**
 * 
 */
package com.dsa.recursion.math;

/**
 * @author chaitanyaarava
 *
 */
public class CountZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int count = countZerosInNumber(203040, 0);
		System.out.println("Zeros in given number: " + count);
	}

	/**
	 * 
	 * @param num
	 * @param count
	 * @return
	 */
	private static int countZerosInNumber(int num, int count) {

		if (num == 0) {
			return count;
		}

		if (num % 10 == 0) {
			return countZerosInNumber(num / 10, ++count);
		}

		return countZerosInNumber(num / 10, count);
	}

}
