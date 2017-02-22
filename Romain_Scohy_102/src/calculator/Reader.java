package calculator;

import java.util.Scanner;

public class Reader {

	private Scanner sc;

	/**
	 * Uses a regular expression to verify the format
	 * 
	 * @return if the format is correct or not
	 */
	public void readSet() {
		sc = new Scanner(System.in);
		
		// theSet is a string which contains both sets
		String theSet = sc.nextLine();
		/**
		 * If the format is correct, it calculates the operation on sets, if
		 * not, it asks the user to try again
		 */
		if (verifySet(theSet)) {
			// we creat a new SetCalculator, which helps us to calculate the final set
			SetCalculator calculator = new SetCalculator();
			
			// We separate the
			calculator.separateSets(theSet);
			calculator.calculateOnTwoSets();

		} else {
			System.out.println("This is not a good format...please, try again");
			readSet();
			sc.close();
		}
		sc.close();
		return;

	}

	/**
	 * Using a regular expression
	 * http://www.ocpsoft.org/tutorials/regular-expressions/java-visual-regex-tester/
	 * Need to add a backslash to all backslashes to be ok with Java
	 */
	public static boolean verifySet(String theSet) {

		return theSet.matches("(\\[)((\\d+(\\,|\\])){1,})(\\s)(\\+|\\-|\\*)(\\s)(\\[)((\\d(\\,|\\])){1,})");
	}

}
