import java.util.List;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		int answer=0;
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked"))
			{
				answer+=i;
				break;
			}
		}
		return answer;
		
		
	}

	public static  int countPearls(List<Boolean> oysters) {
		int count=0;
		for(int i=0; i<oysters.size(); i++)
		{
			if(oysters.get(i)==true)
			{
				count++;
			}
		}
		return count;
	}

	public static  double findTallest(List<Double> peeps) {
		Double tallest=peeps.get(0);
		for (int i = 1; i <peeps.size(); i++) {
			if(peeps.get(i)>tallest){
				tallest=peeps.get(i);
			}
		}
		System.out.println(tallest);
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int value=0;
		int biggest=words.get(0).length();
		for (int i = 1; i < words.size(); i++) {
			if(words.get(i).length()>biggest){
				biggest=words.get(i).length();
				value=i;
			}
		}
		return words.get(value);
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
