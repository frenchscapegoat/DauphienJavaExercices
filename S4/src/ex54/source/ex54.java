/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex54.source;

import ex54.BlackjackHand;
import ex54.Card;
import ex54.Deck;
import java.util.Random;

/**
 *
 * @author Romano
 */
public class ex54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /* 
        
        On fait un println de la mian (ou des cartes de la main)
        Puis un println de BlackJackHand.getBlackjackValue()
        */
        
        // On crée un objet BlackjackHand ; puis un Deck
        BlackjackHand maMainBlackjackHand = new BlackjackHand();
        Deck monDeck = new Deck();
        
        
        // On crée un random entre 1 et 6
        Random r = new Random();
        final int borneSup = 6;
        final int borneMin = 2;
        int maVal = borneMin + r.nextInt(borneSup-borneMin);
        Card laCarte;
        
        // On récupère autant de carte du deck que le random vient de nous dire
        for (int i=0;i< maVal;i++){
            if (monDeck.cardsLeft() != 0){
                laCarte = monDeck.dealCard();   // Vous autorisez à créer des variables de lisibilité ?
                maMainBlackjackHand.addCard(laCarte);
            }
            
        // On fait un affichage de la main
        for (int j=0;i<maVal;i++){
            System.out.println("Ma main : "+ maMainBlackjackHand.getCard(j));
        }
        
        // On affiche le score
        System.out.println("Score Blackjack : "+ maMainBlackjackHand.getBlackjackValue());
        }
        
        
        
        
        
    }
    
}
