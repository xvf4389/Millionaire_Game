/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionairegame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author Oliver Soons and GandharParanjape
 */

public class textfile {
    
        public static int prize = 0;

    
    static String readplayerscore(String a) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("PlayerScore.txt");
        String s;
        try (BufferedReader br = new BufferedReader(fr)) {
            s = "";
            s=br.readLine();
        }
        return s;
    }

    private void writeplayerscore(String abc) throws FileNotFoundException, UnsupportedEncodingException {
        try (PrintWriter writeText = new PrintWriter("PlayerScore.txt", "UTF-8")) {
            writeText.println("Player Score: " + prize);
        }
                throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    public static void main (String[] args) throws IOException {
        textfile readtext = new textfile();
        readtext.readplayerscore("abc");
        
        textfile writetext = new textfile();
        writetext.writeplayerscore("abc");
    }
    
}