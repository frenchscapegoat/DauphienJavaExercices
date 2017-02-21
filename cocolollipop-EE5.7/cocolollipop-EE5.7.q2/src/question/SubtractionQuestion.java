package question;
import java.util.Random;

import typeOfQuestion.IntQuestion;

/**
 * Represent substraction question
 * 
 * @author Cocolollipop
 *
 */
public class SubtractionQuestion implements IntQuestion {
	private int a;
	private int b;

	public SubtractionQuestion() {
		int max = 100;
		int min = 2;
		Random number1 = new Random();
		Random number2 = new Random();
		/**
		 * choose a random number
		 */
		this.a = number1.nextInt(max - min + 1) + min;
		this.b = number2.nextInt(max - min + 1) + min;
		/**
		 * make sure that the answer is not negative
		 */
		if (a < b) {
			int temp = a;
			this.a = b;
			this.b = temp;
		}
	}

	/**
	 * Get the question
	 * @return quest the question
	 */
	@Override
	public String getQuestion() {
		String quest = ("What is the result of this subtraction:" + this.a + " - " + this.b);
		return quest;
	}
	/**
	 * Get the correct answer
	 * @return the correct answer
	 */
	@Override
	public int getCorrectAnswer() {

		return a - b;
	}

}
