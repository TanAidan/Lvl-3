import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	Stack<String> puzzles = new Stack<String>();
	ArrayList<JLabel> boxes = new ArrayList<JLabel>();
	
	static String currentWord;
	int lives = 8;

	JLabel livesLabel = new JLabel(Integer.toString(lives));

	public static void main(String[] args) {
		HangMan hang = new HangMan();
		hang.addPuzzles();
		hang.createUI();

	}

	public void createUI() {

		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		frame.addKeyListener(this);
		frame.setSize(500, 500);

	}

	public void addPuzzles() {
		puzzles.push("computer");
		puzzles.push("robotics");

	}

	private String getCurrentAnswer() {
		StringBuffer answer = new StringBuffer();
		for (JLabel textBox : boxes) {
			answer.append(textBox.getText());
		}
		return answer.toString();
	}

	private void s(char keyChar) {
		int correct = 0;
		for (int i = 0; i < currentWord.length(); i++) {

			if (currentWord.charAt(i) == keyChar) {
			boxes.get(i).setText("" + keyChar);
				correct += 1;
			}

		}
		if (correct == 0) {
			lives -= 1;
			System.out.println(lives);
			livesLabel.setText(Integer.toString(lives));
			
		}
		if (getCurrentAnswer().equals(currentWord)) {
			System.out.println("Congrats you solved it");
			currentWord = null;
			lives=8;
			livesLabel.setText(Integer.toString(lives));
			

		}
		if (lives <= 0) {
			System.out.println("You have lost the game will now exit");
			playDeathKnell();
			System.exit(0);
		}
frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("hi");
		if (currentWord == null) {
			try {
				currentWord = randomWord();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			panel.removeAll();
			boxes.clear();
			for (int i = 0; i < currentWord.length(); i++) {

				System.out.println(currentWord);
				JLabel box = new JLabel();
				box.setText("_");

				boxes.add(box);
				panel.add(box);

			}
			panel.add(livesLabel);
			livesLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

			frame.pack();
		} else {
			s(e.getKeyChar());
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
	public void playDeathKnell() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/funeral-march.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(8400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public String randomWord() throws IOException
	{
		Runtime rt = Runtime.getRuntime();
		String[] commands = {"perl -e 'open IN, \"</usr/share/dict/words\";rand($.) < 1 && ($n=$_) while <IN>;print $n'"};
		Process proc = rt.exec(commands);

		BufferedReader stdInput = new BufferedReader(new 
		     InputStreamReader(proc.getInputStream()));

		BufferedReader stdError = new BufferedReader(new 
		     InputStreamReader(proc.getErrorStream()));

		// read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		while ((s = stdInput.readLine()) != null) {
		    System.out.println(s);
		} 

		// read any errors from the attempted command
		System.out.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
		    System.out.println(s);
		}
		return s;

	}
	
}
