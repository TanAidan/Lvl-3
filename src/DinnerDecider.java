import java.util.ArrayList;
import java.util.Random;

public class DinnerDecider {
	public static void main(String[] args) {

		 ArrayList<String> dinner = new ArrayList<String>();
		 
		
		while(true) {
			 dinner.add(new String("taco"));
			 dinner.add(new String("noodles"));
			 dinner.add(new String("noodles"));
			 dinner.add(new String("rice <3"));
			 System.out.println(dinner.size());
	/* Random numberGen=new Random();
			 int number=numberGen.nextInt(dinner.size());
			System.out.println(dinner.get(number));
		 System.out.println(number);*/
		}
		 
	}

}
