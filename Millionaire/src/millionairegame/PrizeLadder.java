/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionairegame;


/**
 *
 * @author Oliver Soons and Gandhar Paranjape
 */
public class PrizeLadder {
    
        public static int prize = 0;

    
    int getPrize(int correctQ){
        switch (correctQ) {
            case 1:
                prize = 500;
                break;
            case 2:
                prize = 1000;
                break;
            case 3:
                prize = 2000;
                break;
            case 4:
                prize = 3000;
                break;
            case 5:
                prize = 5000;
                break;
            case 6:
                prize = 7500;
                break;
            case 7:
                prize = 10000;
                break;
            case 8:
                prize = 15000;
                break;
            case 9:
                prize = 25000;
                break;
            case 10:
                prize = 50000;
                break;
            case 11:
                prize = 75000;
                break;
            case 12:
                prize = 150000;
                break;
            case 13:
                prize = 250000;
                break;
            case 14:
                prize = 500000;
                break;
            case 15:
                prize = 1000000;
                break;
            default:
                break;
        }
        return prize;
    }
}
