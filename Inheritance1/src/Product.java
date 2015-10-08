import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable
    public String whatAmI()
    {
    	return "I am a product";
    }
    
    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    
    
    
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
    	NumberFormat currency = NumberFormat.getCurrencyInstance();
		String priceString = currency.format(price);
		
		return priceString;
		
		
	}
	// create public access for the count variable
    public static int getCount()   
    {
    	
        return count;
    }
}
