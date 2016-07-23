import java.util.ArrayList;
import java.util.List;

public class Sound
{
	public Sound(List<Integer> sample) {
	super();
	this.sample.addAll(sample) ;
}
 /** the array of values in this sound; guaranteed not to be null */
	private List<Integer> sample= new ArrayList<Integer>() ;
 /** Changes those values in this sound that have an amplitude greater than limit.
 * Values greater than limit are changed to limit.
 * Values less than -limit are changed to -limit.
 * @param limit the amplitude limit
 * Precondition: limit ≥ 0
 * @return the number of values in this sound that this method changed
 */
 public int limitAmplitude(int limit)
 {
	 int total=0;
	 for (int i=0; i<sample.size(); i++)
	 {
		if (sample.get(i)>limit) {
			sample.remove(i);
			sample.add(i, limit);
			total++;
		}
		else if(sample.get(i)<limit*-1)
		{
			sample.remove(i);
			sample.add(i,limit*-1);
			total++;
			
		}
	 }
		 
	 return total;
	 }
 
 

public List<Integer> getSample() {
	return sample;
}



public void setSample(List<Integer> sample) {
	this.sample = sample;
}



public void trimSilenceFromBeginning()
 { 
	int index=0;
	while(sample.get(index)==0)
	{
	sample.remove(index);
	
	}
	
 }

} 