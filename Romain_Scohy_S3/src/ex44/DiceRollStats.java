/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex44;
import ex51.PairOfDice;
import ex52.StatCalc;
/**
 *
 * @author Romano & Jules
 */
/**
 * Ce programme est basé sur le code de lexercice 4.4
 * La main renvoie pour un total de de dés donné en entrée,
 * le nombre de lancés nécessaire pour obtenir ce total.
 * On boucle cela sur "NUMBER_OF_EXPERIMENTS" (= 10 000 ici)
 * On ressort un affichage sur chaque total possible,
 * moyenne
 * Nb lancés effectués (ici 10000)
 * ecart type
 * max de lancés nécessaire pour trouver le total
 * 
 
 */

public class DiceRollStats {

   /**
    * The number of times that the experiment "roll for a given total"
    * is to be repeated.  The program performs this many experiments, and
    * prints the average of the result, for each possible roll value, 
    */
   public static final int NUMBER_OF_EXPERIMENTS = 10000;

   public static void main(String[] args) {
       //double average;  // The average number of rolls to get a given total.
       
       StatCalc sc = new StatCalc();
       
       System.out.println("Total On Dice     Average Number of Rolls");
       System.out.println("-------------     -----------------------");
       for ( int dice = 2;  dice <= 12;  dice++ ) {
           sc = getinfoRollCount(dice);
           System.out.printf("%10d%22.4f\n", dice, sc.getMean());
           System.out.println("Nb de de valeurs : "+sc.getCount());
           System.out.println("St DEV : " +sc.getStandardDeviation());
           System.out.println("Max : "+sc.getMax());
           System.out.println(" _______________________________ ");
       }
   } 
   

   
   /**
    * Simulates rolling a pair of dice until a given total comes up.
    * Precondition:  The desired total is between 2 and 12, inclusive.
    * @param N the total that we want to get on the dice
    * @return the number of times the dice are rolled before the
    *    desired total occurs
    * @throws IllegalArgumentException if the parameter, N, is not a number
    *    that could possibly come up on a pair of dice
    */
   public static int rollFor( int N ) {
       if ( N < 2 || N > 12 ){
           throw new IllegalArgumentException("Impossible total for a pair of dice.");
       }
       
        // DECLARATION
       int roll;        // Entier stockant la somme de 2 dés
       int rollCt;      // Compteur des lancés de dés nécessaires pour obtenir N
       rollCt = 0;
       do {
          PairOfDice paireDede = new PairOfDice(); // On crée une paire de dé 
          roll = paireDede.getTotal();
          rollCt++;
       } while ( roll != N );
       
       return rollCt;
   }
   
   public static StatCalc getinfoRollCount( int roll ) {
       int rollCountThisExperiment;  // Number of rolls in one experiment.
       
       StatCalc sc = new StatCalc();
       for ( int i = 0;  i < NUMBER_OF_EXPERIMENTS;  i++ ) {
          rollCountThisExperiment = rollFor( roll );
          sc.enter(rollCountThisExperiment);
       }
       return sc;
   }
}  // end DiceRollStats