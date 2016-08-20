import java.util.ArrayList;

public class OncogeneDetector {
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequence, String Candidate)  {
		boolean isCancer = false;
		float cancer = 0;
		float total = 0;
		if(Candidate.matches("[TGCA]*")==false)
		{
			throw new IllegalArgumentException("candidate must contain only the letters A, C, G or T");
				}
		
		if(healthySequences.size()==0)
		{
			
				throw new IllegalArgumentException("healthySequences must contain at least one element");
			
		}
			
		for (String letter : healthySequences) {
			//System.out.println(letter);
			if(letter.matches("[TGCA]*")==false)
			{
				throw new IllegalArgumentException();
			}
				if( letter.contains(Candidate)) {
					cancer++;

				} 

			
			total++;
		}

		// cancer sequence begins
		float cancer2 = 0;
		float total2 = 0;
		if(cancerSequence.size()==0)
		{
			
				throw new IllegalArgumentException("cancerSequences must contain at least one element");
			
		}
		for (String letter2 : cancerSequence) {
			if(letter2.matches("[TGCA]*")==false)
			{
				throw new IllegalArgumentException();
			}
			System.out.println(letter2);
				if (letter2.contains(Candidate)) {
					cancer2++;

				} 
			total2++;
		}
		// cancer ends
		System.out.println(cancer2);
		System.out.println(total2);
		if ((cancer / total) > (cancer2 / total2)) {
			isCancer = false;
		} 
		else if ((cancer / total) == (cancer2 / total2)) {
			isCancer=false;
		}
		else {
			isCancer = true;
		}

		return isCancer;

	}
}