import java.util.*;

/**
 * This is a class for the Course which contains 4 moudles
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
   
    private Module module1;
    
    private Module module2;
   
    private Module module3;
       
    private Module module4;
    
    int precentage;
     /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule(Module module1)
    {
        this.module1 = module1;
    }
    
      /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule2(Module module2)
    {
        this.module2 = module2;
    }
    
    /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule3(Module module3)
    {
        this.module3 = module3;
    }
    
    /**
     * Allows for the Module to be assigned to the Course
     */
    public void addamodule4(Module module4)
    {
        this.module4 = module4;
    }
    
    /**
     * Store a name of the course and the code number of the course.
     */
    public Course(String course, String code)
    {
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
        
        module1.print();
        module2.print();
        module3.print();
        module4.print();
    }
    
    public void calculatefinalmark()
    {
        //set the precentage = to the 4 module mark and divided by 4.
        this.precentage = (module1.mark + module2.mark + 
                          module3.mark + module4.mark)/4;
        calculateGrade();
    }
    
    /**
     * Gets the precentages and turns them into grades
     */
    public void calculateGrade()
    {
        if(precentage >= 0 && precentage <= 39)
        {
         System.out.println("F");
        }
        else if(precentage >= 40 && precentage <= 49)
        {
         System.out.println("D");
        }
        else if(precentage >= 50 && precentage <= 59)
        {
         System.out.println("C");
        }
        else if(precentage >= 60 && precentage <= 69)
        {
         System.out.println("B");
        }
        else if(precentage >= 70 && precentage <= 100)
        {
         System.out.println("A");
        }
        else
        {
         System.out.println("Please enter a correct precentage");
        }
    }
}

