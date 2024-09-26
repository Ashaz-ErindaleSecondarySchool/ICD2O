package assignment1;
import java.util.Scanner;
import java.lang.Math;

class Assignment1 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Enter the length and width of a rectangle and I will display the area");
        System.out.print("Length: ");
        int L = scan.nextInt();
        System.out.print("Width: ");
        int W = scan.nextInt();
        int arearec = L * W;
        System.out.println("Area of the rectangle is " + arearec);
      
        System.out.println("Enter the radius of a circle and I will display the area");
        System.out.print("Radius: ");
        int R = scan.nextInt();
        int r = R * R;
        double areacirc = Math.PI * r;
        System.out.println("Area of the circe is " + areacirc);
      
        System.out.println("Enter the height and raidius of a cylinder and I will display the surface"+ " area and volume");
        System.out.print("Radius: ");
        int R2 =  scan.nextInt();
        System.out.print("Height: ");
        int H = scan.nextInt();
        int r2 = R2 * R2;
        double V = Math.PI * r2 * H;
        System.out.println("Volume of the cylinder is " + V);
        double SA = 2 * Math.PI * R2 * H + 2 * Math.PI * r2;
        System.out.println("Surface area of the cylinder is " + SA);
        
        System.out.println("Enter the length of a pendulum and I will display the period");
        double g = 9.8;
        System.out.print("Length: ");
        int L2 = scan.nextInt();
        double L3 = L2 / g;
        double L4 = Math.sqrt(L3);
        double P = 2 * Math.PI * L4;
        System.out.println("Period of the pendulum is " + P);
    }
   
}
