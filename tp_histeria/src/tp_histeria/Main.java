package tp_histeria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int filas = 5;
		int columnas = 5;
		Presentador presentador = new Presentador(filas, columnas);

		frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(1280, 800);
		frame.setLocationRelativeTo(null);

		JPanel puntos = new JPanel();
		puntos.setBackground(Color.GREEN);
		frame.getContentPane().add(puntos, BorderLayout.CENTER);

		JPanel juego = new JPanel();
		juego.setBackground(Color.RED);
		juego.setPreferredSize(new Dimension(800, 800));
		juego.setLayout(new GridLayout(filas, columnas));
		frame.getContentPane().add(juego, BorderLayout.EAST);

		JButton[][] botones = new JButton[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				botones[i][j] = new JButton();
				botones[i][j].setBackground(Color.gray);
				final int x = i;
				final int y = j;
				botones[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						presentador.cambiarColor(x, y);
				        botones[x][y].setBackground(presentador.colorAwt(presentador.getColor(x, y)));
					}
				});
				juego.add(botones[i][j]);
			}
		}

	}
}
