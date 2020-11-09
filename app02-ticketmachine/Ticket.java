import java.util.Date;
/**
 * This ticket contains the destination, the date and the price.
 *
 * @author (Jakub Szupryczynski)
 * @version (08/11/2020)
 */
public class Ticket
{
    private String destination;
    
    private Date date;
    
    private double price;
    
    /**
     * Constructor for objects of class Ticket
     */
    public Ticket(String destination, double price)
    {
       this.destination = destination;
       this.price = price;
       date = new Date();
    }
    
    /**
     * This returns the price of the ticket
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * This prints out the destination, code and the date
     */
    public void print()
    {
        System.out.println("ticket: " + destination + " cost: " + price + " date: " + date);
    }
}
