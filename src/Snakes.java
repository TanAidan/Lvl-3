
public class Snakes {
	randomness2 ran= new randomness2();
	int viciousness;
	boolean venomous;
	public Snakes() {
		
		this.viciousness = ran.numbers();
		this.venomous = ran.Random();
	}
	public int getViciousness() {
		return viciousness;
	}
	public void setViciousness(int viciousness) {
		this.viciousness = viciousness;
	}
	public boolean isVenomous() {
		return venomous;
	}
	public void setVenomous(boolean venomous) {
		this.venomous = venomous;
	}
	
	
	

}
