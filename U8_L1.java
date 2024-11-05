import java.util.Scanner;

/*
Ashaz Siddiqui 783827
Date: 4 November, 2024
Course: Grade 10 Digital technology and innovation
Title: digits Counter 
Description: A program which first lets the user type a 
random number in the input and this code will display 
how many digits the number that the user has inputted.
VARIABLE DICTIONARY: 
  number     (int) the input for the user 
  to type any random number.   
*/


class U8_L1
{
 public static void main(String[] args)
 {
   Scanner sc = new Scanner(System.in);
   System.out.print("Please enter an integer: ");
   int number = sc.nextInt();

   if (number < 10) 
   {
     System.out.println(number + " has 1 digit.");
   } 
   else if (number < 100) 
   {
     System.out.println(number + " has 2 digits.");
   } 
   else if (number < 1000)
   {
     System.out.println(number + " has 3 digits.");
   } 
   else 
   {
     System.out.println(number + " has 4 or more digits.");
   }
   /*The problem with this code is the logic
   in the if and else if statements. 
   The conditions are evaluated in sequence, 
   and each block's logic conflicts with the previous one.
   Specifically, the conditions should be reordered from 
   smallest to largest instead of largest to smallest*/
 }
}
