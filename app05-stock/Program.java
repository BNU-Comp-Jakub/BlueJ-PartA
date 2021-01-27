
/**
 * Write a description of class Program here.
 *
 * @author (Jakub Szupryczynski)
 * @version (16/01/2021)
 */
public class Program
{
    /**
    *Storing variables
    */
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();
    }
}
