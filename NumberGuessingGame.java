import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		Random randomInt = new Random();
		Scanner input = new Scanner(System.in);
		
		int num, guess;
		boolean bool = true;
		
		while(bool != false) {
			
			num = randomInt.nextInt(100);
			
			System.out.print("Guess a number between 0-100: ");
			
			guess = input.nextInt();
			
			while(guess != num) {
				if(num < guess) {
					System.out.print("Guess Lower: ");
					guess = input.nextInt();
				}
				else {
					System.out.print("Guess Higher: ");
					guess = input.nextInt();
				}
			}
			
			System.out.println("\n" + "You guessed it! The answer was " + num + "!\n");
			
		}
		input.close();
	}

}
