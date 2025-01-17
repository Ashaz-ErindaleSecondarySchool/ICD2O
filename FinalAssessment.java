package pkgfinal.assessment;

/*
Ashaz Siddiqui 783827
Date: 17 January, 2025
Course: Grade 10 Comp Sci
Title: Final Assessment: Credit River Credit Cards 
Description: A program which outputs A listing of all account numbers and their final balances, The account number and balance of the highest final balance, The account number and balance of the lowest final balance, The average balance
VARIABLE DICTIONARY: 
  largest     (Double) To store the largest final balance
  smallest    (double) the current highest number
  sumOfBalances     (Double) To sum up all final balances
  tally     (Int) to count the number of customers
  largestAccount (String) To store account number of largest balance
  smallestAccount (String) To store account number of smallest balance
  accountNumber (String) The account number
  initialBalance (Double) The initial balance
  purchaseAmount (Double) The purchase amount
  paymentAmount (Double) The payment amount
  averageBalance (Double) The average balance
*/

import java.util.Scanner;
import java.io.*;
import java.util.InputMismatchException;

public class FinalAssessment {

    static double finalBalance(double oldBal, double purchase, double payment) {
        double r = 0.28; // Annual interest rate
        double result = (1 + (r / 12)) * oldBal - payment + purchase;
        return result;
    }

    public static void main(String[] args) {
        // Declare necessary variables
        double largest = -Double.MAX_VALUE; // To store the largest final balance
        double smallest = Double.MAX_VALUE; // To store the smallest final balance
        double sumOfBalances = 0; // To sum up all final balances
        int tally = 0; // To count the number of customers

        String largestAccount = ""; // To store account number of largest balance
        String smallestAccount = ""; // To store account number of smallest balance

        // Use try-with-resources to ensure the scanner is closed properly
        try (Scanner fileScanner = new Scanner(new File("C:\\Users\\783827\\OneDrive - Peel District School Board\\Downloads\\Final Assessment\\src\\pkgfinal\\assessment\\ledger.dat"))) {

            // Loop through each line in the file (each customer)
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split("\\s+"); // Split by whitespace

                // Check if the line has the expected number of parts
                if (parts.length < 4) {
                    System.out.println("Error: Insufficient data in line: " + line);
                    continue; // Skip this line and continue with the next
                }

                // Read account number, initial balance, purchase amount, and payment amount
                String accountNumber = parts[0];
                double initialBalance = Double.parseDouble(parts[1]);
                double purchaseAmount = Double.parseDouble(parts[2]);
                double paymentAmount = Double.parseDouble(parts[3]);

                // Calculate the final balance using the function
                double finalBalance = finalBalance(initialBalance, purchaseAmount, paymentAmount);

                // Print account number and final balance
                System.out.printf("Account Number: %s, Final Balance: %.2f\n", accountNumber, finalBalance);

                // Update the sum of balances and tally
                sumOfBalances += finalBalance;
                tally++;

                // Check and update largest and smallest balances
                if (finalBalance > largest) {
                    largest = finalBalance;
                    largestAccount = accountNumber;
                }

                if (finalBalance < smallest) {
                    smallest = finalBalance;
                    smallestAccount = accountNumber;
                }
            }

            // Calculate and display the average balance
            if (tally > 0) {
                double averageBalance = sumOfBalances / tally;

                // Print summary of results
                System.out.printf("\nSummary:\n");
                System.out.printf("Largest Balance: %.2f (Account: %s)\n", largest, largestAccount);
                System.out.printf("Smallest Balance: %.2f (Account: %s)\n", smallest, smallestAccount);
                System.out.printf("Average Balance: %.2f\n", averageBalance);
            } else {
                System.out.println("No valid customer data found.");
            }

        } catch (FileNotFoundException e) {
            // Handle the case where the file is not found
            System.out.println("Error: File not found.");
        } catch (InputMismatchException e) {
            // Handle the case where the input data format is incorrect
            System.out.println("Error: Input data format is incorrect.");
        } catch (NumberFormatException e) {
            // Handle the case where parsing a number fails
            System.out.println("Error: Number format is incorrect.");
        }

        // Program ends
    }
}
