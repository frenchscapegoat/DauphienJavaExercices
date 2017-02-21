package quizzManager;
import java.util.Scanner;

import typeOfQuestion.AdditionQuestion;
import typeOfQuestion.IntQuestion;
import typeOfQuestion.SubtractionQuestion;

/**
 * EXERCICE 5.7 (EXERCICE 4.7 improved) so that it administers a quiz with
 * several different kinds of questions (addition questions and subtraction questions).
 * 
 * @see http://math.hws.edu/eck/cs124/javanotes7/c5/exercises.html
 * @author Cocolollipop
 * @see https://github.com/Cocolollipop/s2-java-exercises/tree/master/S2-EE4-7/src/QuizzExercise.java
 * 
 */
public class Quizz {

	private IntQuestion[] listOfQuestions;
	private int[] listUserAnswers;

	/**
	 * Creates the quizz
	 */
	private void createTheQuizz() {
		listOfQuestions = new IntQuestion[10];
		listUserAnswers = new int[10];
		/**
		 * Create the list of questions
		 */
		for (int i = 0; i < listUserAnswers.length; i++) {
			/**
			 * We will have an addition question for pair question and
			 * subtraction question for impair question
			 */
			if (i % 2 == 0)
				listOfQuestions[i] = new AdditionQuestion();
			else
				listOfQuestions[i] = new SubtractionQuestion();
		}

	}

	/**
	 * Asks the user all ten questions and get the user's answers. After asking
	 * all the questions, the user should print each question again, with the
	 * user's answer.
	 */
	private void adminQuizz() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < listOfQuestions.length; i++) {
			// Ask the question
			System.out.println(listOfQuestions[i].getQuestion());
			int answer = sc.nextInt();
			// puts the answers in listUserAnswers
			listUserAnswers[i] = answer;
			// If the user is right
		}
		sc.close();
	}

	/**
	 * Prints each question again tell the user their score on the quiz, where
	 * each correct answer counts for ten point
	 */
	private void gradeTheQuizz() {
		// good answers's counter
		int cptGoodAnswer = 0;
		System.out.println("Récap:");
		for (int i = 0; i < listUserAnswers.length; i++) {
			System.out.print("A la Question " + (i + 1) + listOfQuestions[i].getQuestion() + " Vous avez répondu: "
					+ listUserAnswers[i] + "! ");
			if (listUserAnswers[i] == listOfQuestions[i].getCorrectAnswer()) {
				System.out.println("Bonne réponse");
				cptGoodAnswer++;
			}
			// if the user is wrong
			else {
				System.out.println("Zut alors! La bonne réponse était:" + listOfQuestions[i].getCorrectAnswer());
			}
		}
		cptGoodAnswer = cptGoodAnswer * 10;
		System.out.println("Vous avez obtenu: " + cptGoodAnswer + " points");

	}

	public static void main(String[] args) {

		Quizz test = new Quizz();
		System.out.println("EE-5.7");
		test.createTheQuizz();
		test.adminQuizz();
		test.gradeTheQuizz();

	}

}
