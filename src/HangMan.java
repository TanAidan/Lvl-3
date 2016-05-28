import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Stack<String> puzzles = new Stack<String>();
	ArrayList<JLabel> boxes=new ArrayList<JLabel>();
	
	public static void main(String[] args) {
		HangMan hang= new HangMan();
		hang.createUI();
		hang.addPuzzles();
	}

	public void createUI() {
		
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		
		

	}

	public void addPuzzles() {
		puzzles.push("computer");
		puzzles.push("robotics");
		
		
	}

	/*private void updateSpacesWithUserInput(char keyChar) {
		for (int i = 0; i < puzzle.length(); i++) {
			if (puzzle.charAt(i) == keyChar) {
				boxes.get(i).setText("" + keyChar);
			}
		}

	}
	*/

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		
		String word=puzzles.pop();
		panel.removeAll();
		
		for(int i=0;i<word.length();i++)
		{
			System.out.println(word);
			JLabel box= new JLabel();
			box.setText("_");
			boxes.add(box);
			panel.add(box);
		}
	}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
