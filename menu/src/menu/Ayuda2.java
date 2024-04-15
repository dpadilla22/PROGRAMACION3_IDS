package menu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ayuda2 extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Ayuda2() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(251, 221, 244));
		panel.setBounds(0, 0, 450, 520);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("¿como acceder al sistema?");
		lblNewLabel.setFont(new Font("Tw Cen MT", Font.PLAIN, 25));
		lblNewLabel.setBounds(77, 117, 386, 44);
		panel.add(lblNewLabel);
		
	}

}
