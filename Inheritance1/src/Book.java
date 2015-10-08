public class Book extends Product {
    
	private String author;
    private int pages;
    
    public String whatAmI()
    {
    	return "I am a book";
    }
    
    
    
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}

}
