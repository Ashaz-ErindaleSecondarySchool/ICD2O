package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of games you want to play: ");
        int totalGames = scanner.nextInt();

        int playerScore = 0;
        int computerScore = 0;
        int ties = 0;

        for (int i = 0; i < totalGames; i++) 
        {
            System.out.println("\nGame " + (i + 1) + ":");
            System.out.println("Enter your move: (0 = Rock, 1 = Paper, 2 = Scissors)");
            int playerMove = scanner.nextInt();

            while (playerMove < 0 || playerMove > 2)
            {
                System.out.println("Invalid input. Please enter 0, 1, or 2.");
                playerMove = scanner.nextInt();
            }

            int computerMove = random.nextInt(3);
            System.out.println("Computer's move: " + (computerMove == 0 ? "Rock" : computerMove == 1 ? "Paper" : "Scissors"));

            if (playerMove == computerMove) 
            {
                System.out.println("It's a tie!");
                ties++;
            } 
            
            else if ((playerMove == 0 && computerMove == 2) ||
                       (playerMove == 1 && computerMove == 0) ||
                       (playerMove == 2 && computerMove == 1))
            {
                System.out.println("You win!");
                playerScore++;
            } 
            
            else 
            {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Score -> You: " + playerScore + ", Computer: " + computerScore + ", Ties: " + ties);
        }

        System.out.println("\nFinal Score:");
        System.out.println("You: " + playerScore + ", Computer: " + computerScore + ", Ties: " + ties);

        if (playerScore > computerScore) 
        {
            System.out.println("You are the overall winner!");
        } 
        
        else if (computerScore > playerScore) 
        {
            System.out.println("Computer is the overall winner!");
        } 
        
        else 
        {
            System.out.println("Overall, it's a tie!");
        }

        scanner.close();
    }
}
