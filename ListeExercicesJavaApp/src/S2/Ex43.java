/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S2;

import com.sun.tracing.dtrace.ArgsAttributes;
import static java.lang.Math.random;

/**
 *
 * @author Romano
 */
public class Ex43 {
    
    /* On va écrire une fonction qui simule des lancés de 2 dés
    On passe en paramètres le total à atteindre (IllegalArgumentException si différent de 2->12)
    On renvoie le nb d'essaies nécesaires pour atteindre ce total
    Math.random()*(max-min)
    */
    
    public static int lancerde(int total){
        int cpt = 0;
        int totaltemp = 0;
        
        //Exception
        if (total<2 || total>12){
            IllegalArgumentException e = new IllegalArgumentException("Nombre doit etre compris entre 2 et 12");
            throw e;
    }
        
        // Lancé de dé
        while (totaltemp != total){
            int nombre1 = (int)(Math.random()*6+1);
            int nombre2 = (int)(Math.random()*6+1);
            
            totaltemp = nombre1+nombre2;
            cpt+=1;
        }
        return (cpt);
    }
    public static void main(String args[]){
        System.out.println("Compteur : " +lancerde(2));
        
        
    }
}
