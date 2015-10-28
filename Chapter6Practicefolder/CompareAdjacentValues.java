
import java.util.Scanner;
public class CompareAdjacentValues
{
    public static final double EPSILON = 1e-12;
    public static void checkForDuplicates()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers or a character to quit.");
        
        //double input =0;
        double input =scan.nextDouble();
        //so if they put in zero as the first error it wont read as duplicate
        while( scan.hasNextDouble())
        {
            double previousInput = input;
            //can't declare input inside the loop because it will lose the memory
            input = scan.nextDouble();
            
            //the equlity operator would be fine here since we are not
            // performing any floating point operations
            if( Math.abs(input - previousInput)< EPSILON)
            {
                System.out.println("Duplicate input");
            }
        }
    }
}