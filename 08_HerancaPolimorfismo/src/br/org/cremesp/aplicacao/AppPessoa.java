package br.org.cremesp.aplicacao;

import java.util.Date;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.enumeracoes.Sexo;

public class AppPessoa {
	
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Patricia Melo");
		//pessoa.setNome("Patricia Melo");
		pessoa.setDataNascimento(new Date());
		pessoa.setSexo(Sexo.FEMININO);
		
		JOptionPane.showMessageDialog(null, pessoa.exibir());
		
		Funcionario funcionario = new Funcionario("Manoel");
		//funcionario.setNome("Manoel Santos");
		funcionario.setDataNascimento(new Date());
		funcionario.setSexo(Sexo.MASCULINO);
		funcionario.setCargo("Motorista");
		funcionario.setSalario(5000);
		
		JOptionPane.showMessageDialog(null, funcionario.exibir());		
	}

}
