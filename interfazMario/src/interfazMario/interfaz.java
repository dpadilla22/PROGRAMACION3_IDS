package interfazMario;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class interfaz extends JFrame {

	public interfaz() {
		setVisible(true);
		setSize(800, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;

		// fondo//
		g2d.setColor(new Color(173, 216, 230));
		g2d.fillRect(0, 0, 800, 500);
		// cuadro azul//
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(290, 230, 140, 200, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillRoundRect(245, 198, 150, 700, 10, 10);
		g2d.setColor(new Color(94, 176, 235));
		g2d.fillRoundRect(250, 200, 150, 700, 10, 10);
		
		
		
		
		
		g2d.setColor(new Color(61, 126, 255));
		g2d.fillRoundRect(392, 198, 7, 300, 10, 10);
		g2d.setColor(new Color(61, 126, 255));
		g2d.fillRoundRect(300, 425, 100, 5, 10, 10);
		
		
		g2d.setColor(Color.black);
		g2d.fillOval(255, 210, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(258, 210, 12, 12);
		
		g2d.setColor(Color.black);
		g2d.fillOval(380, 210, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(384, 210, 12, 12);
		
		// cuadro rosa//
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(200, 310, 120, 120, 10, 10);

		g2d.setColor(Color.black);
		g2d.fillRoundRect(146, 288, 140, 145, 10, 10);

		g2d.setColor(new Color(245, 183, 177));
		g2d.fillRoundRect(150, 290, 140, 140, 10, 10);
		g2d.setColor(new Color( 233, 150, 122));
		g2d.fillRoundRect(283, 290, 7, 145,10,10);
		g2d.setColor(new Color( 233, 150, 122));
		g2d.fillRoundRect(148, 425, 130, 5,10,10);
		
		
		////
		g2d.setColor(Color.black);
		g2d.fillOval(270, 295, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(272, 295, 12, 12);
		
		g2d.setColor(Color.black);
		g2d.fillOval(270, 410, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(272, 410, 12, 12);
		
		g2d.setColor(Color.black);
		g2d.fillOval(155, 410, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(158, 410, 12, 12);
		
		g2d.setColor(Color.black);
		g2d.fillOval(155, 295, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(158, 295, 12, 12);

		// cuadro verde//
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(665, 288, 140, 140, 10, 10);

		g2d.setColor(new Color(79, 187, 67));
		g2d.fillRoundRect(670, 290, 140, 140, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(680, 295, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(684, 295, 12, 12);
		g2d.setColor(new Color(34, 139, 34));
		g2d.fillRoundRect(670, 420, 150, 10, 10, 10);
		
		g2d.setColor(Color.black);
		g2d.fillOval(680, 410, 15, 15);
		g2d.setColor(Color.gray);
		g2d.fillOval(684, 410, 12, 12);
		
		
		
			BufferedImage imagen;
			try {
				imagen = ImageIO.read(new File("src/marioBros.png"));
				g2d.drawImage(imagen,370,290,null);
				imagen = ImageIO.read(new File("src/planta.png"));
				g2d.drawImage(imagen,490,205,null);
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		// cuadros cafe//
		

		g2d.setColor(new Color(202, 111, 30));
		g2d.fillRect(50, 230, 40, 40);

		g2d.setColor(Color.black);
		g2d.fillRect(50, 230, 40, 3);
		
		g2d.setColor(new Color(202, 111, 30));
		g2d.fillRect(100, 100, 40, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(50, 230, 5, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(90, 230, 2, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(50, 270, 42, 2);

		
		g2d.setColor(new Color(202, 111, 30));
		g2d.fillRect(140, 100, 40, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(140, 100, 5, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(100, 100, 3, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(100, 100, 80, 3);
		g2d.setColor(Color.black);
		g2d.fillRect(100, 100, 2, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(100, 140, 80, 3);
		g2d.setColor(Color.black);
		g2d.fillRect(180, 100, 2, 42);
		
		
		g2d.setColor(new Color(202, 111, 30));
		g2d.fillRect(690, 150, 40, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(690, 150, 3, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(730, 150, 3, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(690, 150, 40, 1);
		g2d.setColor(Color.black);
		g2d.fillRect(690, 190, 43, 1);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(58, 235, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(58, 260, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(82, 235, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(82, 260, 5, 5,5,5);

		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(105, 105, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(105, 130, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(130, 105, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(130, 130, 5, 5,5,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(150, 105, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(150, 130, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(170, 105, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(170, 130, 5, 5,5,5);
		
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(695, 155, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(695, 180, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(720, 155, 5, 5,5,5);
		g2d.setColor(Color.BLACK);
		g2d.fillRoundRect(720, 180, 5, 5,5,5);

		// piso//
		g2d.setColor(new Color(229, 152, 102));
		g2d.fillRect(0, 450, 800, 50);
		g2d.setColor(new Color(245, 183, 177));
		g2d.fillRect(0, 430, 800, 20);
		g2d.setColor(Color.black);
		g2d.fillRect(0, 430, 800, 3);
		g2d.setColor(new Color(64, 36, 5));
		g2d.fillRect(0, 450, 800, 3);

		// planta//
		g2d.setColor(new Color(36, 125, 26));
		g2d.fillRect(500, 330, 80, 100);
		g2d.setColor(new Color(36, 125, 26));
		g2d.fillRect(495, 300, 90, 40);
		g2d.setColor(new Color( 236, 240, 241));
		g2d.fillRect(505, 300, 2, 130);
		g2d.setColor(new Color( 236, 240, 241));
		g2d.fillRect(510, 300, 7, 130);
		g2d.setColor(new Color( 236, 240, 241));
		g2d.fillRect(525, 300, 2, 130);
		g2d.setColor(new Color( 236, 240, 241));
		g2d.fillRect(550, 300, 3, 130);
		g2d.setColor(new Color( 10, 10, 10));
		g2d.fillRect(555, 300, 5, 130);
		g2d.setColor(new Color( 10, 10, 10));
		g2d.fillRect(562, 300, 12, 130);
		
		
		
		g2d.setColor(Color.black);
		g2d.fillRect(495, 300, 94, 3);
		g2d.setColor(Color.black);
		g2d.fillRect(495, 300, 4, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(585, 300, 4, 40);
		g2d.setColor(Color.black);
		g2d.fillRect(495, 340, 94, 4);
		g2d.setColor(Color.black);
		g2d.fillRect(500, 340, 2, 90);
		g2d.setColor(Color.black);
		g2d.fillRect(580, 340, 2, 90);
		
		
	}
	}

