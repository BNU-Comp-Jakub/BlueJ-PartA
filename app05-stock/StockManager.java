import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Jakub Szupryczynski) 
 * @version (23/11/2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;
    
    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }
    
    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void delivery(int id, int amount)
    {
    for(int N=0; N<stock.size(); N++) 
        {
        if(id == stock.get(N).getID())
            {
                 stock.get(N).increaseQuantity(amount);
                
            }
        }        
    }
    
    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    
    {
    for(int N=0; N<stock.size(); N++) 
        {
        if(id == stock.get(N).getID())
            {
                return stock.get(N);
            }
        }
        return null;
    }
    
    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
    for(int N=0; N<stock.size(); N++) 
        {
        if(id == stock.get(N).getID())
            {
                return stock.get(N).getQuantity();
            }
        }
        return 0;
    }
    
    /**
     * Locate a product with the given ID, and change its name.
     * @param id The ID of the product.
     * @param newName The new name of the product.
     */
    public void changeNameProduct(int id, String newName)
    {
    for(int N=0; N<stock.size(); N++) 
        {
        if(id == stock.get(N).getID())
            {
                stock.get(N).setName(newName);
            }
        }
    }
    
    /**
     * Locate a product with the given ID.
     * Remove that product.
     * @param id The ID of the product.
     */
    public void removeProduct(int id)
    {
    for(int N=0; N<stock.size(); N++) 
        {
        if(id == stock.get(N).getID())
            {
                stock.remove(N);
            }
        }
    }
    
    /**
     * Locate all products in stock.
     * Display the details of the products.
     */
    public void printAllProducts()
    {
        for(int N=0; N<stock.size(); N++)
        {
            printProductDetails(N);
        }
    }
    
    /**
     * Locate products that contain the string typed in.
     * @param String find
     */
    public void findInProducts(String find)
    {
        for(int N=0; N<stock.size(); N++)
        {
            if(stock.get(N).getName().contains(find))
            {
                printProductDetails(N);
            }
        }
    }
    
    /**
     * Locate products that are low in quantity.
     */
    public void findLowProducts()
    {
        for(int N=0; N<stock.size(); N++)
        {
            if(stock.get(N).getQuantity()<5)
            {
                printProductDetails(N);
            }
        }
    }
    
    /**
     * Locate product by its id.
     * reduce that product by a given amount
     * @param amount and id
     */
    public void sellProduct(int amount, int id)
    {
        for(int N=0; N<stock.size(); N++)
        {
            if(id == stock.get(N).getID())
            {
               stock.get(N).sellProduct(amount);   
            }    
        }
    }
    
    /**
     * Print details of all the products.
     */
    public void printProductDetails(int id)
    {
        System.out.println(stock.get(id).getName());
        System.out.println(stock.get(id).getID());
        System.out.println(stock.get(id).getQuantity());
    }
}
