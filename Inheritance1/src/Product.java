import java.text.NumberFormat;

public class Product
{
    protected String code;
    protected String description;
    protected double price;
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
    
    public boolean equals(Object obj)
    {
    	Product o = (Product) obj;
    	if (o.code.equals(code) && o.description.equals(description) && o.price == price)
    		return true;
    	else
    		return false;
    }
    
    
	// create public access for the count variable
    public static int getCount()   
    {
    	
        return count;
    }
}
