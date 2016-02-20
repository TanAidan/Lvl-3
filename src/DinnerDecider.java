import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	public static void main(String[] args) {

		 ArrayList<String> dinner = new ArrayList<String>();
		 dinner.add(new String("taco"));
		 dinner.add(new String("noodles"));
		 dinner.add(new String("rice <3"));
		 Random numberGen=new Random();
		 int number=numberGen.nextInt(dinner.size());
		 System.out.println(dinner.get(number));
	}

}
