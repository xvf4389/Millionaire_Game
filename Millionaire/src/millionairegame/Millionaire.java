package millionairegame;

/**
 *
 * @author Oliver Soons and Gandhar Paranjape
 */

public class Millionaire {
    
    public static void main(String[] args) {
        
        Introductory_Rules intro = new Introductory_Rules();
        intro.intro();
        
        Game game = new Game ();
        game.Game();
    }
}