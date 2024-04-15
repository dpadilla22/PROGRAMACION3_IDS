package menu;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class Alta extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Alta() {
		
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dar de alta al usuario");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(119, 117, 250, 44);
		panel.add(lblNewLabel);
		
		
	}

}
