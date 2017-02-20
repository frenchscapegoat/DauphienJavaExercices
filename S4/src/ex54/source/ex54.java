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
import java.util.Scanner;

/**
 *
 * @author Romano
 */
public class ex54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean recommencer = false; // Gain en lisibilité pour la boucle do..while
        Scanner sc = new Scanner(System.in);
        
        do{
        /* 
        
        On fait un println de la main (ou des cartes de la main)
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
        
        // On va mélanger le deck
        monDeck.shuffle();
        
        // On récupère autant de carte du deck que le random vient de nous dire
        for (int i=0;i< maVal;i++){
            if (monDeck.cardsLeft() != 0){
                laCarte = monDeck.dealCard();   // Vous autorisez à créer des variables de lisibilité ?
                maMainBlackjackHand.addCard(laCarte);
            }
        }
            
        // On fait un affichage de la main
        for (int j=0;j<maMainBlackjackHand.getCardCount();j++){
            System.out.println("Ma main : "+ maMainBlackjackHand.getCard(j));
        }

        // On affiche le score
        System.out.println("Score Blackjack : "+ maMainBlackjackHand.getBlackjackValue());
        
        
        // On demande si le joueur veut continuer
            System.out.println("Tapez 'o' si vous voulez continuer : ");
            recommencer = ("o".equals(sc.nextLine()));
            
        
    }while (recommencer);
        
        
        
    }
    
}
