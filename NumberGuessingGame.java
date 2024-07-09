
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int score = 0;
        
        boolean playAgain = true;
        
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Guess a number between " + minRange + " and " + maxRange + ":");
            
            while (true) {
                int userGuess = scanner.nextInt();
                attempts++;
                
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    score += attempts;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Too low. Try again:");
                } else {
                    System.out.println("Too high. Try again:");
                }
            }
            
            System.out.println("Your current score is: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            String playChoice = scanner.next();
            
            if (!playChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
            } else {
                attempts = 0;
            }
        }
        
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}


