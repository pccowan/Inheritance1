public class Book extends Product {
    
	private String author;
    private int pages;
    
    public String whatAmI()
    {
    	return "I am a book";
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	Book o = (Book) obj;
    	if (o.code.equals(code) && o.description.equals(description) && o.price == price && o.author.equals(author) && o.pages == pages)
    		return true;
    	else
    		return false;
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
