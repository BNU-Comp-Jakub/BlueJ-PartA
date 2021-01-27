import java.util.ArrayList;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 * @author Jakub Szupryczynski
 * @version 16/01/21
 */
public class StockApp
{
    /**
    * Storing Variables
    */
    private InputReader input;
    private StockManager manager;
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
    }

    /**
     * Used to run the game
     */
    public void run()
    {     
        printHeading();
        getMenuChoice();
    }
    
    /**
     * Creates Working Menu
     */
    public void getMenuChoice()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printMenuChoices();
           
            String choice = input.getInput();
           if(choice.equals("Add"))
           {
            String name;
            int id;
            name = input.getInput();
            id = input.getInt();
            manager.addNewProduct(id,name);
           }
           else if(choice.equals("PrintAll"))
           {
             manager.printAllProducts();
           }
           
           else if(choice.equals("Quit"))
           {
            finished = true;
           }
           
           else if(choice.equals("Remove"))
           {
               int id = input.getInt();
               manager.removeProduct(id);   
           }
           
           else if(choice.equals("Deliver"))
           {
            int id = input.getInt();
            int amount = input.getInt();
            manager.delivery(id,amount);
           }
           
           else if(choice.equals("Sell"))
           {
            int id = input.getInt();
            int amount = input.getInt();
            manager.sellProduct(id,amount);
           }
           
           else if(choice.equals("Search"))
           {
            String find = input.getInput();
            manager.findInProducts(find);
           }
           
           else if(choice.equals("LowStock"))
           {
            manager.findLowProducts();
           }
           
           else if(choice.equals("ReStock"))
           {
            manager.reStock();
           }
           
           else
           {
            System.out.println("Not a valid command");
           }
        }
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Deliver:    Deliver an old product");
        System.out.println("    Sell:       Sell an old product");
        System.out.println("    Search:     Search an old product");
        System.out.println("    LowStock:   Show low amount products");
        System.out.println("    ReStock:   Restock low amount products");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Jakub Szupryczynski");
        System.out.println("******************************");
    }
}
