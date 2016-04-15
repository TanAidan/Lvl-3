import java.util.ArrayList;

public class Planes {

	int numberOfPassengers=100;
	
	ArrayList<Snake> snakes= new ArrayList<Snake>();
	
	public Planes(){
		
	for(int i=0; i<100;i++)
	{
		snakes.add(new Snake());
		
	}
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}
	
}
