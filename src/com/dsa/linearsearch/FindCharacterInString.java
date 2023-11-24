package com.dsa.linearsearch;

/**
 * @author chaitanyaarava
 *
 */
public class FindCharacterInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "learning dsa";
		char targetChar = 'a';

		System.out
				.println("Character " + targetChar + " exists in strinhg: " + checkIfCharacterExists(str, targetChar));
	}

	/**
	 * 
	 * @param str
	 * @param targetChar
	 * @return
	 */
	private static boolean checkIfCharacterExists(String str, char targetChar) {

		/**
		 * If the string is empty, We return false at first place.
		 */
		if (str.length() == 0) {
			return false;
		}

		/**
		 * loop through each character and check if the character matches with target.
		 */
		for (char c : str.toCharArray()) {
			if (c == targetChar) {
				return true;
			}
		}

		return false;
	}
}
