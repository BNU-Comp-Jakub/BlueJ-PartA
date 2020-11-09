import java.util.*;
/**
 * This is a moudle wth a name it's code and a set precentage.
 *
 * @author (Jakub Szupryczynski)
 * @version (09/11/2020)
 */
public class Module
{
    // The name of the module
    public String modulename;
    //The code of the module
    public String modulecode;
    
    public int mark;

    /**
     * Constructor for objects of class Module
     */
    public Module(String name,String code,int precentage)
    {
        modulename = name;
        modulecode = code;
        mark = precentage;
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
     *Gets the percentage of the moudle
     */
    public int getpercent()
    {
        return mark;
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
    
    public void setPrecentage(int newMark)
    {
        mark = newMark;
    }
   
    public void print()
    {
      System.out.println("Name of the moudle: " + modulename + " Code of the moudle" + modulecode + " Mark:" + mark);
    }
}
