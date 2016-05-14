import java.util.HashMap;
import java.util.Map.Entry;

public class StanfordHashMapProblem {

	public int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
	/*	int total = 0;
		for (Entry<String, String> i : map1.entrySet()) {
			for (Entry<String, String> x : map2.entrySet()) {
				if (x.equals(i)) {
					total += 1;
				}

			}
		}
		return total;*/
		 if(map1.entrySet().retainAll(map2.entrySet()));
		return map1.size();
		 
	}
}
