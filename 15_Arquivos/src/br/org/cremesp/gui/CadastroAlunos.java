package br.org.cremesp.gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.BufferedReader;
import java.io.FileReader;
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
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Curso;
import br.org.cremesp.classes.Endereco;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.enumeracoes.Sexo;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;

public class CadastroAlunos extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3512785978072387225L;
	
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JComboBox<Sexo> cmbSexo;
	private JTextField txtLogradouro;
	private JTextField txtCidade;
	private JTextField txtCep;
	private JTextField txtNumero;
	private JTextField txtDescricaoCurso;
	private JTextField txtCodigoCurso;
	private JTextField txtChCurso;
	private JTextField txtPrecoCurso;
	private JComboBox<Curso> cmbCursos;
	private JComboBox<Aluno> cmbAlunos;
	private JTextArea txtListaCursos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CadastroAlunos frame = new CadastroAlunos();
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
	public CadastroAlunos() {

		setTitle("Cadastro de Pessoas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 742, 450);
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
		panelPessoa.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Dados do Aluno:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panelPessoa.setBounds(10, 11, 364, 355);
		contentPane.add(panelPessoa);
		panelPessoa.setLayout(null);

		JButton btnIncluirAluno = new JButton("Incluir Aluno");
		btnIncluirAluno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					String nome = txtNome.getText();
					Date data = new SimpleDateFormat("dd/MM/yyyy").parse(txtDataNasc.getText());
					Sexo sexo = (Sexo) cmbSexo.getSelectedItem();

					Pessoa pessoa = new Aluno(nome, sexo, data);

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

					JOptionPane.showMessageDialog(CadastroAlunos.this, pessoa.exibir(), "Dados Pessoais",
							JOptionPane.INFORMATION_MESSAGE);

					cmbAlunos.addItem((Aluno) pessoa);

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e1.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnIncluirAluno.setBounds(10, 319, 114, 23);
		panelPessoa.add(btnIncluirAluno);

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
		panelEndereco.setBorder(
				new TitledBorder(null, "Endere\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelEndereco.setBounds(20, 149, 312, 159);
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
		chbEndereco.setBounds(10, 119, 127, 23);
		panelPessoa.add(chbEndereco);

		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnFechar.setBounds(310, 378, 89, 23);
		contentPane.add(btnFechar);

		JPanel panelCurso = new JPanel();
		panelCurso.setBounds(384, 11, 339, 114);
		contentPane.add(panelCurso);
		panelCurso.setBorder(new TitledBorder(
				new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)),
				"Inclus\u00E3o de cursos:", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panelCurso.setLayout(null);

		JLabel lblNewLabel_5 = new JLabel("C\u00F3digo:");
		lblNewLabel_5.setBounds(10, 21, 46, 14);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		panelCurso.add(lblNewLabel_5);

		txtDescricaoCurso = new JTextField();
		txtDescricaoCurso.setBounds(66, 45, 148, 20);
		panelCurso.add(txtDescricaoCurso);
		txtDescricaoCurso.setColumns(10);

		JLabel lblNewLabel_5_1 = new JLabel("Descri\u00E7\u00E3o:");
		lblNewLabel_5_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_1.setBounds(10, 48, 63, 14);
		panelCurso.add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("C.H.:");
		lblNewLabel_5_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_2.setBounds(224, 21, 46, 14);
		panelCurso.add(lblNewLabel_5_2);

		JLabel lblNewLabel_5_3 = new JLabel("Pre\u00E7o:");
		lblNewLabel_5_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_3.setBounds(224, 48, 46, 14);
		panelCurso.add(lblNewLabel_5_3);

		txtCodigoCurso = new JTextField();
		txtCodigoCurso.setColumns(10);
		txtCodigoCurso.setBounds(66, 18, 63, 20);
		panelCurso.add(txtCodigoCurso);

		txtChCurso = new JTextField();
		txtChCurso.setColumns(10);
		txtChCurso.setBounds(259, 18, 70, 20);
		panelCurso.add(txtChCurso);

		txtPrecoCurso = new JTextField();
		txtPrecoCurso.setColumns(10);
		txtPrecoCurso.setBounds(259, 45, 70, 20);
		panelCurso.add(txtPrecoCurso);

		JButton btnIncluirCurso = new JButton("Incluir Curso");
		btnIncluirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int codigo = Integer.parseInt(txtCodigoCurso.getText());
					String descricao = txtDescricaoCurso.getText();
					int ch = Integer.parseInt(txtChCurso.getText());
					double preco = Double.parseDouble(txtPrecoCurso.getText());

					Curso curso = new Curso(codigo, descricao, ch, preco);

					JOptionPane.showMessageDialog(CadastroAlunos.this, "Curso incluído com sucesso!", "Dados Pessoais",
							JOptionPane.INFORMATION_MESSAGE);

					cmbCursos.addItem(curso);

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e2.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnIncluirCurso.setBounds(214, 80, 115, 23);
		panelCurso.add(btnIncluirCurso);

		JPanel panelMatricula = new JPanel();
		panelMatricula.setBounds(384, 132, 336, 93);
		contentPane.add(panelMatricula);
		panelMatricula.setBorder(
				new TitledBorder(null, "Matr\u00EDcula", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panelMatricula.setLayout(null);

		JLabel lblNewLabel_5_4 = new JLabel("Alunos:");
		lblNewLabel_5_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_4.setBounds(10, 23, 46, 14);
		panelMatricula.add(lblNewLabel_5_4);

		JLabel lblNewLabel_5_5 = new JLabel("Cursos:");
		lblNewLabel_5_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5_5.setBounds(10, 59, 46, 14);
		panelMatricula.add(lblNewLabel_5_5);

		cmbAlunos = new JComboBox<>();
		cmbAlunos.setBounds(66, 19, 155, 22);
		panelMatricula.add(cmbAlunos);

		cmbCursos = new JComboBox<>();
		cmbCursos.setBounds(66, 55, 155, 22);
		panelMatricula.add(cmbCursos);

		JButton btnAribuirCurso = new JButton("Aribuir Curso");
		btnAribuirCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Buscando o aluno no ComboBox
					Aluno aluno = (Aluno) cmbAlunos.getSelectedItem();

					// buscando o curso no ComboBox
					Curso curso = (Curso) cmbCursos.getSelectedItem();

					aluno.getCursos().add(curso);

					JOptionPane.showMessageDialog(CadastroAlunos.this, "Curso atribuído para o aluno com sucesso!",
							"Dados Pessoais", JOptionPane.INFORMATION_MESSAGE);

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e2.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnAribuirCurso.setBounds(231, 23, 95, 52);
		panelMatricula.add(btnAribuirCurso);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(384, 270, 332, 96);
		contentPane.add(scrollPane);

		txtListaCursos = new JTextArea();
		txtListaCursos.setFont(new Font("Consolas", Font.PLAIN, 13));
		scrollPane.setViewportView(txtListaCursos);

		JButton btnMostrarCursos = new JButton("Mostrar Cursos");
		btnMostrarCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// Buscando o aluno no ComboBox
					Aluno aluno = (Aluno) cmbAlunos.getSelectedItem();
					
					txtListaCursos.setText(aluno.listarCursos());

				} catch (Exception e2) {
					JOptionPane.showMessageDialog(CadastroAlunos.this, e2.getMessage(), "Erro",
							JOptionPane.ERROR_MESSAGE);
				}				
			}
		});
		btnMostrarCursos.setBounds(384, 236, 114, 23);
		contentPane.add(btnMostrarCursos);
		
		incluirAlunos();
		incluirCursos();
	}
	
	private void incluirAlunos() {
		try {
			FileReader reader = new FileReader("J:\\Cursos\\Java\\arquivos\\alunos.txt");
			BufferedReader buffer = new BufferedReader(reader);
			
			while(true) {
				String linha = buffer.readLine();
				if(linha == null) { // && linha.trim().length() == 0
					break;
				}
				String[] itens = linha.split(";");
				
				String nome = itens[0];
				Date data = new SimpleDateFormat("dd/MM/yyyy").parse(itens[1]);
				Sexo sexo = itens[2].equals("MASCULINO") ? Sexo.MASCULINO : Sexo.FEMININO;
				
				Aluno aluno = new Aluno(nome, sexo, data);
				
				cmbAlunos.addItem(aluno);
			}
			buffer.close();
			reader.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void incluirCursos() {
		try {
			FileReader reader = new FileReader("J:\\Cursos\\Java\\arquivos\\cursos.txt");
			BufferedReader buffer = new BufferedReader(reader);
			
			while(true) {
				String linha = buffer.readLine();
				if(linha == null) { // && linha.trim().length() == 0
					break;
				}
				String[] itens = linha.split(";");
				
				int codigo = Integer.parseInt(itens[0]);
				String descricao = itens[1];
				int ch = Integer.parseInt(itens[2]);
				double preco = Double.parseDouble(itens[3]);
				
				Curso curso = new Curso(codigo, descricao, ch, preco);
				
				cmbCursos.addItem(curso);
			}
			buffer.close();
			reader.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}	
	
}
