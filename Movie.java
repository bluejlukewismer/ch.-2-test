
/**
 * Write a description of class Automobile here.
 * 
 * @author (type in your name here!!!!!) 
 * @date 11/17/2013
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private String title;
    private int year;
    private int lengthInMinutes;

    /**
     * Constructor for objects of class Automobile
     */
    public Movie(int yearMade,int length1)
    {
        title = "";
        year = yearMade;
        lengthInMinutes = length1;


    }
    
    public void printDetails()
    {
        System.out.println("title:" + title);
        System.out.println("year:" + year);
        System.out.println("length" + lengthInMinutes);
    }
    
    public void increaseLength()
    {
        if (lengthInMinutes.length() <= 1) {

            lengthInMinutes = lengthInMinutes + 1;

        } else {

            System.out.println("Please use a positive value.");
        }
    
    
    
    }
    public String getTitle()
    {
        return title;
    }

    public void lengthInMinutes(String length1)
    {
        lengthInMinutes = length1;

    }

    public int getYear()
    {
        return year;
    }
}
