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
    public String coursename;
    // Variable that represent the code number of the course
    public String codenumber;
    
    
    /**
     * Store a name of the course and the code number of the course.
     */
    public Course(String course, String code)
    {
        // initialise instance variables
        coursename = course;
        codenumber = code;
        
        
        
        
    }
    
    
    
    /**
     * Set a new name for this Course.
     */
    public void changeName(String replacementName)
    {
        coursename = replacementName;
    }

     /**
     * Set a new code for this Course.
     */
    public void changeCode(String replacementCode)
    {
        codenumber = replacementCode;
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
