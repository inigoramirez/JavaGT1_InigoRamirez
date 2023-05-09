package indra.utils;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private static int goalNumber;
	private static boolean win;
	private static final int OPPORTUNITIES = 5;
	
	public static void GenerateNumber() {
		Random r = new Random();
		goalNumber = r.nextInt(1,100);
	}
	
	public static boolean CheckNumber(int number) {
		if(number == goalNumber) {
			System.out.println("Congrats! You guessed the number ;)");
			win = true;
			return true;
		}
		else {
			if(number < goalNumber) {
				System.out.println("Guess again! Your number is smaller than the goal");
			}
			else if(number > goalNumber) {
				System.out.println("Guess again! Your number is bigger than the goal");
			}
			return false;
		}
	}
	
	public static void InsertNumber(String prompt) {
		int guess;
		int opportunities = 0;
		@SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        do {
            System.out.println(prompt);
            guess = in.nextInt();
            opportunities++;
        }while(!CheckNumber(guess) && opportunities < OPPORTUNITIES);
        
        if(!win) {
        	System.out.println("You lose :(");
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateNumber();
		InsertNumber("Introduce a number. ¡Good luck!");
	}

}
