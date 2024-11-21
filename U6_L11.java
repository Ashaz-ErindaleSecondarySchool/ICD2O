import java.util.Scanner;

class U6_L11 
{
    public static void main(String[] args) 
    {
        int start = 0x1F600; 
        int end = 0x1F64F;   
        int emojisPerRow = 8;
        
        for (int codePoint = start; codePoint <= end; codePoint++) 
        {
            String emoji = new String(Character.toChars(codePoint));
            System.out.printf("%s ", emoji);
            if ((codePoint - start + 1) % emojisPerRow == 0) 
            {
                System.out.println();
            }
        }
        System.out.println(); 
    }
}
