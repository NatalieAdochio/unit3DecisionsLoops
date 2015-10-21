import java.util.Scanner;
public class LeapYear
{
    private int year;
    private int year2;
  
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Input a year that you want to know if it is a leap year: ");
       int year = in.nextInt(); 
           if ((year%100 != 0) && (year%400 == 0)&& (year%4 != 0))
     {
       System.out.println(year+" is a leap year"); 
     }
     else 
     {
       System.out.println(year+" is not a leap year");  
     }
      
    }
   public void isLeapYear()
   {
     this.year=year;
     if ((year%100 != 0) && (year%400 == 0)&& (year%4 != 0))
     {
       System.out.println(year+" is a leap year"); 
     }
     else 
     {
       System.out.println(year+" is not a leap year");  
     }
    }
}