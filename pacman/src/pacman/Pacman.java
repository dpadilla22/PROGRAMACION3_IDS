package pacman;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Pacman extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Player jugador = new Player(250, 210, 20, 20, "");

	Player[] obstaculos;
	Player[] bolas;
	int contador = 1;
	JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman frame = new Pacman();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pacman() {

		inicializarBolas();
		obstaculos = new Player[34];

		// pared izquierda
		obstaculos[0] = new Player(0, 0, 30, 200, "");
		obstaculos[1] = new Player(0, 240, 30, 180, "");
		// pared derecha
		obstaculos[2] = new Player(465, 0, 30, 200, "");
		obstaculos[3] = new Player(465, 240, 30, 200, "");
		// arriba
		obstaculos[4] = new Player(0, 0, 500, 20, "");
		// abajo
		obstaculos[5] = new Player(0, 400, 500, 20, "");

		obstaculos[6] = new Player(0, 140, 120, 60, "");
		obstaculos[7] = new Player(0, 240, 120, 60, "");

		obstaculos[8] = new Player(70, 45, 50, 20, "");
		obstaculos[9] = new Player(70, 90, 50, 20, "");
		obstaculos[10] = new Player(150, 45, 70, 20, "");
		obstaculos[11] = new Player(150, 90, 20, 110, "");
		obstaculos[12] = new Player(150, 140, 70, 25, "");
		obstaculos[13] = new Player(150, 240, 25, 60, "");
		obstaculos[14] = new Player(250, 5, 20, 60, "");

		obstaculos[15] = new Player(300, 45, 65, 20, "");
		obstaculos[16] = new Player(400, 45, 40, 20, "");
		obstaculos[17] = new Player(345, 90, 20, 110, "");
		obstaculos[18] = new Player(300, 140, 65, 25, "");
		obstaculos[19] = new Player(210, 90, 100, 20, "");
		obstaculos[20] = new Player(248, 100, 20, 50, "");
		obstaculos[21] = new Player(400, 90, 40, 20, "");
		obstaculos[22] = new Player(400, 140, 120, 60, "");

		obstaculos[23] = new Player(200, 200, 20, 60, "");
		obstaculos[24] = new Player(300, 200, 20, 60, "");
		obstaculos[25] = new Player(200, 250, 120, 20, "");
		obstaculos[26] = new Player(345, 235, 20, 60, "");
		obstaculos[27] = new Player(210, 300, 100, 20, "");
		obstaculos[28] = new Player(250, 300, 20, 60, "");
		obstaculos[29] = new Player(80, 350, 140, 20, "");
		obstaculos[30] = new Player(300, 350, 140, 20, "");
		obstaculos[31] = new Player(400, 230, 100, 60, "");
		obstaculos[32] = new Player(150, 330, 25, 30, "");
		obstaculos[33] = new Player(345, 330, 25, 30, "");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 425, 492, 31);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 10));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 241, 28));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();

			}
		});
		btnNewButton.setBounds(200, 5, 110, 21);
		panel_1.add(btnNewButton);

		lblNewLabel = new JLabel("Puntuacion ");
		lblNewLabel.setForeground(new Color(255, 241, 28));
		lblNewLabel.setFont(new Font("Bauhaus 93", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 10, 167, 13);
		panel_1.add(lblNewLabel);

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;

				for (Player obstaculo : obstaculos) {
					g2d.setColor(new Color(5, 0, 88));
					g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getW(), obstaculo.getH());
				}

				for (Player bolita : bolas) {
					if (bolita != null) {
						g2d.setColor(new Color(189, 115, 2));
						g2d.fillOval(bolita.getX(), bolita.getY(), bolita.getW(), bolita.getH());
					}

					g2d.setColor(new Color(255, 241, 28));
					g2d.fillOval(jugador.getX(), jugador.getY(), jugador.getW(), jugador.getH());

				}
			}
		};
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 10, 492, 450);
		contentPane.add(panel);

		addKeyListener(this);
		setFocusable(true);
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int ax = jugador.getX();
		int ay = jugador.getY();

		if (e.getKeyChar() == 'w' || e.getKeyChar() == 'W') {
			ay -= 3;
		} else if (e.getKeyChar() == 'd' || e.getKeyChar() == 'D') {
			ax += 3;
			if (ax >= getWidth()) {
				ax = 0;
			}
		}
		if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
			ax -= 3;
			if (ax < 0) {
				ax = getWidth() - 1;
			}

		} else if (e.getKeyChar() == 's' || e.getKeyChar() == 'S') {
			ay += 3;
		}
		if (!jugador.colisionConObstaculo(new Player(ax, ay, jugador.getW(), jugador.getH(), null), obstaculos)) {
			jugador.setX(ax);
			jugador.setY(ay);

			for (int i = 0; i < bolas.length; i++) {
				if (bolas[i] != null && jugador
						.colisionConBolita(new Player(ax, ay, jugador.getW(), jugador.getH(), null), bolas[i])) {
					bolas[i] = null;
					actualizar();
					contador++;
				}
			}
		}

		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	private void inicializarBolas() {
		bolas = new Player[116];

		bolas[0] = new Player(46, 30, 10, 10, "");
		bolas[1] = new Player(46, 55, 10, 10, "");
		bolas[2] = new Player(46, 77, 10, 10, "");
		bolas[3] = new Player(46, 100, 10, 10, "");

		bolas[4] = new Player(80, 28, 10, 10, "");
		bolas[5] = new Player(105, 28, 10, 10, "");
		bolas[6] = new Player(155, 28, 10, 10, "");
		bolas[7] = new Player(180, 28, 10, 10, "");
		bolas[8] = new Player(210, 28, 10, 10, "");
		bolas[9] = new Player(235, 28, 10, 10, "");
		bolas[10] = new Player(235, 50, 10, 10, "");
		bolas[11] = new Player(235, 75, 10, 10, "");
		bolas[12] = new Player(46, 120, 10, 10, "");
		bolas[13] = new Player(80, 120, 10, 10, "");
		bolas[14] = new Player(105, 120, 10, 10, "");
		bolas[15] = new Player(80, 75, 10, 10, "");
		bolas[16] = new Player(105, 75, 10, 10, "");
		bolas[17] = new Player(130, 28, 10, 10, "");
		bolas[18] = new Player(130, 50, 10, 10, "");
		bolas[19] = new Player(130, 75, 10, 10, "");
		bolas[20] = new Player(130, 100, 10, 10, "");
		bolas[21] = new Player(130, 120, 10, 10, "");
		bolas[22] = new Player(130, 145, 10, 10, "");
		bolas[23] = new Player(130, 170, 10, 10, "");
		bolas[24] = new Player(130, 200, 10, 10, "");
		bolas[25] = new Player(160, 75, 10, 10, "");
		bolas[26] = new Player(130, 230, 10, 10, "");
		bolas[27] = new Player(130, 260, 10, 10, "");
		bolas[28] = new Player(130, 290, 10, 10, "");
		bolas[29] = new Player(130, 320, 10, 10, "");
		bolas[30] = new Player(100, 320, 10, 10, "");
		bolas[31] = new Player(70, 320, 10, 10, "");
		bolas[32] = new Player(40, 320, 10, 10, "");
		bolas[33] = new Player(40, 350, 10, 10, "");
		bolas[34] = new Player(40, 380, 10, 10, "");
		bolas[35] = new Player(70, 380, 10, 10, "");
		bolas[36] = new Player(100, 380, 10, 10, "");
		bolas[37] = new Player(130, 380, 10, 10, "");
		bolas[38] = new Player(160, 380, 10, 10, "");
		bolas[39] = new Player(190, 380, 10, 10, "");
		bolas[40] = new Player(220, 380, 10, 10, "");
		bolas[41] = new Player(250, 380, 10, 10, "");
		bolas[42] = new Player(280, 380, 10, 10, "");
		bolas[43] = new Player(310, 380, 10, 10, "");
		bolas[44] = new Player(340, 380, 10, 10, "");
		bolas[45] = new Player(370, 380, 10, 10, "");
		bolas[46] = new Player(400, 380, 10, 10, "");
		bolas[47] = new Player(430, 380, 10, 10, "");
		bolas[48] = new Player(450, 320, 10, 10, "");
		bolas[49] = new Player(450, 380, 10, 10, "");
		bolas[50] = new Player(450, 350, 10, 10, "");
		bolas[51] = new Player(450, 320, 10, 10, "");
		bolas[52] = new Player(420, 320, 10, 10, "");
		bolas[53] = new Player(385, 320, 10, 10, "");
		bolas[54] = new Player(385, 290, 10, 10, "");
		bolas[55] = new Player(385, 260, 10, 10, "");
		bolas[56] = new Player(385, 230, 10, 10, "");
		bolas[57] = new Player(385, 200, 10, 10, "");
		bolas[58] = new Player(385, 170, 10, 10, "");
		bolas[59] = new Player(385, 140, 10, 10, "");
		bolas[60] = new Player(385, 110, 10, 10, "");
		bolas[61] = new Player(385, 80, 10, 10, "");
		bolas[62] = new Player(385, 50, 10, 10, "");
		bolas[63] = new Player(385, 28, 10, 10, "");
		bolas[64] = new Player(280, 28, 10, 10, "");
		bolas[65] = new Player(310, 28, 10, 10, "");
		bolas[66] = new Player(340, 28, 10, 10, "");
		bolas[67] = new Player(365, 28, 10, 10, "");
		bolas[68] = new Player(410, 28, 10, 10, "");
		bolas[69] = new Player(430, 28, 10, 10, "");
		bolas[70] = new Player(450, 28, 10, 10, "");
		bolas[71] = new Player(450, 50, 10, 10, "");
		bolas[72] = new Player(450, 80, 10, 10, "");
		bolas[73] = new Player(450, 110, 10, 10, "");
		bolas[74] = new Player(430, 115, 10, 10, "");
		bolas[75] = new Player(410, 115, 10, 10, "");
		bolas[76] = new Player(320, 115, 10, 10, "");
		bolas[77] = new Player(320, 95, 10, 10, "");
		bolas[78] = new Player(320, 75, 10, 10, "");
		bolas[79] = new Player(190, 115, 10, 10, "");
		bolas[80] = new Player(190, 95, 10, 10, "");
		bolas[81] = new Player(190, 75, 10, 10, "");
		bolas[82] = new Player(215, 75, 10, 10, "");
		bolas[83] = new Player(260, 75, 10, 10, "");
		bolas[84] = new Player(300, 120, 10, 10, "");
		bolas[85] = new Player(280, 120, 10, 10, "");
		bolas[86] = new Player(280, 150, 10, 10, "");
		bolas[87] = new Player(255, 155, 10, 10, "");
		bolas[88] = new Player(230, 155, 10, 10, "");
		bolas[89] = new Player(230, 130, 10, 10, "");
		bolas[90] = new Player(210, 120, 10, 10, "");
		bolas[91] = new Player(285, 75, 10, 10, "");
		bolas[92] = new Player(350, 75, 10, 10, "");
		bolas[93] = new Player(350, 310, 10, 10, "");
		bolas[94] = new Player(320, 310, 10, 10, "");
		bolas[95] = new Player(320, 280, 10, 10, "");
		bolas[96] = new Player(290, 280, 10, 10, "");
		bolas[97] = new Player(260, 280, 10, 10, "");
		bolas[98] = new Player(230, 280, 10, 10, "");
		bolas[99] = new Player(205, 280, 10, 10, "");
		bolas[100] = new Player(180, 280, 10, 10, "");
		bolas[101] = new Player(180, 250, 10, 10, "");
		bolas[102] = new Player(180, 220, 10, 10, "");
		bolas[103] = new Player(155, 220, 10, 10, "");
		bolas[104] = new Player(180, 280, 10, 10, "");
		bolas[105] = new Player(180, 310, 10, 10, "");
		bolas[106] = new Player(180, 335, 10, 10, "");
		bolas[107] = new Player(210, 335, 10, 10, "");
		bolas[108] = new Player(235, 335, 10, 10, "");
		bolas[109] = new Player(235, 360, 10, 10, "");
		bolas[110] = new Player(280, 360, 10, 10, "");
		bolas[111] = new Player(280, 330, 10, 10, "");
		bolas[112] = new Player(310, 330, 10, 10, "");
		bolas[113] = new Player(330, 250, 10, 10, "");
		bolas[114] = new Player(330, 220, 10, 10, "");
		bolas[115] = new Player(360, 215, 10, 10, "");

	}

	private void actualizar() {
		lblNewLabel.setText("Puntuacion: " + contador);

	}

	private void reiniciar() {
		System.out.println("holis");

		jugador.setX(250);
		jugador.setY(210);

		inicializarBolas();
		contador = 0;
		repaint();
		requestFocusInWindow();
		actualizar();
	}
}
