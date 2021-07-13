package br.org.cremesp.aplicacao;

import java.util.Arrays;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.classes.Curso;
import br.org.cremesp.classes.DocumentoCpf;
import br.org.cremesp.classes.ElementoGeneric;
import br.org.cremesp.classes.ElementoGenericRestrito;
import br.org.cremesp.classes.Funcionario;
import br.org.cremesp.classes.Pessoa;
import br.org.cremesp.classes.Retangulo;

public class AppGenerics {
	public static void main(String[] args) {
		ElementoGeneric<Double> numeros = new ElementoGeneric<>();
		numeros.setElementos(new Double[] {12.3, 9.4, 8.5, 19.2});
		System.out.println(numeros.listar());
		
		ElementoGeneric<String> nomes = new ElementoGeneric<>();
		nomes.setElementos(new String[] {"Natalia", "Maria", "Luana", "Silvia"});
		System.out.println(nomes.listar());
		
		ElementoGeneric<Curso> cursos = new ElementoGeneric<>();
		cursos.setElementos(new Curso[] { new Curso(1, "Java", 100), new Curso(2, "PHP", 40)});
		System.out.println(cursos.listar());
		
		// restrito a classes que implementam Comparable
		ElementoGenericRestrito<Integer> inteiros = new ElementoGenericRestrito<>();
		inteiros.setElementos(new Integer[] {2,6,45,1,0});
		Arrays.sort(inteiros.getElementos());
		System.out.println(inteiros.listar());
		
		ElementoGenericRestrito<Retangulo> retangulos = new ElementoGenericRestrito<>();
		retangulos.setElementos(new Retangulo[] { new Retangulo(2, 3), new Retangulo(1, 2)});
		Arrays.sort(retangulos.getElementos());
		System.out.println(retangulos.listar());
		
		ElementoGenericRestrito<Pessoa> pessoas = new ElementoGenericRestrito<>();
		pessoas.setElementos(new Pessoa[] {
				new Aluno("Joaquim"),
				new Funcionario("Angela", new DocumentoCpf("12345678910"))
		});

	}
}
