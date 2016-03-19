
public class Snake {
	randomness randomClass= new randomness();
private int viciousness;
private boolean venomous;
public Snake() {
	
	this.viciousness = randomClass.randomNumber();
	this.venomous =randomClass.truth();
}

public boolean isVenomous() {
	return venomous;
}

public void setVenomous(boolean venomous) {
	this.venomous = venomous;
}

public int getViciousness() {
	return viciousness;
}

public void setViciousness(int viciousness) {
	this.viciousness = viciousness;
}

}
