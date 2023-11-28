/**
 * 
 */
package com.dsa.strings;

/**
 * https://leetcode.com/problems/shuffle-string/
 * 
 * @author chaitanyaarava
 *
 */
public class ShuffleString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(" " + restoreString(s, indices));
	}

	/**
	 * 
	 * @param s
	 * @param indices
	 * @return
	 */
	public static String restoreString(String s, int[] indices) {
		char[] output = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			output[indices[i]] = s.charAt(i);
		}
		return String.valueOf(output);
	}

}
