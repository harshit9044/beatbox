package mymusicplayer;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyDrawPanel extends JPanel {

	public void paintComponent(Graphics g){
		g.fillRect(0,0,this.getWidth(),this.getHeight());
		
		int red=(int)(Math.random()*255);
		int green=(int)(Math.random()*255);
		int blue=(int)(Math.random()*255);
		
		Color randomcolor=new Color(red,green,blue);
		g.setColor(randomcolor);
		g.fillOval(70,70,100,100);
		
		
	}
	
}
