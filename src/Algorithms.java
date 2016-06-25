import java.util.List;

public class Algorithms {
	
	public static Object findBrokenEgg(List<String> eggs) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object countPearls(List<Boolean> oysters) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Object findLongestWord(List<String> words) {
		// TODO Auto-generated method stub
		return null;
	}

	public static boolean containsSOS(List<String> message1) {
		
		String word = "";
		for (String letter : message1) {
			if (letter.equals("/")) {
				if (word.equals("... --- ... ")) {
					return true;

				} else {
					word = "";
					
				}

			} else {
				word =word+letter+" ";
			}

		}
		return false;

	}

	public static List<Double> sortScores(List<Double> results) {
		results.sort(null);
		return results;
	}

	public static Object sortDNA(List<String> unsortedSequences) {
		unsortedSequences.sort(new LengthCompare());
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
words.sort(null);
return words;
	}

}
