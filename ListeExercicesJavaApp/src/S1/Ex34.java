package S1;
// http://math.hws.edu/eck/cs124/javanotes7/c3/exercises.html
// https://github.com/oliviercailloux/java-course/blob/master/Course%20Object/Planning.adoc

/*
Write a program that reads one line of input text and breaks it up into words. The words should be output one per line. A word is defined to be a sequence of letters. Any characters in the input that are not letters should be discarded. For example, if the user inputs the line

He said, "That's not a good idea."

then the output of the program should be

He
said
That
s
not
a
good
idea

An improved version of the program would list "that's" as a single word. An apostrophe can be considered to be part of a word if there is a letter on each side of the apostrophe.

To test whether a character is a letter, you might use (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')
However, this only works in English and similar languages
A better choice is to call the standard function Character.isLetter(ch), which returns a boolean value of true if ch is a letter and false if it is not
This works for any Unicode character
*/

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
