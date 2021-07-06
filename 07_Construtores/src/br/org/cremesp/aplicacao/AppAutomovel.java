package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {

		try {
			Automovel auto1 = new Automovel("GM", "Cruze", 2020, "EDM1235");
			Automovel auto2 = new Automovel("Hyundai", "HB20", 2018);
			Automovel auto3 = new Automovel("VW", "Gol", 1995, "ABC1234");

		
			System.out.println(auto1.apresentarDados());
			System.out.println(auto2.apresentarDados());
			System.out.println(auto3.apresentarDados());
			
			JOptionPane.showMessageDialog(null, auto1.apresentarDados());
			JOptionPane.showMessageDialog(null, auto2.apresentarDados());
			JOptionPane.showMessageDialog(null, auto3.apresentarDados());
			
		} catch(Exception e) {	//para qualquer exceção gerada
			String erro = "Erro gerado: " + e.getClass().getCanonicalName()
					+ "\nMensagem: " + e.getMessage();
			JOptionPane.showMessageDialog(null, erro);
		} 

	}
}
