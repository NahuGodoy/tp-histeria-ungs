package tp_histeria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;

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
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(320, 180, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		frame.getContentPane().add(panel_1, BorderLayout.WEST);
		
		JTextPane txtpnContadorReglasRecords = new JTextPane();
		txtpnContadorReglasRecords.setEditable(false);
		txtpnContadorReglasRecords.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtpnContadorReglasRecords.setText("CONTADOR\r\nREGLAS\r\nRECORDS");
		panel_1.add(txtpnContadorReglasRecords);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.RED);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(null);
		
		JTextPane txtpnJuego = new JTextPane();
		txtpnJuego.setEditable(false);
		txtpnJuego.setBounds(448, 268, 82, 30);
		txtpnJuego.setText("JUEGO");
		txtpnJuego.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_2.add(txtpnJuego);
	}
}
