package calculadora;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Calculadora extends JFrame{

		public Calculadora() {
			setVisible(true);
			setTitle("Calculadora" );
			setSize(1024,512);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			
		}
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			Graphics2D g2d = (Graphics2D) g;
			
			
			g2d.drawOval(200, 200, 80, 80);
			
			g2d.drawOval(200, 250, 80, 80);
			g2d.drawOval(220, 230, 80, 80);
			g2d.drawOval(180, 230, 80, 80);
			g2d.setColor(Color.RED);
			g2d.drawLine(400, 450, 80, 80);
			g2d.drawRoundRect(350, 300, 200, 200, 15, 15);
			
			
			g2d.drawRect(750, 260, 100, 100);
			g2d.drawRect(700, 220, 100, 100);
			g2d.drawLine(850, 360, 800, 320);
			g2d.drawLine(850, 260, 800, 220);
			g2d.drawLine(750, 360, 700, 320);
			g2d.drawLine(700, 220, 750, 260);
			
			
			
		}
}
