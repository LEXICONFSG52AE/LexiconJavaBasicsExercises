import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(500) + 1; // Generates a random number between 1 and 500
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int numberOfGuesses = 0;

        System.out.println("Guess the number between 1 and 500:");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < targetNumber) {
                System.out.println("Your guess was too small.");
            } else if (guess > targetNumber) {
                System.out.println("Your guess was too big.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " in " + numberOfGuesses + " guesses.");
            }
        }
    }
}
