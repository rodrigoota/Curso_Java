package br.org.cremesp.aplicacao;

//importação estática
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.UIManager;

import br.org.cremesp.classes.Empresa;
import br.org.cremesp.classes.Endereco;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.enumeracoes.Sexo;

public class AppFuncionario02 {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			Funcionario funcionario= getFuncionario();
			showMessageDialog(null, funcionario.exibir());
			
		} catch (Exception e) {
			showMessageDialog(null, getErro(e), "Erro reportado", ERROR_MESSAGE);

			//e.printStackTrace();
		}
		
	}
	
	//método que solicita e retorna os dados de um endereco
	private static Endereco getEndereco() throws ClassNotFoundException {
		Endereco endereco = new Endereco();
		endereco.setLogradouro(showInputDialog("Informe o logradouro:"));
		endereco.setNumero(Integer.parseInt(showInputDialog("Informe o número:")));
		endereco.setCidade(showInputDialog("Informe a cidade:"));
		endereco.setCep(showInputDialog("Informe o CEP:"));
		
		return endereco;
	}
	
	private static Empresa getEmpresa() throws ClassNotFoundException, ParseException {
		Empresa empresa = new Empresa();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		empresa.setRazaoSocial(showInputDialog("Informe a razão social da empresa:"));
		
		Date data = df.parse(showInputDialog("Informe a data de fundação (dd/MM/aaaa)"));
		empresa.setDataFundacao(data);
		
		int opcao = showConfirmDialog(null, "Deseja fornecer o endereço da empresa?", 
				"Confirmação", 
				YES_NO_OPTION, 
				QUESTION_MESSAGE);
		
		if(opcao == YES_OPTION) {
			empresa.setEndereco(getEndereco());			
		}
		
		return empresa;
		
	}
	
	private static Funcionario getFuncionario() throws ClassNotFoundException, ParseException {

		Funcionario funcionario = new Funcionario();
		
		funcionario.setMatricula(Integer.parseInt(showInputDialog("Informe a matrícula:")));
		funcionario.setNome(showInputDialog("Informe o nome:"));
		
		Sexo sexo = (Sexo) showInputDialog(
				null,
				"Informe o sexo:",
				"Sexo",
				QUESTION_MESSAGE,
				null,
				Sexo.values(),
				null);
		
		funcionario.setSexo(sexo);
		funcionario.setCargo(showInputDialog("Informe o cargo:"));
		funcionario.setSalario(Double.parseDouble(showInputDialog("Informe o salário:")));
		
		int opcao = showConfirmDialog(null, "Deseja fornecer os dados da empresa?", 
				"Confirmação", 
				YES_NO_OPTION, 
				QUESTION_MESSAGE);
		
		if(opcao == YES_OPTION) {
			funcionario.setEmpresa(getEmpresa());		
		}		
		
		return funcionario;
	}
	
	private static String getErro(Exception e) {
		
		String origem = e.getClass().getName();
		
		String pilha = "";
		for (StackTraceElement item : e.getStackTrace()) {
			pilha += item.toString() + "\r\n";
		}
		String erro = "Classe: " + origem + "\r\nMensagem: "  + e.getMessage()
		+ "\r\n\r\nPilha:\r\n" + pilha;
		
		//System.out.println(erro);
		
		return erro;
	}
	
	
}
