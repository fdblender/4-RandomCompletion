/* Complete the following program so that it creates a random die roll 
 * (random numbers from 1 to 6).
 * import java.util.Random;
 */

import java.util.Random;

public class DiceRoller 
 {
    public static void main( String[] args )
    {
        int dienumber;
        Random rnd = new Random();
        
        dienumber = 1 + rnd.nextInt(6);
        
        System.out.println("Your die roll was : " + dienumber);
    }
 }
