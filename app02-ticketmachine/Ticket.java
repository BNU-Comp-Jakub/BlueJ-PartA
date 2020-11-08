import java.util.Date;
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
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

    public double getPrice()
    {
        return price;
    }
    
    /**
     *
     */
    public void print()
    {
        System.out.println("ticket: " + destination + " " + price + " " + date);
    }
}
