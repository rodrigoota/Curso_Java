package br.org.cremesp.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AplicacaoBancaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumBanco;
	private JTextField txtNomeBanco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacaoBancaria frame = new AplicacaoBancaria();
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
	public AplicacaoBancaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Banco", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(10, 11, 141, 121);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero:");
		lblNewLabel.setBounds(10, 21, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 49, 46, 14);
		panel.add(lblNome);
		
		txtNumBanco = new JTextField();
		txtNumBanco.setBounds(55, 18, 76, 20);
		panel.add(txtNumBanco);
		txtNumBanco.setColumns(10);
		
		txtNomeBanco = new JTextField();
		txtNomeBanco.setColumns(10);
		txtNomeBanco.setBounds(55, 46, 76, 20);
		panel.add(txtNomeBanco);
		
		JButton btnAddBanco = new JButton("Adicionar Banco");
		btnAddBanco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnAddBanco.setBounds(10, 87, 121, 23);
		panel.add(btnAddBanco);
	}
}
