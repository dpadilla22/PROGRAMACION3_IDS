package key;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;

public class Key extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;

	String palabras[]= {"pato","quackity","Roblox","Gato","Cinnamorroll", 
			"java", "programación", "ordenador", "música", "película",
            "guitarra", "futbol", "montaña", "playa", "bicicleta",
            "perro", "gato", "elefante", "jirafa", "león",
            "manzana", "naranja", "plátano", "sandía", "uva",
            "mesa", "silla", "armario", "ventana", "puerta",
            "casa", "edificio", "rascacielos", "calle", "carretera",
            "lápiz", "pluma", "cuaderno", "libro", "biblioteca",
            "agua", "fuego", "tierra", "aire", "sol",
            "luna", "estrella", "planeta", "galaxia", "universo",
            "amor", "odio", "felicidad", "tristeza", "ira",
            "esperanza", "sueño", "realidad", "fantasía", "imaginación",
            "azul", "Joji", "verde", "amarillo", "naranja",
            "morado", "rosa", "blanco", "negro", "gris",
            "bola", "pelota", "globo", "peluche", "muñeca",
            "viento", "tormenta", "relámpago", "lluvia", "nieve",
            "verano", "invierno", "primavera", "otoño", "estación",
            "cuchillo", "tenedor", "cuchara", "plato", "taza",
            "comida", "bebida", "postre", "desayuno", "almuerzo",
            "cena"
        };
	
