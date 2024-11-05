import java.util.Scanner;

/*
Ashaz Siddiqui 783827
Date: 4 November, 2024
Course: Grade 10 Digital technology and innovations
Title: Factorials converter
Description: A program that coverts number to a factorial
VARIABLE DICTIONARY: 
n   (long) This variable is a long type initialized to 1. It represents the current number in the factorial sequence and increments with each iteration of the while loop until it reaches max.
kb  (scanner) This variable is an instance of Scanner, which allows you to take input from the user. It's used here to read a number from the console.
fac (double) This variable is a double type initialized to 1. It stores the factorial result as the program calculates it. In each loop iteration, it multiplies by n to accumulate the factorial product.
max (long) This is a long variable that stores the user-input number. The loop will continue to multiply until n reaches this number, effectively calculating max! (the factorial of the input value).
*/

class U8_L3
{
   public static void main(String [] args) 
   {
      Scanner kb = new Scanner(System.in);
      long n = 1;
      double fac = 1;
      System.out.print("Enter a number for factorial: ");
      long max = kb.nextLong();
      while (n <= max) {
         fac = fac * n;
         n = n + 1;
      }
      System.out.printf("%e\n", fac);
   }
}
