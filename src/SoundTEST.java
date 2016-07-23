import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SoundTEST {
	@Test
	public void testLimitAmplitude() {
		List<Integer> values= Arrays.asList(new Integer[] { 40,2532,17,-2300,-17,-4000,2000,1048,-420,33,15,-32,2030,3223});
	 Sound s=new Sound( values);
		assertEquals(5, s.limitAmplitude(2000));
	}
	@Test
	public void testTrimSilenceFromBeginning() {
		List<Integer> values= Arrays.asList(new Integer[] { 0,0,0,0,-14,0,-35,-39,0,-7,16,32,37,29,0,0});
	 Sound s=new Sound( values);
	 List<Integer>endResult=Arrays.asList(new Integer[] {-14,0,-35,-39,0,-7,16,32,37,29,0,0});
		s.trimSilenceFromBeginning();
		assertEquals(endResult, s.getSample());
	}

}
