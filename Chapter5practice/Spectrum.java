import java.util.Scanner;

public class Spectrum
{
  
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Input a wavelength: ");
      double wavelength = in.nextDouble();
      if (wavelength > Math.pow(10,-1))
      {
          System.out.println("Radio waves");
        }
      else if (wavelength > Math.pow(10,-3))
      {
          System.out.println("Microwaves");
        }
      else if ((wavelength > (7* Math.pow(10,-7))))
      {
          System.out.println("Infrared");
        }
      else if (wavelength > (4* Math.pow(10,-7)))
      {
          System.out.println("Visible light");
        }
      else if (wavelength > Math.pow(10,-8))
      {
          System.out.println("Ultraviolet");
        }
      else if (wavelength > Math.pow(10,-11))
      {
        System.out.println("X-rays");  
        }
      else
      {
          System.out.println("Gamma rays");
        }
    }
}