import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean playGame = true;
		int userGuess;
		int guessCount = 1;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 101);
		int gameCount = 1;
		int totalGuesses = 0;
		double avgGuesses;
		String replay;

		Scanner input = new Scanner(System.in);

		System.out.print("Guess a number (between 1 and 100): ");
		userGuess = input.nextInt();

		while (playGame) {
			if (userGuess < 1 || userGuess > 100) {
				System.out.print("Error! Number must be between 1 and 100\n");
				System.out.print("Guess a number (between 1 and 100): ");
				userGuess = input.nextInt();
			}
			if (userGuess == randomNum) {
				System.out.printf("Winner!! You guessed the secret number of %d in %d guesses \n", randomNum,
						guessCount);
				totalGuesses += guessCount;
				guessCount = 0;
				System.out.print("Do you wish to play again? (Y/N): ");
				replay = input.next();
				if (replay.equals("Y") || replay.equals("y")) {
					gameCount++;
					System.out.print("Guess a number (between 1 and 100): ");
					userGuess = input.nextInt();
				} else if (replay.equals("N") || replay.equals("n")) {
					System.out.println("Thank you for playing.");
					playGame = false;
				}
			} else if (userGuess < randomNum) {
				System.out.println("Too low. Guess again");
				guessCount++;
				System.out.print("Guess a number (between 1 and 100): ");
				userGuess = input.nextInt();
			} else if (userGuess > randomNum) {
				System.out.println("Too high. Guess again");
				guessCount++;
				System.out.print("Guess a number (between 1 and 100): ");
				userGuess = input.nextInt();
			}
		}
		avgGuesses = (totalGuesses / gameCount);
		System.out.printf("You played %d games.\n", gameCount);
		System.out.printf("You had %d total guesses and averaged %.2f guesses per game", totalGuesses, avgGuesses);
		input.close();
	}

}
