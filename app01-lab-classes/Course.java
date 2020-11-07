import java.util.*;

/**
 * This is a class for the Course
 *
 * @author (Jakub Szupryczynski)
 * @version (08/11/2020)
 */
public class Course
{
    // Variable for the name of the course
    private String coursename;
    // Variable that represent the code number of the course
    private String codenumber;
    
    
    /**
     * Store a name of the course and the code number of the course.
     */
    public Course()
    {
        // initialise instance variables
        coursename = "Programing";
        codenumber = "D5001";
        
        
        
        
    }
    

    /**
    Get tge name of the course and the number of the course.
    */
    public String getName()
    {
        return coursename;

    }
    
    public String getCode()
    {
        return codenumber;
    }
    
    
}
