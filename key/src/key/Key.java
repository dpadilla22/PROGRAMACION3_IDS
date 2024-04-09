package key;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
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
	private String palabraEscrita;
	private String palabraActual;
	private JLabel lblNewLabel_1;
	private JLabel[][] teclas = new JLabel[3][9];
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;
	private JLabel lblNewLabel_27;
	private JLabel lblNewLabel_28;
	private JLabel lblNewLabel_29;
	

	String[] palabras = {
		    "unicornio", "ninja", "pulpo", "pirata", "galaxia", "sirena", "dragon", "robot", "tigre",
		    "volcan", "espectro", "mariposa", "hipopotamo", "yeti", "duende", "pavo real", "pandemonium", "criatura",
		    "magdalena", "enigma", "astronauta", "fenix", "quimera", "arcoiris", "coctel", "manantial", "nebulosa",
		    "frambuesa", "galimatias", "caracol", "bufon", "telescopio", "espagueti", "salamandra", "malabarista",
		    "misterio", "quackity", "carcajada", "albondiga", "tabu", "espectaculo", "bambu", "mazapan",
		    "globo aerostatico", "quirofano", "espaguetis", "cucurucho", "cotillon", "bailarin", "boomerang",
		    "esmeralda", "cascabel", "limonada", "trebol", "juramento", "medusa", "salvaje", "buzon", 
		    "unicornio", "quimera", "elefante", "pinguino", "luciernaga", "joji", "hipogrifo", "ocean", "zigzag", "nectarina",
		    "silencio", "melodia", "exotico", "paraguas", "helado", "papagayo", "reverencia", "bocanada", "galaxia",
		    "tornado", "relampago", "espuma", "patinete", "tridente", "bosque", "torrente", "temporada", "nacar",
		    "reloj", "gravedad", "espectaculo", "meteorito", "velocirraptor", "Slow Dancing in the Dark", "Run",
		    "Gimme Love", "San Marcos", "Summertime Sadness", "Young and Beautiful", "Blinding Lights", "Save Your Tears",
		    "Starboy", "Nadie", "Romance Turro", "Nobody", "Your Best American Girl", "Washing Machine Heart"
		};

	
	private int minutos = 0;
	private int segundos = 0;
	private Timer timer;
	private int decimas;
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
		panel.setBackground(new Color(184, 124, 180));
		contentPane.add(panel);
		panel.setLayout(null);

		JOptionPane.showMessageDialog(null, "INSTRUCCIONES DEL JUEGO: " + "AL INICIAR APARECERA UNA PALABRA ALEATORIA, "
				+ "DEBES DE ESCRIBIRLA EN EL MENOR TIEMPO POSIBLE");

		iniciarTemporizador();

		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Showcard Gothic", Font.PLAIN, 25));

		lblNewLabel.setForeground(new Color(255, 255, 255));

		lblNewLabel.setBounds(10, 50, 719, 39);
		panel.add(lblNewLabel);

		Random palabra = new Random();

		int palabraRand = palabra.nextInt(palabras.length);
		palabraActual = palabras[palabraRand];
		lblNewLabel_1 = new JLabel("palabra: " + palabras[palabraRand]);

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

		lblNewLabel_3_1 = new JLabel("       Q");
		lblNewLabel_3_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_3_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_3_1.setOpaque(true);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(10, 10, 98, 108);
		panel_1.add(lblNewLabel_3_1);

		lblNewLabel_4_1 = new JLabel("       w");
		lblNewLabel_4_1.setOpaque(true);
		lblNewLabel_4_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(118, 10, 98, 108);
		panel_1.add(lblNewLabel_4_1);

		lblNewLabel_5 = new JLabel("       E");
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setForeground(new Color(128, 128, 255));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(226, 10, 98, 108);
		panel_1.add(lblNewLabel_5);

		 lblNewLabel_6 = new JLabel("       R");
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setForeground(new Color(128, 128, 255));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setBounds(334, 10, 98, 108);
		panel_1.add(lblNewLabel_6);

		 lblNewLabel_7 = new JLabel("       T");
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setForeground(new Color(128, 128, 255));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setBounds(441, 10, 98, 108);
		panel_1.add(lblNewLabel_7);

		 lblNewLabel_8 = new JLabel("       Y");
		lblNewLabel_8.setOpaque(true);
		lblNewLabel_8.setForeground(new Color(128, 128, 255));
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setBounds(551, 10, 98, 108);
		panel_1.add(lblNewLabel_8);

		 lblNewLabel_9 = new JLabel("       U");
		lblNewLabel_9.setOpaque(true);
		lblNewLabel_9.setForeground(new Color(128, 128, 255));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBackground(Color.WHITE);
		lblNewLabel_9.setBounds(659, 10, 98, 108);
		panel_1.add(lblNewLabel_9);

		 lblNewLabel_10 = new JLabel("       I");
		lblNewLabel_10.setOpaque(true);
		lblNewLabel_10.setForeground(new Color(128, 128, 255));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_10.setBackground(Color.WHITE);
		lblNewLabel_10.setBounds(767, 10, 98, 108);
		panel_1.add(lblNewLabel_10);

		 lblNewLabel_11 = new JLabel("       O");
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setForeground(new Color(128, 128, 255));
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_11.setBackground(Color.WHITE);
		lblNewLabel_11.setBounds(875, 10, 95, 108);
		panel_1.add(lblNewLabel_11);

	 lblNewLabel_12 = new JLabel("       P");
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setForeground(new Color(128, 128, 255));
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_12.setBackground(Color.WHITE);
		lblNewLabel_12.setBounds(10, 128, 98, 108);
		panel_1.add(lblNewLabel_12);

		 lblNewLabel_13 = new JLabel("       A");
		lblNewLabel_13.setOpaque(true);
		lblNewLabel_13.setForeground(new Color(128, 128, 255));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBackground(Color.WHITE);
		lblNewLabel_13.setBounds(118, 128, 98, 108);
		panel_1.add(lblNewLabel_13);

		lblNewLabel_14 = new JLabel("       S");
		lblNewLabel_14.setOpaque(true);
		lblNewLabel_14.setForeground(new Color(128, 128, 255));
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_14.setBackground(Color.WHITE);
		lblNewLabel_14.setBounds(226, 128, 98, 108);
		panel_1.add(lblNewLabel_14);

		 lblNewLabel_15 = new JLabel("       D");
		lblNewLabel_15.setOpaque(true);
		lblNewLabel_15.setForeground(new Color(128, 128, 255));
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_15.setBackground(Color.WHITE);
		lblNewLabel_15.setBounds(334, 128, 98, 108);
		panel_1.add(lblNewLabel_15);

		 lblNewLabel_16 = new JLabel("       F");
		lblNewLabel_16.setOpaque(true);
		lblNewLabel_16.setForeground(new Color(128, 128, 255));
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_16.setBackground(Color.WHITE);
		lblNewLabel_16.setBounds(441, 128, 98, 108);
		panel_1.add(lblNewLabel_16);

		 lblNewLabel_17 = new JLabel("       G");
		lblNewLabel_17.setOpaque(true);
		lblNewLabel_17.setForeground(new Color(128, 128, 255));
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_17.setBackground(Color.WHITE);
		lblNewLabel_17.setBounds(551, 128, 98, 108);
		panel_1.add(lblNewLabel_17);

		lblNewLabel_18 = new JLabel("       H");
		lblNewLabel_18.setOpaque(true);
		lblNewLabel_18.setForeground(new Color(128, 128, 255));
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_18.setBackground(Color.WHITE);
		lblNewLabel_18.setBounds(659, 128, 98, 108);
		panel_1.add(lblNewLabel_18);

		lblNewLabel_19 = new JLabel("       J");
		lblNewLabel_19.setOpaque(true);
		lblNewLabel_19.setForeground(new Color(128, 128, 255));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_19.setBackground(Color.WHITE);
		lblNewLabel_19.setBounds(767, 128, 98, 108);
		panel_1.add(lblNewLabel_19);

		lblNewLabel_20 = new JLabel("       K");
		lblNewLabel_20.setOpaque(true);
		lblNewLabel_20.setForeground(new Color(128, 128, 255));
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_20.setBackground(Color.WHITE);
		lblNewLabel_20.setBounds(875, 128, 95, 108);
		panel_1.add(lblNewLabel_20);

		lblNewLabel_21 = new JLabel("       L");
		lblNewLabel_21.setOpaque(true);
		lblNewLabel_21.setForeground(new Color(128, 128, 255));
		lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_21.setBackground(Color.WHITE);
		lblNewLabel_21.setBounds(10, 244, 98, 108);
		panel_1.add(lblNewLabel_21);

		 lblNewLabel_22 = new JLabel("       Ñ");
		lblNewLabel_22.setOpaque(true);
		lblNewLabel_22.setForeground(new Color(128, 128, 255));
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_22.setBackground(Color.WHITE);
		lblNewLabel_22.setBounds(118, 246, 98, 108);
		panel_1.add(lblNewLabel_22);

		 lblNewLabel_23 = new JLabel("       Z");
		lblNewLabel_23.setOpaque(true);
		lblNewLabel_23.setForeground(new Color(128, 128, 255));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_23.setBackground(Color.WHITE);
		lblNewLabel_23.setBounds(226, 246, 98, 108);
		panel_1.add(lblNewLabel_23);

		lblNewLabel_24 = new JLabel("       X");
		lblNewLabel_24.setOpaque(true);
		lblNewLabel_24.setForeground(new Color(128, 128, 255));
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_24.setBackground(Color.WHITE);
		lblNewLabel_24.setBounds(334, 246, 98, 108);
		panel_1.add(lblNewLabel_24);

		lblNewLabel_25 = new JLabel("       C");
		lblNewLabel_25.setOpaque(true);
		lblNewLabel_25.setForeground(new Color(128, 128, 255));
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_25.setBackground(Color.WHITE);
		lblNewLabel_25.setBounds(441, 246, 98, 108);
		panel_1.add(lblNewLabel_25);

		 lblNewLabel_26 = new JLabel("       V");
		lblNewLabel_26.setOpaque(true);
		lblNewLabel_26.setForeground(new Color(128, 128, 255));
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_26.setBackground(Color.WHITE);
		lblNewLabel_26.setBounds(551, 246, 98, 108);
		panel_1.add(lblNewLabel_26);

		lblNewLabel_27 = new JLabel("       B");
		lblNewLabel_27.setOpaque(true);
		lblNewLabel_27.setForeground(new Color(128, 128, 255));
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_27.setBackground(Color.WHITE);
		lblNewLabel_27.setBounds(659, 244, 98, 108);
		panel_1.add(lblNewLabel_27);

		 lblNewLabel_28 = new JLabel("       N");
		lblNewLabel_28.setOpaque(true);
		lblNewLabel_28.setForeground(new Color(128, 128, 255));
		lblNewLabel_28.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_28.setBackground(Color.WHITE);
		lblNewLabel_28.setBounds(767, 246, 98, 108);
		panel_1.add(lblNewLabel_28);

		 lblNewLabel_29 = new JLabel("       M");
		lblNewLabel_29.setOpaque(true);
		lblNewLabel_29.setForeground(new Color(128, 128, 255));
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_29.setBackground(Color.WHITE);
		lblNewLabel_29.setBounds(875, 246, 95, 108);
		panel_1.add(lblNewLabel_29);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(184, 124, 180));
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
		 teclaas();
	}
	private void teclaas() {
	    teclas[0][0] = lblNewLabel_3_1;  // Q
	    teclas[0][1] = lblNewLabel_4_1;  // W
	    teclas[0][2] = lblNewLabel_5;    // E
	    teclas[0][3] = lblNewLabel_6;    // R
	    teclas[0][4] = lblNewLabel_7;    // T
	    teclas[0][5] = lblNewLabel_8;    // Y
	    teclas[0][6] = lblNewLabel_9;    // U
	    teclas[0][7] = lblNewLabel_10;   // I
	    teclas[0][8] = lblNewLabel_11;   // O

	    teclas[1][0] = lblNewLabel_12;   // P
	    teclas[1][1] = lblNewLabel_13;   // A
	    teclas[1][2] = lblNewLabel_14;   // S
	    teclas[1][3] = lblNewLabel_15;   // D
	    teclas[1][4] = lblNewLabel_16;   // F
	    teclas[1][5] = lblNewLabel_17;   // G
	    teclas[1][6] = lblNewLabel_18;   // H
	    teclas[1][7] = lblNewLabel_19;   // J
	    teclas[1][8] = lblNewLabel_20;   // K

	    teclas[2][0] = lblNewLabel_21;   // L
	    teclas[2][1] = lblNewLabel_22;   // Ñ
	    teclas[2][2] = lblNewLabel_23;   // Z
	    teclas[2][3] = lblNewLabel_24;   // X
	    teclas[2][4] = lblNewLabel_25;   // C
	    teclas[2][5] = lblNewLabel_26;   // V
	    teclas[2][6] = lblNewLabel_27;   // B
	    teclas[2][7] = lblNewLabel_28;   // N
	    teclas[2][8] = lblNewLabel_29;   // M
	}
	private Color coloresAleatorios() {
		Random rnd = new Random();
		return new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
	}

	private void iniciarTemporizador() {
		timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTemporizador();
			}
		});
		timer.start();
	}

	private void actualizarTemporizador() {
		timer.restart();
		decimas++;
		if (decimas == 10) {
			decimas = 0;
			segundos++;
		}
		if (segundos == 59) {
			segundos = 0;
			minutos++;

		}
		String tiempo = String.format("%d:%02d.%d", minutos, segundos, decimas);

		lblNewLabel_2.setText("TIEMPO " + tiempo);
	}

	private void reiniciarJuego() {
		timer.stop();

		palabraEscrita = "";
		lblNewLabel.setText("");
		tiempoTranscurrido = 0;
		minutos = 0;
		segundos = 0;
		Random random = new Random();
		int indiceAleatorio = random.nextInt(palabras.length);
		palabraActual = palabras[indiceAleatorio];

		lblNewLabel_1.setText("Palabra: " + palabraActual);

		iniciarTemporizador();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		 char keyChar = e.getKeyChar();
		    for (int i = 0; i < teclas.length; i++) {
		        for (int j = 0; j < teclas[i].length; j++) {
		            JLabel tecla = teclas[i][j];
		            if (tecla != null && tecla.getText().trim().equalsIgnoreCase(String.valueOf(keyChar))) {
		                tecla.setBackground(coloresAleatorios());
		              
		            }
		        }
		    }
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
	    int keyCode = e.getKeyCode();
	  
	    if (keyCode == KeyEvent.VK_BACK_SPACE) {
	        String text = lblNewLabel.getText();
	        if (text.length() > 0) {
	            lblNewLabel.setText(text.substring(0, text.length() - 1));
	        }
	    } else {
	        char keyPressed = e.getKeyChar();
	        lblNewLabel.setText(lblNewLabel.getText() + keyPressed);
	        palabraEscrita = lblNewLabel.getText();

	        if (palabraEscrita.equalsIgnoreCase(palabraActual)) {
	            timer.stop();
	           
	            double tiempoTotal = minutos * 60 + segundos + (double) decimas / 10;
	            JOptionPane.showMessageDialog(null,
	                    "Has ingresado la misma palabra en " + tiempoTotal + " segundos");
	            reiniciarJuego();
	        }

	        for (int i = 0; i < teclas.length; i++) {
	            for (int j = 0; j < teclas[i].length; j++) {
	                JLabel tecla = teclas[i][j];
	                if (tecla != null && tecla.getText().trim().equalsIgnoreCase(String.valueOf(keyPressed))) {
	                    tecla.setBackground(Color.WHITE);
	                }
	            }
	        }
	    }
	}

}
