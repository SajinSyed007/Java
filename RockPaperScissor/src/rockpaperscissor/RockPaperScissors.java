
package rockpaperscissor;


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.println("\nEnter your choice (rock, paper, or scissors). Type 'quit' to end the game:");
            String userChoice = scanner.nextLine().toLowerCase();

            if (userChoice.equals("quit")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            // Validate user input
            boolean isValid = false;
            for (String choice : choices) {
                if (choice.equals(userChoice)) {
                    isValid = true;
                    break;
                }
            }

            if (!isValid) {
                System.out.println("Invalid choice. Please enter 'rock', 'paper', or 'scissors'.");
                continue;
            }

            // Generate computer's choice
            int randomIndex = random.nextInt(choices.length);
            String computerChoice = choices[randomIndex];

            System.out.println("Your choice: " + userChoice);
            System.out.println("Computer's choice: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}

