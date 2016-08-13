import java.util.ArrayList;

public class OncogeneDetector {
	public boolean isOncogene(ArrayList<String> healthySequences, ArrayList<String> cancerSequence, String Candidate) {
		boolean isCancer = false;
		float cancer = 0;
		float total = 0;
		String word = "";
		for (String letter : healthySequences) {
			if (letter.equals("")) {
				if (word.contains(Candidate)) {
					cancer++;

				} else {
					word = "";

				}

			} else {
				word = word + letter + " ";
			}
			total++;
		}

		// cancer sequence begins
		float cancer2 = 0;
		float total2 = 0;
		String word2 = "";
		for (String letter2 : cancerSequence) {
			if (letter2.equals("")) {
				if (word.contains(Candidate)) {
					cancer2++;

				} else {
					word2 = "";

				}

			} else {
				word2 = word2 + letter2 + " ";
			}
			total2++;
		}
		// cancer ends
		if ((cancer / total) > (cancer2 / total2)) {
			isCancer = false;
		} else {
			isCancer = true;
		}

		return isCancer;

	}
}