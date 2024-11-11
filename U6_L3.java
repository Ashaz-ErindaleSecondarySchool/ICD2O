import java.util.Scanner;

class U6_L3 
{
   public static void main(String [] args) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please choose a percentage mark enter (0-100): ");
      int mark=sc.nextInt();
      
      if ((mark >= 80) && (mark <= 100))
      {
        System.out.println("You grade is A!");
      }
     
      if ((mark >= 70) && (mark <=79))
      {
        System.out.println("Your grade is B!");
      }
      
      if ((mark >= 60) && (mark <= 69))
      {
        System.out.println("Your grade is C!");
      }
      
      if ((mark >= 50) && (mark <= 59))
      {
        System.out.println("You grade is D!");
      }
      
      if ((mark >= 0) && (mark <= 49))
      {
        System.out.println("Your grade is F!");
      }
      
      if (mark < 0)
      {
        System.out.println("Error");
      }
   }
}
