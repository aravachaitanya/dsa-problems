package com.dsa.stack;

import java.util.Stack;

/**
 * @author chaitanyaarava
 *
 */
public class ValidParanthesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Is Valid Paranthesis: "+isValid("({{))"));
	}
	
	/**
	 * This method is used to find if the string has valid parenthesis or not.
	 * 
	 * @param str
	 * @return
	 */
	private static boolean isValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : str.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}
		return stack.isEmpty();
	}

}
