package assignment1;
import java.util.Scanner;
import java.lang.Math;

class Assignment1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       //Creates a scanner to detects user output
        
        System.out.println("Enter the length and width of the imaginary rectangle and I will display the area");
        //tells user what to do
        
        System.out.print("Length: ");
        int L = scan.nextInt();
        //asks user the length and assigns it to the variable L
        
        System.out.print("Width: ");
        int W = scan.nextInt();
        //asks user the width and assigns it to the variable W
        
        int arearec = L * W;
        //does the calculation
        
        System.out.println("Area of the rectangle is " + arearec);
        //tells user the output
        
        System.out.println("Enter the radius of the imaginary circle and I will display the area");
        //ask user for the radius of the imaginary circle 
        
        System.out.print("Radius: ");
        int R = scan.nextInt();
        //ask the user the radius to the variable R
        
        int r = R * R;
        double areacirc = Math.PI * r;
        //does the calculation
        
        System.out.println("Area of the circe is " + areacirc);
        //tells us the area of the circle
        
        System.out.println("Enter the height and raidius of a cylinder and I will display the surface"+ " area and volume");
        //ask user for the height and radius
        
        System.out.print("Radius: ");
        int R2 =  scan.nextInt();
        //lets the user type the radius
        
        System.out.print("Height: ");
        int H = scan.nextInt();
        //lets the user type the height
        
        int r2 = R2 * R2;
        double V = Math.PI * r2 * H;
        //calculation for volume of cylinder
        
        System.out.println("Volume of the cylinder is " + V);
        //displays volume of the cylinder
        
        double SA = 2 * Math.PI * R2 * H + 2 * Math.PI * r2;
        //calculation for surface area of cylinder
        
        System.out.println("Surface area of the cylinder is " + SA);
        //displays surface area of cylinder
        
        System.out.println("Enter the length of the imaginary pendulum and I will display the period");
        //ask user for length for imaginary pendulum
        
        double g = 9.8;
        //formula for gravity
        
        System.out.print("Length: ");
        int L2 = scan.nextInt();
        //lets user type length of pendulum
        
        double L3 = L2 / g;
        double L4 = Math.sqrt(L3);
        double P = 2 * Math.PI * L4;
        //calculation for period of the pendulum
        
        System.out.println("Period of the pendulum is " + P);
        //displays pendulum period
    }
   
}
