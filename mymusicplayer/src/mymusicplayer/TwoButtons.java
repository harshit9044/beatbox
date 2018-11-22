package mymusicplayer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoButtons {

	JFrame frame;
	JLabel label;
	
	public static void main(String[] args){
		
		TwoButtons gui=new TwoButtons();
		gui.go();
		
	} 
	
	public void go(){
		
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton labelbutton=new JButton("change label");
		labelbutton.addActionListener(new LabelListener());
		
		JButton colorbutton=new JButton("change color");
		colorbutton.addActionListener(new ColorListener());
		
		label=new JLabel("I am a JLabel");
		MyDrawPanel drawpanel=new MyDrawPanel();
		
		frame.getContentPane().add(BorderLayout.SOUTH,colorbutton);
		frame.getContentPane().add(BorderLayout.EAST,labelbutton);
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.getContentPane().add(BorderLayout.CENTER,drawpanel);
		
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		
	}
	
    class ColorListener implements ActionListener{
	
	public void actionPerformed(ActionEvent event){
		frame.repaint();
	}
	
    }
    
	class LabelListener implements ActionListener{
		
		public void actionPerformed(ActionEvent event){
			label.setText("Ouchh..");
		}
		
	}
	
	
}
