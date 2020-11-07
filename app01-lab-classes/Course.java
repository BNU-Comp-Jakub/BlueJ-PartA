import java.util.*;

/**
 * Write a description of class Course here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
