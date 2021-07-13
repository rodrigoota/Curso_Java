package br.org.cremesp.aplicacao;

import java.util.Arrays;
import java.util.Date;

import br.org.cremesp.classes.DocumentoCpf;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.classes.Retangulo;
import br.org.cremesp.enumeracoes.Sexo;

public class AppColecoes {
	public static void main(String[] args) {
		
		// criando um array de String
		String[] nomes = { "Luciana", "Ana Maria", "Matheus", "Jose", "Washington" };

		Arrays.sort(nomes);
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();
		
		//criando um array de numeros
		int[] numeros = {28, 14, 37, 12, 8, 5, 9, 20};
		Arrays.sort(numeros);
		
		for (int i : numeros) {
			System.out.println(i);
		}
		System.out.println();
		
		//criando um array de retangulos
		Retangulo[] retangulos = {
			new Retangulo(2, 5),	//10
			new Retangulo(4, 4),	//16
			new Retangulo(16, 3),	//48
			new Retangulo(1, 2),	//2
			new Retangulo(2, 3),	//6
		};
		Arrays.sort(retangulos);
		
		for (Retangulo retangulo : retangulos) {
			System.out.println("Área: " + retangulo.calcularArea());
		}
		System.out.println();
		
		//criando um array de pessoas
		Pessoa[] pessoas = {
				new Funcionario("Rangel", new DocumentoCpf("36615482422"), new Date(), Sexo.MASCULINO, "Atendente", 4000),
				new Funcionario("Antonio", new DocumentoCpf("36615482422"), new Date(), Sexo.MASCULINO, "Atendente", 4000),
				new Funcionario("Eduardo", new DocumentoCpf("36615482422"), new Date(), Sexo.MASCULINO, "Atendente", 4000),
				new Funcionario("Fernando", new DocumentoCpf("36615482422"), new Date(), Sexo.MASCULINO, "Atendente", 4000),
				new Funcionario("Benedito", new DocumentoCpf("36615482422"), new Date(), Sexo.MASCULINO, "Atendente", 4000),
		};
		Arrays.sort(pessoas);
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.exibir());
			System.out.println("-----------");
		}
		
	}
}
