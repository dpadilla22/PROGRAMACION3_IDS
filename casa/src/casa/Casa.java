package casa;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class Casa extends JFrame {

	public Casa() {
		setVisible(true);
		setSize(800, 700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(540, 300, 50, 5);

		g2d.setColor(new Color(90, 154, 255));
		g2d.fillRect(0, 0, 800, 700);

		g2d.setColor(new Color(213, 170, 83));
		g2d.fillRect(0, 370, 800, 100);

		g2d.setColor(new Color(255, 220, 111));
		g2d.fillRect(220, 240, 350, 300);
		///

		g2d.setColor(new Color(129, 129, 129));
		g2d.fillRect(480, 120, 70, 90);
		g2d.setColor(new Color(104, 103, 101));
		g2d.fillRect(470, 100, 90, 35);

		g2d.setColor(new Color(99, 77, 6));
		g2d.fillRect(0, 600, 800, 100);
		g2d.setColor(new Color(255, 227, 142));
		g2d.fillRect(0, 550, 800, 50);
		g2d.setColor(new Color(166, 251, 123));
		g2d.fillRect(0, 530, 800, 40);
		g2d.setColor(new Color(33, 99, 0));
		g2d.fillRect(0, 520, 800, 20);
		g2d.setColor(new Color(129, 129, 129));
		g2d.fillRect(200, 480, 390, 40);
		///

		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 270, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 300, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 330, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 360, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 390, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 420, 350, 3);
		g2d.setColor(new Color(106, 69, 33));
		g2d.fillRect(220, 450, 350, 3);

		g2d.setColor(new Color(165, 125, 35));
		g2d.fillRect(250, 260, 100, 220);

		g2d.setColor(Color.white);
		g2d.fillRect(440, 260, 100, 90);

		g2d.setColor(new Color(105, 9, 0));
		int[] yS = { 240, 50, 240 };
		int[] xS = { 180, 310, 600 };
		g2d.fillPolygon(xS, yS, 3);

		g2d.setColor(Color.white);
		g2d.fillOval(330, 390, 15, 15);

		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(10, 320, 50, 200);
		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(80, 320, 50, 200);
		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(150, 320, 50, 200);
		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(580, 320, 50, 200);
		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(650, 320, 50, 200);
		g2d.setColor(new Color(235, 184, 81));
		g2d.fillRect(720, 320, 50, 200);

		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(440, 260, 100, 10);
		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(440, 350, 110, 5);
		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(440, 260, 10, 90);
		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(440, 350, 100, 5);
		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(540, 260, 10, 90);

		g2d.setColor(new Color(205, 53, 20));
		g2d.fillRect(490, 260, 10, 90);

		g2d.setColor(new Color(129, 129, 129));
		g2d.fillRect(430, 355, 130, 20);

	}
}
