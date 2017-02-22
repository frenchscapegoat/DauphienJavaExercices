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
        The goal is to create 2 objects : a Deck and a BlackJackHand.
        
        */
        
        // On crée un objet BlackjackHand ; puis un Deck
        BlackjackHand maMainBlackjackHand = new BlackjackHand();
        Deck monDeck = new Deck();
        
        
        // On crée un random entre 1 et 6
        // We create a random integer between 1 and 6
        Random r = new Random();
        final int borneSup = 6;
        final int borneMin = 2;
        int maVal = borneMin + r.nextInt(borneSup-borneMin);
        
        Card laCarte;
        
        // On va mélanger le deck
        monDeck.shuffle();
        
        /**
         * First,
         * We add the same number of card as the random "maVal" in our hand
        */
        // On récupère autant de carte du deck que le random vient de nous dire
        for (int i=0;i< maVal;i++){
            if (monDeck.cardsLeft() != 0){
                laCarte = monDeck.dealCard();   // Vous autorisez à créer des variables de lisibilité ?
                maMainBlackjackHand.addCard(laCarte);
            }
        }
        
        /**
         * Then,
         * We print each card of our hand to the output and the score
        */
        // On fait un affichage de la main
        for (int j=0;j<maMainBlackjackHand.getCardCount();j++){
            System.out.println("Ma main : "+ maMainBlackjackHand.getCard(j));
        }

        // On affiche le score
        System.out.println("Score Blackjack : "+ maMainBlackjackHand.getBlackjackValue());
        
        /**
         * Finally,
         * We ask the user if he wants to start again
        */
        // On demande si le joueur veut continuer
            System.out.println("Tapez 'o' si vous voulez continuer : ");
            recommencer = ("o".equals(sc.nextLine()));
            
        
    }while (recommencer);
        
        
        
    }
    
}
