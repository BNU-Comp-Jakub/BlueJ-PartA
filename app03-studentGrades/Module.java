import java.util.*;
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    // The name of the module
    public String modulename;
    //The code of the module
    public String modulecode;
    
    public String precentagemark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String name,String code)
    {
        modulename = name;
        modulecode = code;
    }

    /**
     *Gets the name of the module
     */
    public String getname()
    {
        return modulename;
        
    }
    
     /**
     *Gets the code of the module
     */
    public String getcode()
    {
        return modulecode;
        
    }
    
      /**
     *Gets the precentages and turns them into grades
     */
    public void precentagemark(int precentage)
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
    
      /**
     * Sets a new name for this module.
     */
    public void changeName(String replacementName)
    {
        modulename = replacementName;
    }

     /**
     * Sets a new code for this module.
     */
    public void changeCode(String replacementCode)
    {
        modulecode = replacementCode;
    }
   
}
