package br.org.cremesp.aplicacao;

import java.util.Date;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.DocumentoCnpj;
import br.org.cremesp.classes.DocumentoCpf;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.enumeracoes.Sexo;

public class AppPessoaFuncionario {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Funcionario(
				"Carlos Silva",
				new DocumentoCnpj("41321548451541"),
				new Date(),
				Sexo.MASCULINO,
				"Analista Junior",
				35000
				);
		
		Pessoa pessoa2 = pessoa1;
		System.out.println(pessoa1.equals(pessoa2));
		
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		//pessoa1 = new Pessoa("Pamela Silva", Sexo.FEMININO, new Date());
		
		JOptionPane.showMessageDialog(null, pessoa1.exibir());
		
		pessoa2 = new Funcionario("Antonio Barcelos", new DocumentoCnpj("41321548451541"));
		pessoa2.setDataNascimento(new Date());
		pessoa2.setSexo(Sexo.MASCULINO);
		
		Funcionario func2 = (Funcionario) pessoa2;
		func2.setCargo("Médico");
		func2.setSalario(1500);

		JOptionPane.showMessageDialog(null, pessoa2.exibir());
		JOptionPane.showMessageDialog(null, func2.exibir());
		
		Object pessoa3 = func2;
		JOptionPane.showMessageDialog(null, pessoa3);		

	}

}
