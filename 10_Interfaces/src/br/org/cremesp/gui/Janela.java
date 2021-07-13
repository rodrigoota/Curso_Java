package br.org.cremesp.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import br.org.cremesp.classes.DocumentoCnpj;
import br.org.cremesp.classes.DocumentoCpf;
import br.org.cremesp.classes.Endereco;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.enumeracoes.Sexo;
import br.org.cremesp.interfaces.Documento;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Janela extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JComboBox<Sexo> cmbSexo;
	private JTextField txtLogradouro;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtNumero;
	private JTextField txtCargo;
	private JTextField txtSalario;
	private JTextField txtDocumento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {	
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());	
					Janela frame = new Janela();
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
	public Janela() {
		
		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 513);
		setLocationRelativeTo(null);
		
		JPanel panelEndereco = new JPanel();
		panelEndereco.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
				txtNome.requestFocus();
			}
			@Override
			public void componentShown(ComponentEvent e) {
				txtLogradouro.requestFocus();
			}
		});
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelPessoa = new JPanel();
		panelPessoa.setBorder(new TitledBorder(null, "Dados da Pessoa:", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelPessoa.setBounds(10, 11, 353, 419);
		contentPane.add(panelPessoa);
		panelPessoa.setLayout(null);
		
				
		JButton btnIncluirPessoa = new JButton("Incluir");
		btnIncluirPessoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String nome = txtNome.getText();
					Date data = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataNasc.getText());
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();
					String cargo = txtCargo.getText();
					double salario = Double.parseDouble(txtSalario.getText());
					String documento = txtDocumento.getText();
					
					Documento doc;
					if(documento.length() == 11) {
						doc = new DocumentoCpf(documento);
					} else if (documento.length() == 14) {
						doc = new DocumentoCnpj(documento);
					} else {
						throw new NumberFormatException("O documento deve ter 11 ou 14 dígitos");
					}
					
					Pessoa pessoa = new Funcionario(nome, doc, data, sexo, cargo, salario);
					
					if (panelEndereco.isVisible()) {
						String logradouro = txtLogradouro.getText();
						int numero = Integer.parseInt(txtNumero.getText());
						String cidade = txtCidade.getText();
						String cep = txtCep.getText();
						
						Endereco endereco = new Endereco();
						endereco.setLogradouro(logradouro);
						endereco.setNumero(numero);
						endereco.setCidade(cidade);
						endereco.setCep(cep);
						pessoa.setEndereco(endereco);
					}
					
					JOptionPane.showMessageDialog(Janela.this, pessoa.exibir(),
							"Dados Pessoais", JOptionPane.INFORMATION_MESSAGE);
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(Janela.this, e1.getMessage(),
							"Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnIncluirPessoa.setBounds(254, 385, 89, 23);
		panelPessoa.add(btnIncluirPessoa);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(10, 27, 46, 14);
		panelPessoa.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(89, 24, 238, 20);
		panelPessoa.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data Nasc:");
		lblNewLabel_1.setBounds(10, 55, 59, 14);
		panelPessoa.add(lblNewLabel_1);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setBounds(89, 52, 86, 20);
		panelPessoa.add(txtDataNasc);
		txtDataNasc.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(10, 84, 46, 14);
		panelPessoa.add(lblNewLabel_2);
		
		cmbSexo = new JComboBox<>();
		cmbSexo.addItem(Sexo.MASCULINO);
		cmbSexo.addItem(Sexo.FEMININO);
		cmbSexo.setBounds(89, 80, 107, 22);
		panelPessoa.add(cmbSexo);
		
		
		panelEndereco.setVisible(false);
		panelEndereco.setBorder(new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelEndereco.setBounds(20, 205, 312, 169);
		panelPessoa.add(panelEndereco);		
		panelEndereco.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Logradouro:");
		lblNewLabel_3.setBounds(10, 22, 70, 14);
		panelEndereco.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("N\u00FAmero:");
		lblNewLabel_3_1.setBounds(10, 58, 70, 14);
		panelEndereco.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Cidade:");
		lblNewLabel_3_2.setBounds(10, 94, 70, 14);
		panelEndereco.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("CEP:");
		lblNewLabel_3_3.setBounds(10, 130, 70, 14);
		panelEndereco.add(lblNewLabel_3_3);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(75, 17, 227, 20);
		panelEndereco.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(75, 91, 86, 20);
		panelEndereco.add(txtCidade);
		txtCidade.setColumns(10);
		
		txtCep = new JTextField();
		txtCep.setBounds(75, 128, 86, 20);
		panelEndereco.add(txtCep);
		txtCep.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(75, 54, 86, 20);
		panelEndereco.add(txtNumero);
		txtNumero.setColumns(10);
		
		JCheckBox chbEndereco = new JCheckBox("Incluir endere\u00E7o");
		chbEndereco.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				panelEndereco.setVisible(chbEndereco.isSelected());	
			}
		});
		
//		chbEndereco.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//					panelEndereco.setVisible(!panelEndereco.isVisible());	
//			}
//		});
		chbEndereco.setBounds(10, 175, 127, 23);
		panelPessoa.add(chbEndereco);
		
		JLabel lblNewLabel_2_1 = new JLabel("Cargo:");
		lblNewLabel_2_1.setBounds(10, 115, 46, 14);
		panelPessoa.add(lblNewLabel_2_1);
		
		txtCargo = new JTextField();
		txtCargo.setBounds(89, 109, 86, 20);
		panelPessoa.add(txtCargo);
		txtCargo.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_4.setBounds(199, 112, 46, 14);
		panelPessoa.add(lblNewLabel_4);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(241, 109, 86, 20);
		panelPessoa.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Documento:");
		lblNewLabel_2_1_1.setBounds(10, 140, 73, 14);
		panelPessoa.add(lblNewLabel_2_1_1);
		
		txtDocumento = new JTextField();
		txtDocumento.setColumns(10);
		txtDocumento.setBounds(89, 140, 132, 20);
		panelPessoa.add(txtDocumento);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setBounds(140, 441, 89, 23);
		contentPane.add(btnFechar);
		

	}
}
