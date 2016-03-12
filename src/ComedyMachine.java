import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class ComedyMachine implements KeyListener{
	ArrayList<String> jokes = new ArrayList<String>();
	 

	 ArrayList<String> punchlines = new ArrayList<String>();
	 public ComedyMachine(){
		 jokes.add(new String("What does a cannibal do after dumping his girl friend"));
		 jokes.add(new String("what do you call the security guards outside Samsung"));
		 jokes.add(new String("A mexican magician tells the audience he will disappear on the count of 3. "));
		 punchlines.add(new String("he wipes his butt"));
		 punchlines.add(new String("the guardians of the galaxy"));
		 punchlines.add(new String("He says Uno, dos...AND THEN *POOF*... he disappeared without a tres"));
	 }
	public static void main(String[] args) {
	ComedyMachine comedy= new ComedyMachine();
	JFrame frame=new JFrame();
	frame.setVisible(true);   
	frame.addKeyListener(comedy);

	
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {

	// TODO Auto-generated method stub
	
	if(e.getKeyCode()==KeyEvent.VK_SPACE){
		System.out.println(jokes.get(number));
		System.out.println(punchlines.get(number));
		}
	
} 
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}