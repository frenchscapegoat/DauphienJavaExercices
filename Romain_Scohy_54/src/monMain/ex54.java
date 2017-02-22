package monMain;

import ex54.BlackjackHand;
import ex54.Card;
import ex54.Deck;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Romano
 */
public class ex54 {

	public static void main(String[] args) {

		// recommencer is used to add some "readability" in the do..while loop
		boolean recommencer = false; // Gain en lisibilité pour la boucle do..while
		Scanner sc = new Scanner(System.in);

		do{
			/* 
        The goal is to create 3 objects : a Deck, a Card from the deck which is add o the current hand and a BlackJackHand.

			 */

			BlackjackHand maMainBlackjackHand = new BlackjackHand();
			Deck monDeck = new Deck();
			Card laCarte;

			// We create a random integer between 1 and 6
			Random r = new Random();
			final int borneSup = 6;
			final int borneMin = 2;
			int maVal = borneMin + r.nextInt(borneSup-borneMin);



			monDeck.shuffle();

			/**
			 * First,
			 * We add the same number of card as the random "maVal" in our hand
			 */
			for (int i=0;i< maVal;i++){
				if (monDeck.cardsLeft() != 0){
					laCarte = monDeck.dealCard();
					maMainBlackjackHand.addCard(laCarte);
				}
			}

			/**
			 * Then,
			 * We print each card of our hand to the output and the score
			 */        
			for (int j=0;j<maMainBlackjackHand.getCardCount();j++){
				System.out.println("Ma main : "+ maMainBlackjackHand.getCard(j));
			}

			System.out.println("Score Blackjack : "+ maMainBlackjackHand.getBlackjackValue());

			/**
			 * Finally,
			 * We ask the user if he wants to start again
			 */
			System.out.println("Tapez 'o' si vous voulez continuer : ");
			recommencer = ("o".equals(sc.nextLine()));


		}while (recommencer);
	}

}
