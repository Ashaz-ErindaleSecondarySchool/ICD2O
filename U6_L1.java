import java.util.Scanner;

/*
Ashaz Siddiqui 783827
Date: 7 November, 2024
Course: Grade 10 Digital Technology and innovations
Title: Weather forecast 
Description: it calculates the chance of rain 
VARIABLE DICTIONARY: 
  rain     (int) tells if it is going to rain
  no_rain  (int) tells us if it is not going to rain
  chance   (double) the chance of rain
*/

class U6_L1
{
 public static void main(String[] args) 
{
    Scanner kb = new Scanner(System.in);
    System.out.print("What is the chance to rain (enter in decimal form): ");
    double chance = kb.nextDouble();
    double rain = 0.6;
    double no_rain = 0.07;
   
    if (chance >= rain)
{
      System.out.println("The forecast is rain");
    } else if (chance <= no_rain)
{
      System.out.println("It will be dry");
    } else if ((chance <= rain) && (chance >= no_rain))
{
      System.out.println("There is a a small chance of rain");
    }
 }
}
