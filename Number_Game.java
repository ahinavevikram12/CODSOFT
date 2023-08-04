package Task_1;

import java.util.Random;
import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int minNumber = 1;
        int maxNumber = 100;
        int maxAttempts = 10;
        int score = 0;

        System.out.println("Enter To The Number game............");

        boolean repeat = true;
        while (repeat) {
            int Result = random.nextInt(maxNumber - minNumber + 1) + minNumber;
            int attempts = 0;
            boolean correctGuess = false;

            System.out.println("Guess a number between " + minNumber + " & " + maxNumber + ".");

            while (!correctGuess && attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == Result) {
                    System.out.println("Congratulations----- You guessed the correct number (" + Result + ") in " + attempts + " attempts.");
                    correctGuess = true;
                    score++;
                } else if (guess < Result) {
                    System.out.println("Too low! retry...");
                } else {
                    System.out.println("Too high! retry...");
                }
            }

            if (!correctGuess) {
                System.out.println("Unfortunately you've reached the maximum number of attempts. The correct number was: " + Result);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = sc.next();
            repeat = playAgain.equalsIgnoreCase("yes");
        }

        System.out.println("Game End! Your final score is: " + score);
     sc.close() ;  
    }
}
