package br.org.cremesp.aplicacao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import br.org.cremesp.classes.Agencia;
import br.org.cremesp.classes.Banco;
import br.org.cremesp.classes.Cliente;

public class AppAplicacaoBancaria {
	public static void main(String[] args) {
		
		Banco b1 = new Banco(1, "BB");
		//System.out.println(b1);
		Banco b2 = new Banco(2, "Itau");
		
		Agencia a1 = new Agencia(1231, "Imirim", b2);
		
		Set<Agencia> agencias = new HashSet<>();
		//agencias.add(a1);
		agencias.add(new Agencia(1232, "adasd", b1));
		agencias.add(new Agencia(1232, "adasd", b2));
		agencias.add(new Agencia(1, "adasd", b2));
		
		b1.setAgencias(agencias);
		
		b1.getAgencias().add(a1);
		
		for (Agencia agencia : agencias) {
			System.out.println(agencia);
		}
		
		Cliente c1 = new Cliente();
		
		new ArrayList<Cliente>();
		
	}
}
