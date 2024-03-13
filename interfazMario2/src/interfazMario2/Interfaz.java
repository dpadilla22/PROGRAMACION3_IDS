package interfazMario2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Interfaz extends JFrame {
	
	
	public Interfaz() {
	setVisible(true);
	setSize(800, 450);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setColor(new Color(88, 111, 246));
		g2d.fillRect(0, 0, 800, 500);
		
		//nube//
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(150, 320, 150, 35, 30, 30);
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(290, 290, 120, 35, 30, 30);
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(290, 350, 120, 45, 30, 30);
		
		//montaña//
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(610, 130, 80, 35, 30, 30);
		
		g2d.setColor(new Color(184, 235, 236));
		g2d.fillRoundRect(50, 150, 120, 300, 80, 80);
		g2d.setColor(new Color(184, 235, 236));
		g2d.fillRoundRect(380, 150, 120, 300, 80, 80);
		g2d.setColor(new Color(184, 235, 236));
		g2d.fillRoundRect(500, 60, 120, 400, 80, 80);
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(450, 240, 120, 25, 30, 30);
		
		
		g2d.setColor(new Color(120, 174, 205));
		g2d.fillRoundRect(0, 290, 120, 130, 80, 80);
		g2d.setColor(new Color(120, 174, 205));
		g2d.fillRoundRect(380, 270, 150, 150, 80, 80);
		g2d.setColor(new Color(120, 174, 205));
		g2d.fillRoundRect(530, 190, 160, 250, 80, 80);
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(620, 100, 110, 35, 30, 30);
		
		//piso//
		
		g2d.setColor(new Color(240, 178, 122));
		g2d.fillRect(0, 400, 800, 100);
		g2d.setColor(new Color(46, 204, 113));
		g2d.fillRect(0, 390, 800, 10);
		//tubo//
		
		
		g2d.setColor(new Color(77,72,149));
		g2d.fillRect(430, 290, 80,100 );
		g2d.fillRect(423, 280, 93,30 );

		g2d.setColor(new Color(235,245,253));
		g2d.fillRect(450, 280,6, 110);

		g2d.setColor(new Color(125, 123, 192));
		g2d.fillRect(440, 280,9, 110);
		g2d.setColor(new Color(125, 123, 192));
		g2d.fillRect(455, 280,12, 110);
		g2d.setColor(new Color(112,106,181));
		g2d.fillRect(465, 280,9, 110);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(425, 310, 4, 80);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(510, 310, 4, 80);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(420, 310, 100, 5);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(420, 280, 4, 30);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(515, 280, 4, 30);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(420, 280, 100, 4);
		
		
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(630,360 , 150, 30, 30, 30);
		
		//cuadros//
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(680, 350, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(680, 310, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(680, 270, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(680, 270, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(680, 230, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(720, 230, 40, 40,10,10);
		g2d.setColor(Color.black);
		g2d.fillRoundRect(760, 230, 40, 40,10,10);
		//
		g2d.setColor(new Color(225, 226, 226));
		g2d.fillRoundRect(683, 353, 35, 35,35,10);
		g2d.setColor(new Color(225, 226, 226));
		g2d.fillRoundRect(683, 313, 35, 35,10,10);
		g2d.setColor(new Color(225, 226, 226));
		g2d.fillRoundRect(683, 273, 35, 35,10,10);
		g2d.setColor(new Color(225, 226, 226));
		g2d.fillRoundRect(683, 273, 35, 35,10,10);
		g2d.setColor(new Color(225, 226, 226));
		
		g2d.fillRoundRect(683, 233, 35, 35,10,10);
		g2d.setColor(new Color(255, 224, 60));
		g2d.fillRoundRect(723, 233, 35, 35,10,10);
		g2d.setColor(new Color(255, 224, 60));
		g2d.fillRoundRect(763, 233, 35, 35,10,10);
		g2d.setColor(Color.BLACK);
		g2d.fillOval(732, 240, 5, 10);
		g2d.setColor(Color.BLACK);
		g2d.fillOval(745, 240, 5, 10);
		
		///tubo2//
		
		g2d.setColor(new Color(77,72,149));
		g2d.fillRect(725, 340, 60, 50);
		g2d.setColor(new Color(77,72,149));
		g2d.fillRect(720, 320, 70, 30);
		

		g2d.setColor(new Color(125, 123, 192));
		g2d.fillRect(730, 320,9, 70);
		
		g2d.setColor(new Color(235,245,253));
		g2d.fillRect(735, 320,12, 70);
		g2d.setColor(new Color(112,106,181));
		g2d.fillRect(740, 320,9, 70);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(720, 320, 3, 30);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(790, 320, 3, 30);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(720, 350, 80, 3);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(720, 320, 80, 3);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(720, 320, 3, 70);
		g2d.setColor(Color.BLACK);
		g2d.fillRect(785, 350, 3, 40);
		
		
		//nube//
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(0, 200, 150, 30, 30, 30);
		g2d.setColor(Color.WHITE);
		g2d.fillRoundRect(240, 210, 180, 30, 30, 30);
		
		g2d.fillRoundRect(70, 250, 20, 25, 30, 30);
		g2d.fillRoundRect(120, 230, 20, 25, 30, 30);
		g2d.fillRoundRect(120, 170, 20, 25, 30, 30);
		g2d.fillRoundRect(410, 240, 20, 25, 30, 30);
		g2d.fillRoundRect(410, 180, 20, 25, 30, 30);
		g2d.fillRoundRect(450, 160, 20, 25, 30, 30);
		g2d.fillRoundRect(520, 160, 20, 25, 30, 30);
		g2d.fillRoundRect(550, 100, 20, 25, 30, 30);
		
		
		
	
	}
	



}