private int minutos=0;
private int segundos=0;
private Timer timer;
private int tiempoTranscurrido = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Key frame = new Key();
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
	public Key() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 989, 606);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 980, 119);
		panel.setBackground(Color.lightGray);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JOptionPane.showMessageDialog(null, "INSTRUCCIONES DEL JUEGO: "
				+ "AL INICIAR APARECERA UNA PALABRA ALEATORIA, "
				+ "DEBES DE ESCRIBIRLA EN EL MENOR TIEMPO POSIBLE");
		
         
		iniciarTemporizador();
	       
		 lblNewLabel = new JLabel("");
		 lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		
		 lblNewLabel.setForeground(new Color(208, 100, 194));
		 
		lblNewLabel.setBounds(10, 43, 719, 39);
		panel.add(lblNewLabel);
		
		Random palabra= new Random();
		
		int palabraRand= palabra.nextInt(palabras.length);
		
		JLabel lblNewLabel_1 = new JLabel("palabra: " + palabras[palabraRand]);
		
		
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(350, 0, 379, 55);
		panel.add(lblNewLabel_1);
		
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(726, 9, 228, 24);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 118, 980, 451);
		panel_1.setBackground(new Color(236, 191, 231));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("       Q");
		
		lblNewLabel_3_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_3_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(10, 10, 98, 108);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("       w");
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(118, 10, 98, 108);
		panel_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5 = new JLabel("       E");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setForeground(new Color(128, 128, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(226, 10, 98, 108);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("       R");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setForeground(new Color(128, 128, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(334, 10, 98, 108);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("       T");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setForeground(new Color(128, 128, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(441, 10, 98, 108);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("       Y");
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setForeground(new Color(128, 128, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(551, 10, 98, 108);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("       U");
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setForeground(new Color(128, 128, 255));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBackground(Color.WHITE);
		lblNewLabel_9.setBounds(659, 10, 98, 108);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("       I");
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setForeground(new Color(128, 128, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(767, 10, 98, 108);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("       O");
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setForeground(new Color(128, 128, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setBounds(875, 10, 95, 108);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("       P");
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setForeground(new Color(128, 128, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setBackground(Color.WHITE);
		lblNewLabel_12.setBounds(10, 128, 98, 108);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("       A");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setForeground(new Color(128, 128, 255));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBackground(Color.WHITE);
		lblNewLabel_13.setBounds(118, 128, 98, 108);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("       S");
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setForeground(new Color(128, 128, 255));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_14.setBackground(Color.WHITE);
		lblNewLabel_14.setBounds(226, 128, 98, 108);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("       D");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setForeground(new Color(128, 128, 255));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_15.setBackground(Color.WHITE);
		lblNewLabel_15.setBounds(334, 128, 98, 108);
		panel_1.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("       F");
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setForeground(new Color(128, 128, 255));
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_16.setBackground(Color.WHITE);
		lblNewLabel_16.setBounds(441, 128, 98, 108);
		panel_1.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("       G");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setForeground(new Color(128, 128, 255));
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_17.setBackground(Color.WHITE);
		lblNewLabel_17.setBounds(551, 128, 98, 108);
		panel_1.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("       H");
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setForeground(new Color(128, 128, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_18.setBackground(Color.WHITE);
		lblNewLabel_18.setBounds(659, 128, 98, 108);
		panel_1.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("       J");
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setForeground(new Color(128, 128, 255));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19.setBackground(Color.WHITE);
		lblNewLabel_19.setBounds(767, 128, 98, 108);
		panel_1.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("       K");
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setForeground(new Color(128, 128, 255));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_20.setBackground(Color.WHITE);
		lblNewLabel_20.setBounds(875, 128, 95, 108);
		panel_1.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("       L");
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setForeground(new Color(128, 128, 255));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_21.setBackground(Color.WHITE);
		lblNewLabel_21.setBounds(10, 244, 98, 108);
		panel_1.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("       Ñ");
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setForeground(new Color(128, 128, 255));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_22.setBackground(Color.WHITE);
		lblNewLabel_22.setBounds(118, 246, 98, 108);
		panel_1.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("       Z");
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setForeground(new Color(128, 128, 255));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_23.setBackground(Color.WHITE);
		lblNewLabel_23.setBounds(226, 246, 98, 108);
		panel_1.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("       X");
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setForeground(new Color(128, 128, 255));
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_24.setBackground(Color.WHITE);
		lblNewLabel_24.setBounds(334, 246, 98, 108);
		panel_1.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("       C");
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setForeground(new Color(128, 128, 255));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_25.setBackground(Color.WHITE);
		lblNewLabel_25.setBounds(441, 246, 98, 108);
		panel_1.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("       V");
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setForeground(new Color(128, 128, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_26.setBackground(Color.WHITE);
		lblNewLabel_26.setBounds(551, 246, 98, 108);
		panel_1.add(lblNewLabel_26);
		
		JLabel lblNewLabel_27 = new JLabel("       B");
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setForeground(new Color(128, 128, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_27.setBackground(Color.WHITE);
		lblNewLabel_27.setBounds(659, 244, 98, 108);
		panel_1.add(lblNewLabel_27);
		
		JLabel lblNewLabel_28 = new JLabel("       N");
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setForeground(new Color(128, 128, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_28.setBackground(Color.WHITE);
		lblNewLabel_28.setBounds(767, 246, 98, 108);
		panel_1.add(lblNewLabel_28);
		
		JLabel lblNewLabel_29 = new JLabel("       M");
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setForeground(new Color(128, 128, 255));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setBackground(Color.WHITE);
		lblNewLabel_29.setBounds(875, 246, 95, 108);
		panel_1.add(lblNewLabel_29);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(192, 192, 192));
		panel_2.setBounds(0, 363, 980, 88);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("                             ESPACIO");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBounds(293, 10, 354, 56);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("              BORRAR");
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(758, 10, 189, 56);
		panel_2.add(lblNewLabel_4);
		addKeyListener(this);
	}
	public Color colores() {
		 Random rnd = new Random();
		 return new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
	}
	private void iniciarTemporizador() {
	    timer = new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            actualizarTemporizador();
	        }
	    });
	    timer.start();
	}

	private void actualizarTemporizador() {
	    segundos++;
	    if (segundos == 60) {
	        segundos = 0;
	        minutos++;
	    }
	    lblNewLabel_2.setText("TIEMPO " 
	    + minutos + " : " + segundos );
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		int keyCode = e.getKeyCode();
		if (keyCode==8) {
			 String text = lblNewLabel.getText();
	            if (text.length() > 0) {
	                lblNewLabel.setText(text.substring(0, text.length() - 1));
	            }
		}
		char keyPressed = e.getKeyChar();
		  
        lblNewLabel.setText(lblNewLabel.getText() + keyPressed);
	}
}
