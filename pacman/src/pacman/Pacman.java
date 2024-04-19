package pacman;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.JButton;

public class Pacman extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Player jugador = new Player(240, 230, 20, 20, "YELLOW");
	Player obstaculo = new Player(200, 100, 50, 100, "GRAY");
	Boolean gameOver;


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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 493);
		contentPane = new JPanel();
		gameOver=false;
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(237, 188, 230));
		panel_1.setBounds(0, 381, 492, 75);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setBounds(198, 23, 85, 21);
		panel_1.add(btnNewButton);

		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				 g2d.setColor(Color.YELLOW);
				g2d.fillOval(jugador.getX(), jugador.getY(), jugador.getW(),jugador.getH());
				 g2d.setColor(Color.GRAY);
				g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getW(), obstaculo.getH());
			}
		};
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 10, 492, 372);
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
	        int newX = jugador.getX();
	        int newY = jugador.getY();

	        if (e.getKeyChar() == 'w' || 'W' ==e.getKeyChar()) {
	            newY -= 2;
	        } else if (e.getKeyChar() == 'd' || 'D' ==e.getKeyChar()){
	            newX += 2;
	        } else if (e.getKeyChar() == 'a'|| 'A'==e.getKeyChar()) {
	            newX -= 2;
	        } else if (e.getKeyChar() == 's'|| 'S'==e.getKeyChar()) {
	            newY += 2;
	        }

	        if (!jugador.tocado(new Player(newX, newY, jugador.getW(), jugador.getH(), null), obstaculo)) {
	            jugador.setX(newX);
	            jugador.setY(newY);
	        }

	        repaint();
	    }

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
