package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Automovel;

public class AppAutomovel {
	public static void main(String[] args) {

		try {
			Automovel auto1 = new Automovel();

			String marca = JOptionPane.showInputDialog("Informe a marca");
			String modelo = JOptionPane.showInputDialog("Informe o modelo");
			int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano"));
			auto1.lerDados(marca, modelo, ano);
			System.out.println(auto1.apresentarDados());
			JOptionPane.showMessageDialog(null, auto1.apresentarDados());

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());

		}

//		auto1.marca = "Peugeot";
//		auto1.modelo = "206";
//		auto1.ano = 2008;

		// auto1.setAno(-2020);

		Automovel auto2 = new Automovel();
		auto2.lerDados("Honda", "Fit", 2021);
		System.out.println(auto2.apresentarDados());
	}
}
