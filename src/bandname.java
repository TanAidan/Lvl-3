

	import java.awt.event.KeyEvent;
	import java.awt.event.KeyListener;
	import java.util.ArrayList;
	import java.util.Random;

	import javax.swing.JFrame;

	public class bandname implements KeyListener{
		ArrayList<String> jokes = new ArrayList<String>();
		 

		 ArrayList<String> punchlines = new ArrayList<String>();
		 public bandname(){
			 jokes.add(new String("Hydro"));
			 jokes.add(new String("Trump"));
			 jokes.add(new String("loser"));
			 punchlines.add(new String("Dub"));
			 punchlines.add(new String("Saturday"));
			 punchlines.add(new String("ozzy"));
		 }
		public static void main(String[] args) {
		bandname name= new bandname();
		JFrame frame=new JFrame();
		frame.setVisible(true);   
		frame.addKeyListener(name);

		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		Random numberGen=new Random();
		
		// TODO Auto-generated method stub
		
		if(e.getKeyCode()==KeyEvent.VK_SPACE){
			System.out.println(jokes.get(numberGen.nextInt(3)));

			System.out.println(punchlines.get(numberGen.nextInt(3)));

			}
		
	} 
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
