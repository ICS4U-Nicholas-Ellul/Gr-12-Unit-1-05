/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This is a dice roll guessing game.
 *
 ****************************************************************************/
 
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

class Main {
 	

    public static void main(String[] args) throws IOException { 
    	
    	int userGuess;
    	int randomNumber;
    	int guessesMade = 1;
        Random rnd = new Random();
        Scanner reader = new Scanner(System.in);
        
        randomNumber = rnd.nextInt(6) +1;
        
	    System.out.println("The dice rolls. It lands on...(1-6)?");
	    while(true){
	        try {
	            userGuess = reader.nextInt();
	            
	           	if(userGuess == randomNumber){
	           		System.out.println("Correct!");
	           		System.out.println("You guessed it in " + guessesMade + " rolls.");
	           		break;
	            }
	            else{
	           		System.out.println("Nope, guess again!");
	           		guessesMade = guessesMade + 1;
	            }
	            
	        } catch(NumberFormatException nfe) {
	            System.err.println("Invalid input!");
	        }
        }
        System.out.println();
        System.out.println("Done.");
    }

}
