class U6_L4
{
   public static void main(String [] args) 
   {
      String w1 = "shellshock";
      String w2 = "shellac";
      String w3 = "fortify";
      
      if (w3.compareTo(w1) < 0)
     {
        System.out.println("The first word is: "+w3);
     }
     if (w2.compareTo(w1) < 0)
     {
       System.out.println("The next word is: "+w2);
     }
     if (w1.compareTo(w3) > 0)
     {
       System.out.println("The last word is: "+w1);
     }
   }
}
