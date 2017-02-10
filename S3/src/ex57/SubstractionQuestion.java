/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex57;

/**
 *
 * @author Romano
 */
public class SubstractionQuestion implements IntQuestion{

    private int a, b;  // The numbers in the problem.

    public SubstractionQuestion() { // constructor
        a = (int)(Math.random() * 50 + 1);
        b = (int)(Math.random() * 50);
    }

    public String getQuestion() {
        return "What is " + a + " - " + b + " ?";
    }

    public int getCorrectAnswer() {
        return a - b;
    }
    public static void main(String[] args) {
        SubstractionQuestion a = new SubstractionQuestion();
        System.out.println(a.a);
    }
}
