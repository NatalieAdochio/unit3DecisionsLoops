import java.util.Scanner;


public class MaxandMin
{
   public static double maximum()
   {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a series of numbers or any characters to stop. ");
     double largest = scan.nextDouble();
     
     while(scan.hasNextDouble())
     {
         double input = scan.nextDouble();
         if (input > largest)
         {
             largest = input;
          }
     }
     return largest;
    }
    public static double minimum()
    {
      Scanner scan2 = new Scanner(System.in);
     System.out.println("Enter a series of numbers or any characters to stop. ");
     double smallest = scan2.nextDouble();
     
     while(scan2.hasNextDouble())
     {
         double input = scan2.nextDouble();
         if (input < smallest)
         {
             smallest = input;
          }
     }
     return smallest;
    }
}
