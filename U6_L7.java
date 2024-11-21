import java.util.Scanner;
import java.util.Random;

class U6_L7 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(10) + 1;
        int guess = 0;
        int attempts = 0;
        final int MAX_ATTEMPTS = 5;

        System.out.println("Guess a number between 1 and 10. You have 5 attempts:");

        while (attempts < MAX_ATTEMPTS) 
        {
            System.out.print("Attempt " + (attempts + 1) + ": ");
            guess = scanner.nextInt();
            attempts++;

            if (guess == targetNumber) 
            {
                System.out.println("Right answer!");
                break;
            } 
            else if (attempts < MAX_ATTEMPTS) 
            {
                System.out.println("Incorrect");
            }
        }

        if (guess != targetNumber) 
        {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + targetNumber + ".");
        }
        //It wasn't so hard I used the referenced lesson and a bit of researh on google
        scanner.close();
    }
}
