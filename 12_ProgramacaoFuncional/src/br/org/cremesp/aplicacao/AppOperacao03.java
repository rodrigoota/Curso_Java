package br.org.cremesp.aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.org.cremesp.interfaces.Operacao03;

public class AppOperacao03 {
	
	public static void main(String[] args) {
		Operacao03<Date> op1 = p -> new SimpleDateFormat("dd/MM/yyyy - HH:mm").format(p);
		System.out.println(op1.executar(new Date()));
		
		
		Operacao03<Integer> op3 = x -> x % 2 == 0 ? "par" : "impar";
		System.out.println(op3.executar(20));
	}
}
