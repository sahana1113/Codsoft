import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberOfAttempts = 5; // Change this value as needed
        int roundsWon = 0;

        do {
            int targetNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            System.out.println("Welcome to the Number Game!");
            System.out.println("Guess the number between " + lowerBound + " and " + upperBound);

            for (int attempt = 1; attempt <= numberOfAttempts; attempt++) {
                System.out.print("Attempt " + attempt + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    roundsWon++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low. Try again!");
                } else {
                    System.out.println("Too high. Try again!");
                }

                if (attempt == numberOfAttempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + targetNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Rounds won: " + roundsWon);
    }
}
