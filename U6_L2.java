import java.util.Scanner;

/*
Ashaz Siddiqui 783827
Date: 3 October, 2022
Course: Grade 10 Digital technology and innovations
Title: Simple Calculator
Description: A program that calculates two numbers
VARIABLE DICTIONARY: 
  num1  (Double) the first number in the equation
  num2  (Double) the second in the equation
  op    (Char) operator

*/

public class U6_L2
{
    public static void main(String[] args) 
    {
      double num1;
      double num2;
      char op;
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Simple Calculator");
      System.out.println("Please choose an operator(+,*,-,/): ");
      op = sc.next().charAt(0);
      
      System.out.println("Please choose your first number: ");
      num1 = sc.nextInt();
      
     
      System.out.println("Please choose your second number: ");
      num2 = sc.nextInt();
      
      if (op=='+')
      {
        System.out.println(num1+num2); 
      }
      
      if (op=='-')
      {
        System.out.println(num1-num2);
      }
      
      if (op=='*')
      {
        System.out.println(num1*num2);
      }
      
       if (op=='/')
      {
        System.out.println(num1/num2);
      }
      if (num2==0)
      {
        System.out.println("Error:You can't divide by 0");
      }
    }
}
