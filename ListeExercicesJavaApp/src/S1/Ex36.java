/*
Exercise 3.2 asked you to find the number in the range 1 to 10000 that has the largest number of divisors. You only had to print out one such number. Revise the program so that it will print out all numbers that have the maximum number of divisors. Use an array as follows: As you count the divisors for each number, store each count in an array. Then at the end of the program, you can go through the array and print out all the numbers that have the maximum count. The output from the program should look something like this:

Among integers between 1 and 10000,
The maximum number of divisors was 64
Numbers with that many divisors include:
   7560
   9240
 */
package S1;

/**
 *
 * @author Romano
 */
public class Ex36 {
    /*
    Le but c'est de trouver le nombre maximum de diviseurs que possède chaque nombre,
    parmi ce nombre de visieurs, trouve le plus grand,
    puis reparcourir la liste, en donnant les nombre qui ont le plus grand nombre de diviseurs.
    */
    public static void main(String args[]){
        
        int nbMaxDiviseur;
        int tabNbMaxDiviseurs[] = new int[10000];
        
        // On peut dire que pour l'instant, le plus grand diviseur de 1, c'est 1. Donc on a 1 nbMaxDiviseur !
        nbMaxDiviseur = 1;
        
        // On le stocke dans notre tableau au rang 0
        tabNbMaxDiviseurs[0] = nbMaxDiviseur;
        
        // On va parcourir les 9999 autres premiers entiers
        for(int i=2;i<=10000;i++){
            int nbDiviseurDei = 0;

            // On parcourt tous les diviseurs de i (on évite le 0)
            for (int j=1;j<=i;j++){
                if (i%j == 0){
                    nbDiviseurDei+=1;
                }
            }

            // On compare avec le max jusqu'à présent
            if (nbDiviseurDei>nbMaxDiviseur){
                nbMaxDiviseur = nbDiviseurDei;
            }
            
            // Enfin, on stocke dans le tableau, au range n-1
            tabNbMaxDiviseurs[i-1] = nbDiviseurDei;
        }
        
        // Enfin, on affiche le résultat
        System.out.println("Le nombre de diviseur le plus grand parmi les 10001 premiers entiers est : " + nbMaxDiviseur);
        
       // On parcourt tout notre tableau et on affiche si = nbmaxidivseurs 
        System.out.println("On peut donc retrouver "+nbMaxDiviseur+" diviseurs chez les entiers suivants");
       for (int k=0;k<tabNbMaxDiviseurs.length;k++){
           if (tabNbMaxDiviseurs[k] == nbMaxDiviseur){
               // On a stocké au rang k-1 ; il faut donc affiché la k+1e valeur !
               System.out.println(""+ k+1);
           }
       }
        
    }
    
}
