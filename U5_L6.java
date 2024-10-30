import java.util.Scanner;

class U5_L6
{
  public static void main(String[] args) 
  {
    Scanner kbd = new Scanner(System.in);
    
    System.out.print("Hi. Please enter a greeting in one word: ");
    String greeting = kbd.next();
    System.out.printf("You said: %s.\n", greeting);

    // Clear the newline left by kbd.next()
    kbd.nextLine();

    System.out.print("Hi. Please enter a greeting in more than one word: ");
    greeting = kbd.nextLine();
    System.out.printf("You said: %s.\n", greeting);
  }
}
