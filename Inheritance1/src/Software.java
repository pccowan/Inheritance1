public class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os;
    
    public String whatAmI()
    {
    	return "I am software";
    }
    
    @Override
    public boolean equals(Object obj)
    {
    	Software o = (Software) obj;
    	if (o.code.equals(code) && o.description.equals(description) && o.price == price && o.programmer.equals(programmer) && o.platform.equals(platform) && o.os.equals(os))
    		return true;
    	else
    		return false;
    }
    
	public String getProgrammer() {
		return programmer;
	}
	public void setProgrammer(String programmer) {
		this.programmer = programmer;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	} 


}