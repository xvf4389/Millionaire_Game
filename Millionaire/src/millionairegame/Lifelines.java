/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionairegame;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import static millionairegame.QuestionPool.a;
import static millionairegame.QuestionPool.b;
import static millionairegame.QuestionPool.c;
import static millionairegame.QuestionPool.d;
import static millionairegame.QuestionPool.answer;
import static millionairegame.QuestionPool.question;
import static millionairegame.Introductory_Rules.player;

/**
 *
 * @author gandharparanjape
 */

public class Lifelines {
    
    private double ataA, ataB, ataC, ataD, ataT;

    /**
     *
     * Method for phone a friend lifeline,returns with a guess on the correct answer. 
     */
    public void phoneAFriend(){
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("You chose to Phone a Friend!");
        System.out.println("We will now call your designated friend and give them the question...");
        System.out.println("Here's their response: ");
        System.out.println("Hi there " + player + ", I think that the answer is " + answer + ". Hope that helps.");
    }
    
    /**
    *
    * Method if player chooses the 5050 lifeline eliminating 2 incorrect options.
    */
    public void fiftyFifty(){ 
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("You chose Fifty Fifty, two answers will be removed from the question!");
        System.out.println("Your question is: " + question);
        switch (answer) {
            case "a":
                System.out.println("a = " + a);
                System.out.println("b = ");
                System.out.println("c = " + c);
                System.out.println("d = ");
                break;
            case "b":
                System.out.println("a =");
                System.out.println("b = " + b);
                System.out.println("c = ");
                System.out.println("d = " + d);
                break;
            case "c":
                System.out.println("a = " + a);
                System.out.println("b =");
                System.out.println("c = " + c);
                System.out.println("d =");
                break;
            case "d":
                System.out.println("a =");
                System.out.println("b = " + b);
                System.out.println("c =");
                System.out.println("d = " + d);
                break;
            default:
                break;
        }
    }
        
    /**
     *
     * Method for ask the audience lifeline, returning a percentage of the audience who has voted for each option respectively.
     */
    public void askTheAudience() {
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("You chose ask the audience!");
        System.out.println("The audience members will now choose which answer they think is correct.");
        
        Random ataR = new Random();
        ataA = ataR.nextInt(50)+1;
        ataB = ataR.nextInt(50)+1;
        ataC = ataR.nextInt(50)+1;
        ataD = ataR.nextInt(50)+1;
        ataT = ataA + ataB + ataC + ataD;
        
        ataA = (70 / ataT) * ataA;
        ataB = (70 / ataT) * ataB;
        ataC = (70 / ataT) * ataC;
        ataD = (70 / ataT) * ataD;
        
        System.out.println("Here is what the audience thinks!");
        
        NumberFormat formatter = new DecimalFormat("#.00");
        
        switch (answer) {
            case "a":
                ataA = ataA + 30;
                System.out.println("A = " + formatter.format(ataA) + "%");
                System.out.println("B = " + formatter.format(ataB) + "%");
                System.out.println("C = " + formatter.format(ataC) + "%");
                System.out.println("D = " + formatter.format(ataD) + "%");
                break;
            case "b":
                ataB = ataB + 30;
                System.out.println("A = " + formatter.format(ataA) + "%");
                System.out.println("B = " + formatter.format(ataB) + "%");
                System.out.println("C = " + formatter.format(ataC) + "%");
                System.out.println("D = " + formatter.format(ataD) + "%");
                break;
            case "c":
                ataC = ataC + 30;
                System.out.println("A = " + formatter.format(ataA) + "%");
                System.out.println("B = " + formatter.format(ataB) + "%");
                System.out.println("C = " + formatter.format(ataC) + "%");
                System.out.println("D = " + formatter.format(ataD) + "%");
                break;
            case "d":
                ataD = ataD + 30;
                System.out.println("A = " + formatter.format(ataA) + "%");
                System.out.println("B = " + formatter.format(ataB) + "%");
                System.out.println("C = " + formatter.format(ataC) + "%");
                System.out.println("D = " + formatter.format(ataD) + "%");
                break;               
            default:
                break;
        }
}
}
