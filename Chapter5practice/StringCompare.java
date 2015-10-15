

/**
 * Write a description of class StringCompare here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringCompare
{
    /** description of instance variable x (add comment for each instance variable) */
    private String word1;
    private String word2;
    

    /**
     * Default constructor for objects of class StringCompare
     */
    public StringCompare()
    {
        // initialise instance variables
        String word1 = "catalog";
        String word2 = "cat";
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void main(String[] args)
    {
        // put your code here
        randomWord="aaa";
        String word1, word2;
        int result = word1.compareTo(word2);
        if(result<0)
        {
            System.out.println("Word1 is less than word2");
        }
        else if(result==0)
        {
            System.out.println("word1 is equal to word2");
        }
        else
        {
           System.out.println("word1 is bigger than word2"); 
        }
        }
      
        
    }
}
