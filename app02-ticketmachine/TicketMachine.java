/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Jakub Szupryczynski
 * 08/11/2020
 */
public class TicketMachine
{
   
    // The amount of money entered by a customer so far.
    private double balance;
    // The total amount of money collected by this machine.
    private double total;
    // price for ticket to Aylesbury
    private double priceAylesbury;
    // price for ticket to Amersham
    private double priceAmersham;
    // price for ticket to High Wycombe
    private double priceHighWycombe;
    
    private double priceAll;

    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        priceAylesbury = 2.20;
        priceAmersham = 3.00;
        priceHighWycombe = 3.30;
        priceAll = 8.50;
        balance = 0;
        total = 0;
    }

    /**
     * @Return The price of a ticket.
     */
    public double getPriceAylesbury()
    {
        return priceAylesbury;
        
    }

    /**
     * @Return The price of a ticket.
     */
    public double getPriceAmersham()
    {
        return priceAmersham;
        
    }
    
    /**
     * @Return The price of a ticket.
     */
    public double getPriceHighWycombe()
    {
        return priceHighWycombe;
        
    }
    
     /**
     * @Return The price of a ticket.
     */
    public double getPriceAll()
    {
        return priceAll;
        
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     * Display the balance
     * Limit the customer to only certain amounts of money
     * Display the amount inserted
     */
    public void insertMoney(double amount)
    {
        if(amount == 0.10) 
        {
            balance = balance + amount;
            System.out.println("You inserted" + amount + " cents.");
            System.out.println("You now have" + balance + " cents.");
        }
        else if(amount == 0.20) 
        {
            balance = balance + amount;
            System.out.println("You inserted" + amount + " cents.");
            System.out.println("You now have" + balance + " cents.");
        }
         else if(amount == 1.00) 
        {
            balance = balance + amount;
            System.out.println("You inserted" + amount + " cents.");
            System.out.println("You now have" + balance + " cents.");
        }
         else if(amount == 2.00) 
        {
            balance = balance + amount;
            System.out.println("You inserted" + amount + " cents.");
            System.out.println("You now have" + balance + " cents.");
        }
        else
        {
            System.out.println("Plase enter either 10p,20p,£1 or £2 rather than: " +
                               amount);
        }
         
            
            
    }

    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketAylesbury()
    {
        if(balance >= priceAylesbury) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to Aylesbury");
            System.out.println("# " + priceAylesbury + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + priceAylesbury;
            // Reduce the balance by the price.
            balance = balance - priceAylesbury;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (priceAylesbury - balance) + " more cents.");
                    
        }
    }

     /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketAmersham()
    {
        if(balance >= priceAmersham) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to Amersham");
            System.out.println("# " + priceAmersham + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + priceAmersham;
            // Reduce the balance by the price.
            balance = balance - priceAmersham;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (priceAmersham - balance) + " more cents.");
                    
        }
    }
   
     /**
     * Print all tickets if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketAll()
    {
        if(balance >= priceAll) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to High Wycombe");
            System.out.println("# " + priceHighWycombe + " cents.");
            System.out.println("##################");
            System.out.println();
            
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to Amersham");
            System.out.println("# " + priceAmersham + " cents.");
            System.out.println("##################");
            System.out.println();
            
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to Aylesbury");
            System.out.println("# " + priceAylesbury + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + priceAll;
            // Reduce the balance by the price.
            balance = balance - priceAll;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (priceAll - balance) + " more cents.");
                    
        }
    }
    
     /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicketHighWycombe()
    {
        if(balance >= priceHighWycombe) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.println("# Ticket to High Wycombe");
            System.out.println("# " + priceHighWycombe + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + priceHighWycombe;
            // Reduce the balance by the price.
            balance = balance - priceHighWycombe;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (priceHighWycombe - balance) + " more cents.");
                    
        }
    }
    
    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public double refundBalance()
    {
        double amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
