/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionairegame;

import java.util.Scanner;

/**
 *
 * @author Oliver Soons and Gandhar Paranjape
 */

public class Introductory_Rules {
    
    public static String player;        

    
    void intro() {
        System.out.println("                           WELCOME TO WHO WANTS TO BE A MILLIONARE!");
        System.out.println("                                ENTER CONTESTANT NAME BELOW!");
        Scanner scanner = new Scanner(System.in);
        player = scanner.nextLine();
        
        System.out.println("                     " + "NICE TO MEET YOU "+ player.toUpperCase() + "!" + " HERE ARE THE RULES BELOW!" );
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        
        System.out.println("1. Simply type the character that matches the correct answer.");
        System.out.println("2. If you get the answer correct your prize will increase.");
        System.out.println("3. If you answer a question incorrectly your prize will fall to the last checkpoint.");
        System.out.println("4. You have 3 lifelines that will help you in answering questions.");
        System.out.println("   However you can only use each lifeline once.");
        System.out.println("5. Your 3 lifelines include: ");
        System.out.println(" ");
        System.out.println("                             a) (ata) - " + "Ask the Audience, a percentage of the audience");
        System.out.println("                                             choosing each specific option will be displayed");
        System.out.println("                             b) (paf) - " + "Phone a friend, your friend will give you the");
        System.out.println("                                             answer he thinks is correct.");
        System.out.println("                             c) (5050) - " + "5050, 2 incorrect options will be deleted,");
        System.out.println("                                             revealing one correct and one incorrect option.");
        System.out.println(" ");
        System.out.println("6. There are checkpoints at $5,000 and $50,000, if your score surpasses each checkpoint, "); 
        System.out.println("   you are guaranteed to recieve the prize of the each checkpoint respectively.");
        System.out.println("6. You can quit, by typing " + "(quit) " + "at any stage to take the prize you are currently sitting on."); 
        System.out.println(" ");        
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.println("                                PRESS ENTER TO BEGIN!");
        Scanner scanner1 = new Scanner(System.in);
        String userin = scanner1.nextLine();
        if ("" .equals(userin)){}
    }
}
