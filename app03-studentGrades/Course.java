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
   
    private Module coding;
    
    private Module coding2;
   
    private Module coding3;
       
    private Module coding4;
     /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule(Module module1)
    {
        coding = module1;
      
        
    }
    
      /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule2(Module module2)
    {
        coding2 = module2;
        
        
    }
    
    /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule3(Module module3)
    {
        coding3 = module3;
        
        
    }
    
    /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule4(Module module4)
    {
        coding4 = module4;
        
        
    }
    
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
    *Get the name of the course.
    */
    public String getName()
    {
        return coursename;

    }
    
    /**
    * Get the code of the course.
    */
    public String getCode()
    {
        return codenumber;
    }
    
    /**
     * Print the Module's name and code number to the output terminal.
     */
    public void print()
    {
        System.out.println("Course Name:" + coursename +" Course Code:" + codenumber);
        System.out.println("1st Module's name is " + coding.modulename);
        System.out.println("1st Module's code is " + coding.modulecode);
        System.out.println("2nd Module's name is " + coding2.modulename);
        System.out.println("2nd Module's code is " + coding2.modulecode);
        System.out.println("3rd Module's name is " + coding3.modulename);
        System.out.println("3rd Module's code is " + coding3.modulecode);
        System.out.println("4th Module's name is " + coding4.modulename);
        System.out.println("4th Module's code is " + coding4.modulecode);
    }
    
    
    public int result()
    {
        coding.precentagemark + coding.precentagemark + coding.precentagemark +
    }
    
}

