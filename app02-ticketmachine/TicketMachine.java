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
        private Ticket aylesburyTicket;
        
        private Ticket amershamTicket;
        
        private Ticket wycombeTicket;
        
        private Ticket userTicket;
    
        /**
         * Create a machine that issues tickets of the given price.
         */
        public TicketMachine()
        {
        aylesburyTicket = new Ticket("Aylesbury",2.00);
        
        amershamTicket = new Ticket("Amersham",3.00);
        
        wycombeTicket = new Ticket("High Wycombe",3.30);
        
        balance = 0;
        total = 0;
    }
    
    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public double getBalance()
    {
        return balance;
    }

     public void insert10p()
    {
        double amount = 0.10;
        balance = balance + amount;
        System.out.println("You inserted" + amount + " pounds.");
        System.out.println("You now have" + balance + " pounds.");
    }
    
    public void insert20p()
    {
        double amount = 0.20;
        balance = balance + amount;
        System.out.println("You inserted" + amount + " pounds.");
        System.out.println("You now have" + balance + " pounds.");
    }
    
     public void insert£1()
    {
        double amount = 1.00;
        balance = balance + amount;
        System.out.println("You inserted" + amount + " pounds.");
        System.out.println("You now have" + balance + " pounds.");
    }
    
     public void insert£2()
    {
        double amount = 2.00;
        balance = balance + amount;
        System.out.println("You inserted" + amount + " pounds.");
        System.out.println("You now have" + balance + " pounds.");
    }
    
    public void selectAylesbury()
    {
        userTicket = aylesburyTicket;
    }
    
     public void selectAmersham()
    {
        userTicket = amershamTicket;
    }
    
     public void selectHighWycombe()
    {
        userTicket = wycombeTicket;
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        
        if(balance >= userTicket.getPrice()) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# 08/11/20");
            System.out.print("# "); userTicket.print();
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + userTicket.getPrice();
            // Reduce the balance by the price.
            balance = balance - userTicket.getPrice();
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (userTicket.getPrice() - balance) + " more cents.");
                    
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
