import java.util.ArrayList;
import java.util.List;

public class FuelDepot
{
 /** The robot used to move the filling mechanism */
 private FuelRobot filler;
 /** The list of fuel tanks */
 private List <FuelTank> tanks;
 /** Determines and returns the index of the next tank to be filled.
 * @param threshold fuel tanks with a fuel level £ threshold may be filled
 * @return index of the location of the next tank to be filled
 * Postcondition: the state of the robot has not changed
 */
 public int nextTankToFill(int threshold)
 {
	 int fill=filler.getCurrentIndex();
	 for(int i=0; i<tanks.size();i++)
	 {
		 if(tanks.get(i).getFuelLevel()<=threshold && tanks.get(i).getFuelLevel()<tanks.get(fill).getFuelLevel())
		 {
			 fill=i;
		 }
	 }
	return fill; /* to be implemented in part (a) */ }

 public void moveToLocation(int locIndex)
 { 
	 if (locIndex<0) {
		locIndex=0;
	}
	 if(filler.getCurrentIndex()>6)
	 {
	
	 }
	 if(filler.getCurrentIndex()<0)
	 {
		filler.getCurrentIndex()=6;
	 }
	 if(filler.getCurrentIndex()>locIndex && filler.isFacingRight())
	 {
		filler.changeDirection();
		filler.moveForward(filler.getCurrentIndex()-locIndex);
	 }
	 else  if(filler.getCurrentIndex()>locIndex && !filler.isFacingRight())
	 {
		filler.moveForward(filler.getCurrentIndex()-locIndex);
	 }
	 else  if(filler.getCurrentIndex()<locIndex && filler.isFacingRight())
	 {
		filler.moveForward(locIndex-filler.getCurrentIndex());
	 }
	 else  if(filler.getCurrentIndex()<locIndex && !filler.isFacingRight())
	 {
		 filler.changeDirection();
		filler.moveForward(locIndex-filler.getCurrentIndex());
	 }
	 
	
 }
public FuelDepot() {
	super();
	this.filler = new Robot(true,2);
	this.tanks = new ArrayList<>();
	tanks.add(new Tank(80));
	tanks.add(new Tank(70));
	tanks.add(new Tank(20));
	tanks.add(new Tank(45));
	tanks.add(new Tank(50));
	tanks.add(new Tank(25));
}
} 