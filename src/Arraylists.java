import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Arraylists {
public static void main(String[] args) {
	int king=10;
	int queen=10;
	int Jack=10;
	int ace=1;
	ArrayList<Integer>Cards=new ArrayList<Integer>();
	Cards.add(new Integer(3));
	Cards.add(new Integer(2));
	Cards.add(new Integer(4));
	Cards.add(new Integer(5));
	Cards.add(new Integer(6));
	Cards.add(new Integer(7));
	Cards.add(new Integer(8));
	Cards.add(new Integer(9));
	Cards.add(new Integer(king));
	Cards.add(new Integer(queen));
	Cards.add(new Integer(Jack));
	Cards.add(new Integer(ace));
  // String answer=JOptionPane.showInputDialog("Do you want to draw?");
	 Random numberGen=new Random();
	 
for(int i=0;i<2;i++)
{ 
	int number=numberGen.nextInt(Cards.size());
	
	System.out.println(Cards.get(number));
}
   
}
}
