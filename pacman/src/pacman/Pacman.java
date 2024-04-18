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
	private int pacmanx=240;
	private int pacmany=230;
	

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 10, 492, 372);
		contentPane.add(panel);
		
		addKeyListener(this);
		setFocusable(true);
		
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		
		
		g2d.setColor(Color.yellow);
		g2d.fillOval(pacmanx, pacmany, 20, 20);
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
	  
	   
	    if ( e.getKeyChar()=='w') {
	        pacmany -= 2; 
	        repaint(); 
	        
	    }else if(e.getKeyChar()=='d') {
	   pacmanx+=2;
	   repaint(); 
	
	    }if(e.getKeyChar()=='a') {
	    	
	 	   pacmanx-=2;
	 	  repaint(); 
	    }
	    else if(e.getKeyChar()=='s') {
			 pacmany+=2;
			 repaint(); 
		 }
		 	 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	
	}
}
