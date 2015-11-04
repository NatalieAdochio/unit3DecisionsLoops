

import java.util.Scanner;
public class NumericalMethods
{
    public static void numericaltime()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Put in an integer:");
        int n = scan.nextInt();
        
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 1;
        for (int counter =3;
        counter<= n;
        counter++)
        {
            fnew = fold1 + fold2;
            fold2 = fold1;
            fold1 = fnew;
        }
        System.out.print(fnew);
    }
}
