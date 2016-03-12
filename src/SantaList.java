import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SantaList implements MouseListener{ 
	ArrayList<JLabel> images =new ArrayList<JLabel>();

	String picture="http://wmmsdiscovery.weebly.com/uploads/2/2/8/3/22830118/3729153_orig.jpg";
	String cupcakes="http://foodnetwork.sndimg.com/content/dam/images/food/fullset/2010/5/26/2/cw_set-art-multi-cupcakes_s4x3.jpg";
	String pastery= "http://www.lamaisonduchocolat.com/external/img/macarons-eclairs.png";
	JPanel panel=new JPanel();
	JFrame frame= new JFrame();
public static void main(String[] args) {
	
	SantaList santa= new SantaList();
	
	santa.initialize();
	
	


 
}
private JLabel loadImageFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
	return null;
	}

private JLabel loadImageFromJavaProject(String fileName) {
	 URL imageURL = getClass().getResource(fileName);
	 Icon icon = new ImageIcon(imageURL);
	 return new JLabel(icon);
}
@Override
public void mouseClicked(MouseEvent e) {
	Random numberGen=new Random();
	int number=numberGen.nextInt(images.size());
	panel.removeAll();
panel.add(images.get(number));
panel.repaint();
System.out.println("hi");
	
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
public void initialize(){
	images.add(loadImageFromTheInternet(picture));
	images.add(loadImageFromTheInternet(cupcakes));
	images.add(loadImageFromTheInternet(pastery));

    
   
    frame.add(panel);
    
    frame.setVisible(true);
    frame.pack();
    frame.addMouseListener(this);
}

}
