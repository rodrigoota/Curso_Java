package br.org.cremesp.aplicacao;

import java.util.Date;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Empresa;
import br.org.cremesp.classes.Endereco;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.enumeracoes.Sexo;

public class AppFuncionario01 {

	public static void main(String[] args) {
		
		try {
			Endereco endereco = new Endereco();
			endereco.setLogradouro("Avenida Paulista");
			endereco.setNumero(1099);
			endereco.setCidade("São Paulo");
			endereco.setCep("01311-110");
			
			Empresa empresa = new Empresa();
			empresa.setRazaoSocial("Impacta");
			empresa.setDataFundacao(new Date());
			empresa.setEndereco(endereco);
			
			Funcionario funcionario = new Funcionario();
			funcionario.setMatricula(12345);
			funcionario.setNome("Rangel Santos");
			funcionario.setSexo(Sexo.MASCULINO);
			funcionario.setCargo("Motoboy");
			funcionario.setSalario(3500);
			funcionario.setEmpresa(empresa);
			
			//HeadlessException não é verificada pois herda de RuntimeException
			JOptionPane.showMessageDialog(null, funcionario.exibir());
			
		} catch (Exception e) {
			String origem = e.getClass().getName();
			
			String pilha = "";
			for (StackTraceElement item : e.getStackTrace()) {
				pilha += item.toString() + "\r\n";
			}
			String erro = "Classe: " + origem + "\r\nMensagem: "  + e.getMessage()
			+ "\r\n\r\nPilha:\r\n" + pilha;
			
			//System.out.println(erro);
			
			JOptionPane.showMessageDialog(null, erro, "Erro reportado", JOptionPane.ERROR_MESSAGE);
			
			//e.printStackTrace();
		}
		
	}

}
