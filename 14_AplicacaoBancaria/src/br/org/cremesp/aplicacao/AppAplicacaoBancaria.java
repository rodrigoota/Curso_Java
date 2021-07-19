package br.org.cremesp.aplicacao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import br.org.cremesp.classes.Agencia;
import br.org.cremesp.classes.Banco;
import br.org.cremesp.classes.Cliente;
import br.org.cremesp.classes.ContaCorrente;
import br.org.cremesp.classes.ContaEspecial;

public class AppAplicacaoBancaria {
	public static void main(String[] args) {
		
		Banco b1 = new Banco(1, "BB");
		//System.out.println(b1);
		Banco b2 = new Banco(2, "Itau");
		
		Agencia a1 = new Agencia(1231, "Imirim", b2);
		Agencia a2 = new Agencia(1231, "CV", b1);
		
		Set<Agencia> agencias = new LinkedHashSet<>();
		//agencias.add(a1);
		agencias.add(new Agencia(1232, "adasd", b1));
		agencias.add(new Agencia(1232, "adasd", b2));
		agencias.add(new Agencia(1, "adasd", b2));
		
		b1.setAgencias(agencias);
		
		b1.getAgencias().add(a1);
		
		agencias.forEach(a -> System.out.println(a));
		
		Cliente c1 = new Cliente(1, "Teste", a1);
		Cliente c3 = new Cliente(1, "Teste 2", a1);
		Cliente c2 = new Cliente(2, "Nome", a2);
		List<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c3);
		clientes.add(c2);
		
		clientes.forEach(c -> System.out.println(c));
		
		a1.setClientes(clientes);
		
		
		ContaCorrente cc1 = new ContaCorrente("123-1",c1,0);
		ContaCorrente cc2 = new ContaCorrente("124-1",c1,10);
		Set<ContaCorrente> contas = new LinkedHashSet<>();
		
		contas.add(cc1);
		contas.add(cc2);
		//contas.forEach(c -> System.out.println(c));
		
		c1.getContas().add(cc1);
		c1.getContas().add(cc2);
		
		cc1.efetuarDeposito(1000);
		cc1.efetuarDeposito(1000);
		cc2.efetuarDeposito(10);
		cc1.efetuarSaque(2000);
		cc2.efetuarSaque(19);
		
		// teste conta especial
		ContaEspecial ce1 = new ContaEspecial("5151", c1, 0, 1000);
		c1.getContas().add(ce1);		
		
		c1.getContas().forEach(c -> System.out.println(c));
		
		System.out.println(cc1.gerarExtrato());
		
		System.out.println(cc2.gerarExtrato());
		
		System.out.println(ce1.gerarExtrato());
		
		ce1.efetuarSaque(500);
		
		
		
		
	}
}
