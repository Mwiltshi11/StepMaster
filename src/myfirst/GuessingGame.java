package myfirst;


import java.util.Scanner;
import java.util.Random;
public class GuessingGame 
{
	public static void main( String[] args )
	{
		
		Random rand = new Random();
		int numberToGuess = rand.nextInt (10) + 1;
		int numberOfTries = 3;
		int guess = 0;
		Scanner input= new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.println("I am thinking of a number from "
				+ "1 to 10. \nYou must guess what it is in three tries."); 	
			guess = input.nextInt();
		    if (guess == numberToGuess) {
			   System.out.println("Your guess is correct");
		    }
		    else if (guess< numberToGuess) { 
			   System.out.println("Your guess is wrong");
		    }
			else if (guess > numberToGuess) { 
			   System.out.println("Yourguess is wrong");
		   }
			
			}
		  	if (guess != numberToGuess) {
			 System.out.println("Game Over");
		  }
		    if (guess == numberToGuess) {
		     System.out.println("You Win");
		    
		    }
		}
		}
		