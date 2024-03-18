package ventana;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	
	public Ventana() {
	setVisible(true);
	setSize(500,500);
	setTitle("ventana");
	setLocationRelativeTo(null);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.random();
	}
	
	public void random() {
		
		JPanel panel= new JPanel();
		panel.setSize(500, 500);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setBackground(new Color(168, 255, 150));
		
		
		JButton boton= new JButton(" ¡Click me! ");
		boton.setBounds(150, 350, 200, 50);
		boton.setFont(new Font("SingPainter", Font.BOLD, 20));
		boton.setForeground(new Color(255, 154, 224));
		boton.setBackground(Color.white);
		
		 boton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	               Random rand= new Random();
	               
	               JButton aleatorio= new JButton(" holi ");
	               int x = rand.nextInt(panel.getWidth() - 100); 
	                int y = rand.nextInt(panel.getHeight() - 30); 
	                int ancho = rand.nextInt(100) + 30; 
	                int largo = rand.nextInt(30) + 10; 
	                aleatorio.setBounds(x, y, ancho, largo);
	                aleatorio.setBackground(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));

	               
	                panel.add(aleatorio);
	                panel.revalidate();
	                panel.repaint();
	                
	               
	            }
	        });
		panel.add(boton);
		
		add(panel);
	}
}

