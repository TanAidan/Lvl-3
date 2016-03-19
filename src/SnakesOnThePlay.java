
public class SnakesOnThePlay {
	public static void main(String[] args) {
		float totalVis=0;
		
		Plane plane = new Plane();

		int deathProbability;
		for (int i = 0; i < plane.snakes.size(); i++) {
			 Snake s=plane.snakes.get(i);
			if(s.isVenomous()){
				
				totalVis+=s.getViciousness();
				
			}
		}
		
		System.out.println(totalVis/plane.getNumPassengers());
	}
	
}
