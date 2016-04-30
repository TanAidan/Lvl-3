import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RosettaStone implements ActionListener{ 
	HashMap<String,String> t= new HashMap<String,String>();
	JFrame frame=new JFrame("Translator");
	JPanel panel=new JPanel();
	JButton button=new JButton();
	JLabel label= new JLabel();
public static void main(String[] args) {
	RosettaStone r = new RosettaStone();
	r.UI();
	
}

public void UI()
{

frame.add(panel);
panel.add(button);
frame.setVisible(true);
panel.add(label);
button.addActionListener(this);


t.put("gustar","To like");
t.put("creer","To think");
t.put("manos","hands");
t.put("tarea","homework");
t.put("llevar","to carry");
t.put("decir","To say");
t.put("Infantil","child");
t.put("mundo","world");
t.put("deportista","athlete");
t.put("almorzar","to eat lunch");
t.put("linterna","flashlight");
t.put("correr","to run");
t.put("andar","To walk");
t.put("antiguo","old");
t.put("ganar","to win");
button.setText(getRandomKey(t));
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if( e.getSource().equals(button))
	{
		
		label.setText(t.get(button.getText()));
		label.repaint();
		
		
		
		
	}
	button.setText(getRandomKey(t));
	frame.pack();
}



	


public String getRandomKey(HashMap<String,String>map)
{
	String[] keysAsArray=map.keySet().toArray(new String[0]);
	int randomness=new Random().nextInt(map.size());
	return keysAsArray[randomness];
	
	
}
}
