package br.org.cremesp.aplicacao;

import java.util.Date;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Curso;
import br.org.cremesp.classes.DocumentoCnpj;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.enumeracoes.Sexo;

public class AppPessoa {
	
	public static void main(String[] args) {
			
		Pessoa p1 = new Funcionario("Manoel Santos", new DocumentoCnpj("41321548451541"));
		p1.setDataNascimento(new Date());
		p1.setSexo(Sexo.MASCULINO);
		
		if(p1 instanceof Funcionario) {
			((Funcionario) p1).setCargo("Motorista");
			((Funcionario) p1).setSalario(5000);
		}
		
		Pessoa p2 = new Aluno("Benedito", Sexo.MASCULINO, new Date());
		
		if(p2 instanceof Aluno) {
			((Aluno) p2).setCurso(new Curso(10, "DevOps", 40));
		} else if(p2 instanceof Funcionario) {
			((Funcionario) p2).setCargo("Analista");
		}
		
		JOptionPane.showMessageDialog(null, p1.exibir());		
		JOptionPane.showMessageDialog(null, p2.exibir());		
	}

}
