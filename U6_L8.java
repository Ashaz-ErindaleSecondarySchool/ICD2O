import java.lang.Math;

class U6_L8 
{
    public static void main(String[] args)
    {
        System.out.printf("%5s %10s %10s %10s\n", "x", "sqrt(x)", "x^2", "x^3");
        System.out.printf("%5s %10s %10s %10s\n", "---", "--------", "----------", "----------");
        for (int x = 0; x <= 10; x++) 
        {
            double sqrt = Math.sqrt(x);
            double square = Math.pow(x, 2);
            double cube = Math.pow(x, 3);
            System.out.printf("%5d %10.4f %10.0f %10.0f\n", x, sqrt, square, cube);
        }
    }
}
