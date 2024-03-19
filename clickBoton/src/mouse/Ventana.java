package mouse;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

	        JPanel panel = new JPanel();
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
		                Random rand = new Random();

		                int r = rand.nextInt(256);
		                int g = rand.nextInt(256);
		                int b = rand.nextInt(256);
		                Color color = new Color(r, g, b);
		                String colorCode = String.format("#%02X%02X%02X", r, g, b);

		                JButton aleatorio = new JButton(colorCode);
		                int x = rand.nextInt(panel.getWidth() - 100);
		                int y = rand.nextInt(panel.getHeight() - 30);
		                int ancho = rand.nextInt(100) + 30;
		                int largo = rand.nextInt(30) + 10;
		                aleatorio.setBounds(x, y, ancho, largo);
		                aleatorio.setBackground(color);

		                aleatorio.addActionListener(new ActionListener() {
		                    @Override
		                    public void actionPerformed(ActionEvent e) {
		                        JButton botonPulsado = (JButton) e.getSource();
		                        panel.remove(botonPulsado);
		                        panel.revalidate();
		                        panel.repaint();
		                    }
		                });
	                
	                panel.add(aleatorio);
	                panel.repaint();
	                
	               
	            }
	        });

	       /* panel.addMouseListener(new MouseListener() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                Random rand = new Random();

	                           
	                int r = rand.nextInt(256);
	                int g = rand.nextInt(256);
	                int b = rand.nextInt(256);
	                Color color = new Color(r, g, b);
	                String colorCode = String.format("#%02X%02X%02X", r, g, b);


	                int x = e.getX();
	                int y = e.getY();
	                String coordenadas = "(" + x + ", " + y + ")";
	                
	                JButton aleatorio = new JButton(coordenadas);
	                int ancho = rand.nextInt(100) + 30;
	                int largo = rand.nextInt(30) + 10;
	                aleatorio.setBounds(x, y, ancho, largo);
	                aleatorio.setBackground(color);

	                aleatorio.addActionListener(new ActionListener() {
	                    @Override
	                    public void actionPerformed(ActionEvent e) {
	                        JButton botonPulsado = (JButton) e.getSource();
	                        /*JOptionPane.showMessageDialog(null, botonPulsado.getText(), "Coordenadas", JOptionPane.INFORMATION_MESSAGE);*/
	                       /* panel.remove(botonPulsado);
	                        botonPulsado.repaint();

	                    }
	                });

	                panel.add(aleatorio);
	                panel.repaint();
	            }
*/
			/*	@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}

	        });
*/
	        add(panel);
	        panel.add(boton);
	    }
	}

