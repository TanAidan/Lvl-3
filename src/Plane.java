import java.util.ArrayList;

public class Plane {
private int numPassengers=100;
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	public Plane( ) {
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake());
		}
	}
	public int getNumPassengers() {
		return numPassengers;
	}
	public void setNumPassengers(int numPassengers) {
		this.numPassengers = numPassengers;
	}
	
	
}
