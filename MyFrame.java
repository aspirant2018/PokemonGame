import java.awt.GridLayout;

import javax.swing.*;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		
		setTitle("myFrame");
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// initializing my Map
		Map myMap = new Map(10,10);
		
		JPanel panel = new JPanel(new GridLayout(myMap.getHeight(), myMap.getWidth()));
		
		for (int i = 0 ; i < myMap.getHeight();i++) {
			for (int j = 0 ; j < myMap.getWidth();j++) {
				 JLabel label = new JLabel();
				 // a completer
				
			}
			 
			  
		}
		
		
		
		
	}

}
