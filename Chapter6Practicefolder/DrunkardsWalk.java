import java.util.Random;
public class DrunkardsWalk
{
  public static void pathChoice()
  {
      int startingSpotX = 0;
      int startingSpotY = 0;
      Random generator = new Random();
      int counter =0;
      do
      { 
      int direction = generator.nextInt(4)+1;
      if ( direction == 1)
      {
          //going forward
          startingSpotY++;
      }
      if (direction ==2)
      {
          //going to the left
          startingSpotX--;
        }
      if (direction ==3)
      {
       //going to the right
       startingSpotX++;
       }
      if (direction ==4)
      {
          // going backward
          startingSpotY--;
        }
      counter++;
    }
      while (counter<=100);
    System.out.print("("+startingSpotX +","+ startingSpotY+")");
    }
}
