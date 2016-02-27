
public class Minion {
	private String color; 
    private String master;
    private String name; 
	private int eyes; 
	public  Minion(String name,int eyes,String color, String master)
	{
		this.color=color;
		this.master=master;
		this.name=name;
		this.eyes=eyes;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	
    public String getName()
    {
		return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
   
   
}
