package key;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Key extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;

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
		
		 lblNewLabel = new JLabel("");
		 lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 25));
		
		 lblNewLabel.setForeground(new Color(208, 100, 194));
		 
		lblNewLabel.setBounds(10, 43, 719, 39);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("palabra: GATO");
		lblNewLabel_1.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(350, 0, 379, 55);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("TIEMPO");
		lblNewLabel_5.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(837, 15, 99, 24);
		panel.add(lblNewLabel_5);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 118, 980, 451);
		panel_1.setBackground(new Color(236, 191, 231));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("       Q");
		lblNewLabel_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 10, 98, 108);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("       w");
		lblNewLabel_2_1.setOpaque(true);
		lblNewLabel_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(118, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("       E");
		lblNewLabel_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(226, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("       R");
		lblNewLabel_2_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_1.setBounds(334, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("       T");
		lblNewLabel_2_1_1_2.setOpaque(true);
		lblNewLabel_2_1_1_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2.setBounds(441, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("       Y");
		lblNewLabel_2_1_1_2_1.setOpaque(true);
		lblNewLabel_2_1_1_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_1.setBounds(551, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_2 = new JLabel("       U");
		lblNewLabel_2_1_1_2_2.setOpaque(true);
		lblNewLabel_2_1_1_2_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_2.setBounds(659, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1_2_2);
		
		JLabel lblNewLabel_2_1_1_2_2_1 = new JLabel("       I");
		lblNewLabel_2_1_1_2_2_1.setOpaque(true);
		lblNewLabel_2_1_1_2_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_2_1.setBounds(767, 10, 98, 108);
		panel_1.add(lblNewLabel_2_1_1_2_2_1);
		
		JLabel lblNewLabel_2_1_1_2_2_1_1 = new JLabel("       O");
		lblNewLabel_2_1_1_2_2_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_2_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_2_1_1.setBounds(875, 10, 95, 108);
		panel_1.add(lblNewLabel_2_1_1_2_2_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("       P");
		lblNewLabel_2_2.setOpaque(true);
		lblNewLabel_2_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(10, 128, 98, 108);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("       A");
		lblNewLabel_2_3.setOpaque(true);
		lblNewLabel_2_3.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_3.setBounds(118, 128, 98, 108);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("       S");
		lblNewLabel_2_4.setOpaque(true);
		lblNewLabel_2_4.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_4.setBounds(226, 128, 98, 108);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("       D");
		lblNewLabel_2_5.setOpaque(true);
		lblNewLabel_2_5.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_5.setBackground(Color.WHITE);
		lblNewLabel_2_5.setBounds(334, 128, 98, 108);
		panel_1.add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("       F");
		lblNewLabel_2_6.setOpaque(true);
		lblNewLabel_2_6.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_6.setBackground(Color.WHITE);
		lblNewLabel_2_6.setBounds(441, 128, 98, 108);
		panel_1.add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("       G");
		lblNewLabel_2_7.setOpaque(true);
		lblNewLabel_2_7.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_7.setBackground(Color.WHITE);
		lblNewLabel_2_7.setBounds(551, 128, 98, 108);
		panel_1.add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_2_8 = new JLabel("       H");
		lblNewLabel_2_8.setOpaque(true);
		lblNewLabel_2_8.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_8.setBackground(Color.WHITE);
		lblNewLabel_2_8.setBounds(659, 128, 98, 108);
		panel_1.add(lblNewLabel_2_8);
		
		JLabel lblNewLabel_2_9 = new JLabel("       J");
		lblNewLabel_2_9.setOpaque(true);
		lblNewLabel_2_9.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_9.setBackground(Color.WHITE);
		lblNewLabel_2_9.setBounds(767, 128, 98, 108);
		panel_1.add(lblNewLabel_2_9);
		
		JLabel lblNewLabel_2_1_1_2_2_1_1_1 = new JLabel("       K");
		lblNewLabel_2_1_1_2_2_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_2_1_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_2_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_2_1_1_1.setBounds(875, 128, 95, 108);
		panel_1.add(lblNewLabel_2_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("       L");
		lblNewLabel_2_2_1.setOpaque(true);
		lblNewLabel_2_2_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1.setBounds(10, 244, 98, 108);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("       Ñ");
		lblNewLabel_2_2_2.setOpaque(true);
		lblNewLabel_2_2_2.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2_2.setBounds(118, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("       Z");
		lblNewLabel_2_2_3.setOpaque(true);
		lblNewLabel_2_2_3.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_3.setBackground(Color.WHITE);
		lblNewLabel_2_2_3.setBounds(226, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_3);
		
		JLabel lblNewLabel_2_2_4 = new JLabel("       X");
		lblNewLabel_2_2_4.setOpaque(true);
		lblNewLabel_2_2_4.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_4.setBackground(Color.WHITE);
		lblNewLabel_2_2_4.setBounds(334, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_4);
		
		JLabel lblNewLabel_2_2_5 = new JLabel("       C");
		lblNewLabel_2_2_5.setOpaque(true);
		lblNewLabel_2_2_5.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_5.setBackground(Color.WHITE);
		lblNewLabel_2_2_5.setBounds(441, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_5);
		
		JLabel lblNewLabel_2_2_6 = new JLabel("       V");
		lblNewLabel_2_2_6.setOpaque(true);
		lblNewLabel_2_2_6.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_6.setBackground(Color.WHITE);
		lblNewLabel_2_2_6.setBounds(551, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_6);
		
		JLabel lblNewLabel_2_2_7 = new JLabel("       B");
		lblNewLabel_2_2_7.setOpaque(true);
		lblNewLabel_2_2_7.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_7.setBackground(Color.WHITE);
		lblNewLabel_2_2_7.setBounds(659, 244, 98, 108);
		panel_1.add(lblNewLabel_2_2_7);
		
		JLabel lblNewLabel_2_2_8 = new JLabel("       N");
		lblNewLabel_2_2_8.setOpaque(true);
		lblNewLabel_2_2_8.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_2_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_2_8.setBackground(Color.WHITE);
		lblNewLabel_2_2_8.setBounds(767, 246, 98, 108);
		panel_1.add(lblNewLabel_2_2_8);
		
		JLabel lblNewLabel_2_1_1_2_2_1_1_1_1 = new JLabel("       M");
		lblNewLabel_2_1_1_2_2_1_1_1_1.setOpaque(true);
		lblNewLabel_2_1_1_2_2_1_1_1_1.setForeground(new Color(128, 128, 255));
		lblNewLabel_2_1_1_2_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1_1_2_2_1_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1_2_2_1_1_1_1.setBounds(875, 246, 95, 108);
		panel_1.add(lblNewLabel_2_1_1_2_2_1_1_1_1);
		
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
