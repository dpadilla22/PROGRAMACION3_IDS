package memorama;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Memoramas extends JFrame {

	private JFrame frame;
	private JPanel panel3;

	private int moves = 0;
	private int tarjetasEncontradas = 0;
	private final int totalPares = 4;

	public int tablero[][] = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };
	public int status[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

	/**
	 * Create the panel.
	 */
	public Memoramas() {
		setVisible(true);
		setSize(734, 516);
		setTitle("memorama");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inicializar();
		inicializarBotonReiniciar();

	}

	private void inicializarBotonReiniciar() {
		JButton btnReiniciar = new JButton("Reiniciar");
		btnReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciarJuego();
			}
		});
		getContentPane().add(btnReiniciar, BorderLayout.SOUTH);
	}

	private void reiniciarJuego() {

		moves = 0;

		voltearCartasBocaAbajo();
		actualizarMovimientos();
		inicializarTablero();

		tarjetasEncontradas = 0;
	}

	public void inicializar() {

		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		panel.add(panel1, BorderLayout.NORTH);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.RED);
		panel.add(panel2, BorderLayout.SOUTH);
		panel2.setLayout(new GridLayout(3, 4, 0, 0));

		JLabel label = new JLabel();
		panel2.add(label);

		panel3 = new JPanel();
		panel3.setBackground(Color.PINK);
		panel.add(panel3, BorderLayout.CENTER);
		panel3.setLayout(new GridLayout(2, 4, 0, 0));

		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				girar(0, 0, btnNewButton);
			}

		});
		panel3.add(btnNewButton);

		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				girar(0, 1, btnNewButton_4);
			}
		});
		panel3.add(btnNewButton_4);

		JButton btnNewButton_6 = new JButton();
		btnNewButton_6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				girar(0, 2, btnNewButton_6);
			}
		});
		panel3.add(btnNewButton_6);

		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girar(0, 3, btnNewButton_5);
			}
		});
		panel3.add(btnNewButton_5);

		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				girar(1, 0, btnNewButton_3);
			}
		});
		panel3.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				girar(1, 1, btnNewButton_2);
			}
		});
		panel3.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				girar(1, 2, btnNewButton_1);
			}
		});
		panel3.add(btnNewButton_1);

		JButton btnNewButton_7 = new JButton();
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				girar(1, 3, btnNewButton_7);

			}
		});
		panel3.add(btnNewButton_7);

		getContentPane().add(panel);
	}

	private void inicializarTablero() {

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				tablero[i][j] = j + 1;
			}
		}
	}

	public void girar(int x, int y, JButton btn) {
		btn.setText(String.valueOf(tablero[x][y]));

		status[x][y] = 1;
		btn.setEnabled(false);

		if (tarjetasEncontradas == totalPares) {
			JOptionPane.showMessageDialog(this, "¡Felicidades, has encontrado todos los pares!");
			reiniciarJuego();
		}

		int tarjetas = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (status[i][j] == 1) {
					tarjetas++;
				}
			}
		}
		if (tarjetas == 2) {
			int a = 0;
			int b = 0;

			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 4; j++) {
					if (status[i][j] == 1) {
						if (a == 0) {
							a = tablero[i][j];
						} else {
							if (b == 0) {
								b = tablero[i][j];
							}
						}
					}
				}
			}

			if (a == b) {
				JOptionPane.showMessageDialog(this, "Las cartas son pares");
				tarjetasEncontradas++;
			} else {
				JOptionPane.showMessageDialog(this, "Las cartas no son pares");
				voltearCartasBocaAbajo();
			}

			tarjetas = 0;
		}
	}

	private void actualizarMovimientos() {

		System.out.println("Movimientos: " + moves);
	}

	private void voltearCartasBocaAbajo() {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				if (status[i][j] == 1) {
					JButton btn = (JButton) panel3.getComponent(i * 4 + j);
					btn.setText("");
					btn.setEnabled(true);
					status[i][j] = 0;
				}
			}
		}
	}
}