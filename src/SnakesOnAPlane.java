
public class SnakesOnAPlane {
public static void main(String[] args) {
	float totalVis=0;
	float ven=0;
	Plane plane= new Plane();
	
	for(int i=0;i< plane.snakes.size(); i++)
	{
		Snake s=plane.snakes.get(i);
		if(s.isVenomous())
		{
			ven++;
			totalVis+=s.getViciousness();
		}
		
	}
	totalVis=totalVis/ven;
	System.out.println(ven);
	System.out.println((ven*totalVis)/plane.getNumPassengers());
}
}
