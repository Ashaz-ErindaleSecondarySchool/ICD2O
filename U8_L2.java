import java.util.Scanner;

class U8_L2
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose an operation(+, -, *, /): ");

        char op = scanner.next().charAt(0);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result;

        if (op == '+')
        {
            result = num1 + num2;
            System.out.println("Result: " + result);
        }
        else if (op== '-') 
        {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } 
        else if (op == '*') 
        {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } 
        else if (op == '/')
        {
            if (num2 != 0)
            {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } 
            else 
            {
                System.out.println("Error: Division by zero is not allowed.");
            }
        } 
        else 
        {
            System.out.println("Error: Invalid operator. Please choose +, -, *, or /.");
        }

        scanner.close();
    }
}
