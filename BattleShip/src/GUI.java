import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;


public class GUI extends Tester{
	
	JFrame GUI;
	
	public GUI() {


		GUI = new JFrame("Battleship");
		GUI.setLayout(new GridLayout(10,10));
		GUI.setSize(500, 500);

		
		
	}
	
	public void printBoard(String[][] field) {
		

		
		GUI.getContentPane().removeAll();
		GUI.repaint();
		
		for (int i = 0; i < 10; i++) {
			for (int k = 0; k < 10; k++) {
				JButton button = new JButton(field[i][k]);
				GUI.add(button);
				int x = i;
				int y = k;
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae) {
						GUIClick(x, y);
					}
				});
			}
		}
		
		GUI.setVisible(true);
	
		
		
	}
	
	public void printMessage(String s) {
		GUI.add(new JLabel(s));
		GUI.setVisible(true);
		
	}
	
	
	
	
	
}
