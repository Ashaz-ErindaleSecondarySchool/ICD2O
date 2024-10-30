import java.util.Scanner;

public class U5_L7
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in); // open for keyboard input
        System.out.print("Enter an integer: ");

        try 
        {
            int number = kb.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) 
        {
            System.out.println("Invalid input. Please enter a valid integer.");
            kb.nextLine(); // consume the invalid input
        } 
        kb.close();
    }
}
