
public class Tank implements FuelTank {
int fuelLevel;
	@Override
	public int getFuelLevel() {
		// TODO Auto-generated method stub
		return fuelLevel;
	}
	public Tank(int fuelLevel) {
		super();
		this.fuelLevel = fuelLevel;
	}

}
