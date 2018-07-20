/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionairegame;

import java.util.Scanner;
import static millionairegame.QuestionPool.answer;

/**
 *
 * @author gandharparanjape
 */
public class Game {
    
        public static int paf, ff, ata;
        public static String question, input;
        public static Boolean correct = null;
        public static int correctQ;
        public static int prize = 0;

    void Game () {
    do{
            if(correctQ == 15){                 //when player wins the game
                        System.out.println("Congratulations!");
                        System.out.println("You are our Grand Winner and take home a huge $1000000!!!");
                        System.out.println("Now you can afford avocado on toast.");
                        System.out.println(":)");
                        System.exit(0);
                    }
            
            PrizeLadder round = new PrizeLadder();
            round.getPrize(correctQ);
            
            correct = null;
            Scanner scan = new Scanner(System.in);
          
            System.out.println("You are currently sitting on $" + prize);
            System.out.println("Question Number: " + (correctQ + 1));
            System.out.println(" ");
            
            QuestionPool ask = new QuestionPool();
            ask.getQuestion();        
            QuestionPool present = new QuestionPool();
            present.QFormat();
            
        do{
            input = scan.nextLine();
            if(!input.equalsIgnoreCase("a") && !input.equalsIgnoreCase("b")&& !input.equalsIgnoreCase("c")&& !input.equalsIgnoreCase("d")&& !input.equalsIgnoreCase("quit")&& !input.equalsIgnoreCase("PAF")&& !input.equalsIgnoreCase("5050")&& !input.equalsIgnoreCase("ATA")){            System.out.println("Please enter a, b, c, d, ata, paf, 5050, or quit");
            }
            else if(input.equalsIgnoreCase(answer)){
                correct = true;
                System.out.println(" ");
                System.out.println("You answered correct! You advance to the next question!");
                System.out.println(" ");
                System.out.println("----------------------------------------------------------------------------------------------");
                correctQ++;
            }
            else if(input.equalsIgnoreCase("quit")){    
                PrizeLadder finish = new PrizeLadder();
                finish.getPrize(correctQ);
                System.out.println("You take home $" + prize + "!");
                System.exit(0);
            }
            else if(input.equalsIgnoreCase("PAF")){     //player calls phone a friend lifeline
                    if(paf == 0){
                        Lifelines lifeline = new Lifelines();
                        lifeline.phoneAFriend();
                        paf++;
                        
                    }else{
                        System.out.println("You have already used this life line.");
                        System.out.println(" ");
                        System.out.println("----------------------------------------------------------------------------------------------");
                    }
                }
                else if(input.equalsIgnoreCase("5050")){    //player calls 5050 lifeline
                    if(ff == 0){
                       Lifelines lifeline = new Lifelines();
                       lifeline.fiftyFifty();
                       ff++;
                       
                    }else{
                         System.out.println("You have already used this life line.");
                         System.out.println(" ");
                        System.out.println("----------------------------------------------------------------------------------------------");
                    }
                }
                else if(input.equalsIgnoreCase("ATA")){     //player calls the audience lifeline.
                    if(ata == 0){
                        Lifelines lifeline = new Lifelines();
                        lifeline.askTheAudience();
                        ata++;
                    }else{
                         System.out.println("You have already used this life line.");
                         System.out.println(" ");
                        System.out.println("----------------------------------------------------------------------------------------------");
                    }
                }
            else{
                correct = false;
                System.out.println("Incorrect");
                PrizeLadder finish = new PrizeLadder();
                finish.getPrize(correctQ);
            if(prize < 5000)
                    {
                        System.out.println("Unfortunately you have not won anything today.");
                    }else if(prize > 4999 && prize < 50000)         //first checkpoint
                    {
                        System.out.println("However, you still get a prize!");
                        System.out.println("You will take home $5000");
                    }else if(prize > 49999 && prize < 1000000)      //second checkpoint
                    {
                        System.out.println("However, you still get a prize!");
                        System.out.println("You will take home $50000");
                    }
                    
                }
        }while(correct == null);
        }while(correct != false && !input.equalsIgnoreCase("quit"));
    }
}
