package S1;
// http://math.hws.edu/eck/cs124/javanotes7/c3/exercises.html
// https://github.com/oliviercailloux/java-course/blob/master/Course%20Object/Planning.adoc

import java.util.Scanner;

public class Ex34 {
	public static void main(String[] args){
            
		/* Idée 
            On va d'abord récupérer le string avec un scanner
            Puis on va parcours chaque lettre avec charAt
            Quand on tombe sur une lettre (d'après enoncé, on peut utiliser isLetter()), on l'affiche avec print
            Pas println sinon CR à chaque lettre
            Quand on tombe sur un espace, on fait un println
            */
            String str;
            Scanner sc;
            char monChar;
            
            sc = new Scanner(System.in);
            System.out.println("Svp, rentrez une phrase ");
            
            str = sc.nextLine();
            
            for(int i=0;i<str.length();i++){
                monChar = str.charAt(i);
                
                if(Character.isLetter(monChar)){
                    System.out.print(monChar);
                }
                else{
                    System.out.println();
                }
            }
            
                
	}
}
