package menu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ayuda1 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Ayuda1() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿como crear un usuario?");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(119, 117, 250, 44);
		panel.add(lblNewLabel);
		
	}

}
