
public class Robot implements FuelRobot{
private boolean facingRight=true;
int currentLocation=0;

	@Override
	public int getCurrentIndex() {
	
		// TODO Auto-generated method stub
		return  currentLocation;
	}

	@Override
	public boolean isFacingRight() {
		// TODO Auto-generated method stub
		return facingRight;
	}

	@Override
	public void changeDirection() {
		// TODO Auto-generated method stub
		facingRight=!facingRight;
				
	}

	@Override
	public void moveForward(int numLocs) {
		// TODO Auto-generated method stub
		if(facingRight)
		{
			currentLocation++;
		}
		else
		{
			currentLocation--;
		}
	}

	public Robot(boolean facingRight, int currentLocation) {
		super();
		this.facingRight = facingRight;
		this.currentLocation = currentLocation;
	}

}
