package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.interfaces.Operacao02;

public class AppOperacao02 {
	public static void main(String[] args) {
		
		Operacao02 op1 = () -> System.out.println("Método sem retorno");
		
		Operacao02 op2 = ()-> {
			String s = JOptionPane.showInputDialog("Informe seu código");
			if(s != null && s.length() > 0 ) {
				System.out.println(s);
			} else {
				System.out.println("Nada foi informado");
			}
		};
		
		op1.executar();
		op2.executar();
	}
}
