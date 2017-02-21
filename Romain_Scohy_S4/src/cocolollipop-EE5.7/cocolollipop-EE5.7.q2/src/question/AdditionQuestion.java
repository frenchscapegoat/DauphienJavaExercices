package question;



import java.util.Random;

import typeOfQuestion.IntQuestion;

/**
 * Represent addition question
 * 
 * @author Cocolollipop
 *
 */
public class AdditionQuestion implements IntQuestion{
	private int a;
	private int b;
	
	public AdditionQuestion(){
		int max = 100;
		int min = 2;
		Random number1 = new Random();
		Random number2 = new Random();
	// puts the random numbers in an array
		this.a = number1.nextInt(max - min + 1) + min;
		this.b = number2.nextInt(max - min + 1) + min;
		
	}

	@Override
	public String getQuestion() {
		String quest = ("What is the result of this addition:" + this.a +" + " + this.b);
		return quest;
	}

	@Override
	public int getCorrectAnswer() {
		
		return a+b;
	}

}
