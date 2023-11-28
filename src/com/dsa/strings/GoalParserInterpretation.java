/**
 * 
 */
package com.dsa.strings;

/**
 * 
 *  Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".

 * @author chaitanyaarava
 *
 */
public class GoalParserInterpretation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String command = "G()(al)";
		System.out.println(" "+interpret(command));
	}

	/**
	 * 
	 * @param command
	 * @return
	 */
	public static String interpret(String command) {

		StringBuffer goalParser = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < command.length(); i++) {
			goalParser.append(String.valueOf(command.charAt(i)));
			switch (goalParser.toString()) {
			case "G":
				sb.append(goalParser.toString());
				goalParser = new StringBuffer();
				break;
			case "()":
				sb.append("o");
				goalParser = new StringBuffer();
				break;
			case "(al)":
				sb.append("al");
				goalParser = new StringBuffer();
			}

		}
		return sb.toString();
	}

}
