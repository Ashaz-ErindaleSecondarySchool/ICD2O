import java.lang.Math;

class U6_L12 
{
    public static void main(String [] args) 
    {
        int x = 0;
        while ( x <= 12) 
        {
            double sr = Math.sqrt(x);
            System.out.printf("%d %.14f\n", x, sr);
            x++;
        }
    }
}
