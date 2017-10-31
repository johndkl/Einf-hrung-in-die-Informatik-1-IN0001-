package learn_jframe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Mouse extends JFrame {
	int x=100,y=100;
	public Mouse(){
		
//		this.addMouseMotionListener(new MouseMotionListener() {			
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				// TODO Auto-generated method stub
//				x=e.getX();
//				y=e.getY();
//				repaint();
//			}
//			
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				// TODO Auto-generated method stub				
//			}
//		});
//		
		this.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				x=arg0.getX();
				y=arg0.getY();
				repaint();
			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		setSize(300,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		super.paint(g);
		//初始化小球
		g.setColor(Color.GREEN);
		g.fillOval(x, y, 30, 30);
		
	}
	
	public static void main(String args[]){
		new Mouse();
	}
}