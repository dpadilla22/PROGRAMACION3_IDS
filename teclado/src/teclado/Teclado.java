package teclado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class Teclado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel_1 = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado frame = new Teclado();
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
	public Teclado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(401, 10, 1, 1);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Q");
		btnNewButton.setBackground(new Color(159, 103, 167));
		btnNewButton.setBounds(10, 81, 85, 113);
		contentPane.add(btnNewButton);
		
		JButton btnB = new JButton("W");
		btnB.setBackground(new Color(159, 103, 167));
		btnB.setBounds(108, 81, 85, 113);
		contentPane.add(btnB);
		
		JButton btnC = new JButton("E");
		btnC.setBackground(new Color(159, 103, 167));
		btnC.setBounds(203, 81, 85, 113);
		contentPane.add(btnC);
		
		JButton btnNewButton_3 = new JButton("R");
		btnNewButton_3.setBackground(new Color(159, 103, 167));
		btnNewButton_3.setBounds(301, 81, 85, 113);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("T");
		btnNewButton_3_1.setBackground(new Color(159, 103, 167));
		btnNewButton_3_1.setBounds(394, 81, 85, 113);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_3_1_1 = new JButton("Y");
		btnNewButton_3_1_1.setBackground(new Color(159, 103, 167));
		btnNewButton_3_1_1.setBounds(485, 81, 85, 113);
		contentPane.add(btnNewButton_3_1_1);
		
		JButton btnNewButton_3_1_2 = new JButton("U");
		btnNewButton_3_1_2.setBackground(new Color(159, 103, 167));
		btnNewButton_3_1_2.setBounds(580, 81, 85, 113);
		contentPane.add(btnNewButton_3_1_2);
		
		JButton btnNewButton_3_1_2_1 = new JButton("I");
		btnNewButton_3_1_2_1.setBackground(new Color(159, 103, 167));
		btnNewButton_3_1_2_1.setBounds(674, 81, 85, 113);
		contentPane.add(btnNewButton_3_1_2_1);
		
		JButton btnNewButton_3_1_2_1_1 = new JButton("O\r\n");
		btnNewButton_3_1_2_1_1.setBackground(new Color(159, 103, 167));
		btnNewButton_3_1_2_1_1.setBounds(769, 81, 85, 113);
		contentPane.add(btnNewButton_3_1_2_1_1);
		
		JButton btnJ = new JButton("P");
		btnJ.setBackground(new Color(159, 103, 167));
		btnJ.setBounds(10, 209, 85, 113);
		contentPane.add(btnJ);
		
		JButton btnK = new JButton("A");
		btnK.setBackground(new Color(159, 103, 167));
		btnK.setBounds(108, 209, 85, 113);
		contentPane.add(btnK);
		
		JButton btnNewButton_5_1 = new JButton("S");
		btnNewButton_5_1.setBackground(new Color(159, 103, 167));
		btnNewButton_5_1.setBounds(203, 209, 85, 113);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("D");
		btnNewButton_5_2.setBackground(new Color(159, 103, 167));
		btnNewButton_5_2.setBounds(301, 209, 85, 113);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_3 = new JButton("F");
		btnNewButton_5_3.setBackground(new Color(159, 103, 167));
		btnNewButton_5_3.setBounds(394, 209, 85, 113);
		contentPane.add(btnNewButton_5_3);
		
		JButton btnNewButton_5_4 = new JButton("G");
		btnNewButton_5_4.setBackground(new Color(159, 103, 167));
		btnNewButton_5_4.setBounds(485, 209, 85, 113);
		contentPane.add(btnNewButton_5_4);
		
		JButton btnNewButton_5_5 = new JButton("H");
		btnNewButton_5_5.setBackground(new Color(159, 103, 167));
		btnNewButton_5_5.setBounds(580, 209, 85, 113);
		contentPane.add(btnNewButton_5_5);
		
		JButton btnNewButton_5_6 = new JButton("J");
		btnNewButton_5_6.setBackground(new Color(159, 103, 167));
		btnNewButton_5_6.setBounds(674, 209, 85, 113);
		contentPane.add(btnNewButton_5_6);
		
		JButton btnNewButton_5_7 = new JButton("K");
		btnNewButton_5_7.setBackground(new Color(159, 103, 167));
		btnNewButton_5_7.setBounds(769, 209, 85, 113);
		contentPane.add(btnNewButton_5_7);
		
		JButton btnNewButton_4_1 = new JButton("L");
		btnNewButton_4_1.setBackground(new Color(159, 103, 167));
		btnNewButton_4_1.setBounds(10, 334, 85, 113);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_2 = new JButton("Ñ");
		btnNewButton_4_2.setBackground(new Color(159, 103, 167));
		btnNewButton_4_2.setBounds(108, 334, 85, 113);
		contentPane.add(btnNewButton_4_2);
		
		JButton btnNewButton_4_3 = new JButton("Z");
		btnNewButton_4_3.setBackground(new Color(159, 103, 167));
		btnNewButton_4_3.setBounds(203, 334, 85, 113);
		contentPane.add(btnNewButton_4_3);
		
		JButton btnNewButton_4_4 = new JButton("X");
		btnNewButton_4_4.setBackground(new Color(159, 103, 167));
		btnNewButton_4_4.setBounds(301, 334, 85, 113);
		contentPane.add(btnNewButton_4_4);
		
		JButton btnNewButton_4_5 = new JButton("C");
		btnNewButton_4_5.setBackground(new Color(159, 103, 167));
		btnNewButton_4_5.setBounds(394, 334, 85, 113);
		contentPane.add(btnNewButton_4_5);
		
		JButton btnNewButton_4_5_1 = new JButton("V");
		btnNewButton_4_5_1.setBackground(new Color(159, 103, 167));
		btnNewButton_4_5_1.setBounds(485, 334, 85, 113);
		contentPane.add(btnNewButton_4_5_1);
		
		JButton btnNewButton_4_5_2 = new JButton("B");
		btnNewButton_4_5_2.setBackground(new Color(159, 103, 167));
		btnNewButton_4_5_2.setBounds(580, 334, 85, 113);
		contentPane.add(btnNewButton_4_5_2);
		
		JButton btnNewButton_4_5_2_1 = new JButton("N");
		btnNewButton_4_5_2_1.setBackground(new Color(159, 103, 167));
		btnNewButton_4_5_2_1.setBounds(674, 334, 85, 113);
		contentPane.add(btnNewButton_4_5_2_1);
		
		JButton btnNewButton_4_5_2_2 = new JButton("M");
		btnNewButton_4_5_2_2.setBackground(new Color(159, 103, 167));
		btnNewButton_4_5_2_2.setBounds(769, 334, 85, 113);
		contentPane.add(btnNewButton_4_5_2_2);
		
		JButton btnNewButton_1 = new JButton("BORRAR");
		btnNewButton_1.setBackground(new Color(235, 221, 236));
		btnNewButton_1.setBounds(685, 475, 157, 40);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(10, 36, 844, 35);
		lblNewLabel.setBackground(Color.white);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("palabra");
		lblNewLabel_1.setBackground(new Color(255, 255, 0));
		lblNewLabel_1.setBounds(244, 10, 375, 28);
		contentPane.add(lblNewLabel_1);
		panel_1.setBackground(new Color(225, 181, 216));
		panel_1.setBounds(0, 64, 863, 391);
		contentPane.add(panel_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBackground(new Color(163, 98, 168));
		btnNewButton_2.setBounds(265, 475, 341, 40);
		contentPane.add(btnNewButton_2);
	}
}
