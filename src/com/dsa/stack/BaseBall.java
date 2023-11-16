package com.dsa.stack;

/**
 * leetCode - https://leetcode.com/problems/baseball-game/description/
 * 
 * You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
 * You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
 * An integer x.
 * Record a new score of x.
 * '+'.
 * Record a new score that is the sum of the previous two scores.
 * 'D'.
 * Record a new score that is the double of the previous score.
 * 'C'.
 * Invalidate the previous score, removing it from the record.
 * Return the sum of all the scores on the record after applying all the operations.
 * 
 * 
 * @author chaitanyaarava
 *
 */
public class BaseBall {

	public static void main(String[] args) {
		
		/**
		 * 
		 * Sample Inputs: {"5","-2","4","C","D","9","+","+"}, {"1","C"}
		 * 
		 * 
		 */

		String[] str = {"1","C"};
		System.out.println("final Count on stack: " + calPoints(str));
	}

	/**
	 * This method will return final count on stack.
	 * 
	 * @param operations
	 * @return
	 */
	public static int calPoints(String[] operations) {

		StackImplementation sc = new StackImplementation();
		int finalCount = 0;
		for (String operation : operations) {

			if (StackConsts.PLUS.equalsIgnoreCase(operation)) {
				int total = 0;
				int lastElement = sc.peek();
				total += sc.peek();
				sc.pop();
				if (!sc.isEmpty()) {
					total += sc.peek();
				}
				sc.push(lastElement);
				sc.push(total);
			} else if (StackConsts.D.equalsIgnoreCase(operation)) {
				sc.push(sc.peek() * 2);
			} else if (StackConsts.C.equalsIgnoreCase(operation)) {
				sc.pop();
			} else {
				sc.push(Integer.valueOf(operation));
			}
		}

		while (!sc.isEmpty()) {
			finalCount += sc.peek();
			sc.pop();
		}

		return finalCount;
	}

}
