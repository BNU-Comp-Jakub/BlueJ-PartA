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
    private String courseName;
    // Variable that represent the code number of the course
    private String codeNumber;
    
    
    /**
     * Store a name of the course and the code number of the course.
     */
    public Course(String course, String code)
    {
        // initialise instance variables
        courseName = course;
        codeNumber = code;
    }
    
    
    
    /**
     * Set a new name for this Course.
     */
    public void setName(String replacementName)
    {
        courseName = replacementName;
    }

     /**
     * Set a new code for this Course.
     */
    public void setCode(String replacementCode)
    {
        codeNumber = replacementCode;
    }
    
    /**
    *Get the name of the course.
    */
    public String getName()
    {
        return courseName;
    }
    
    /**
    * Get the code of the course.
    */
    public String getCode()
    {
        return codeNumber;
    }
    
    public void print()
    {
       System.out.println("course: " + codeNumber + " " + courseName); 
    }  // end of print      
} // END OF CLASS
