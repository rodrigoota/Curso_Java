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
			String placa = JOptionPane.showInputDialog("Informe a placa:");
			
			auto1.lerDados(marca, modelo, ano, placa);
			System.out.println(auto1.apresentarDados());
			JOptionPane.showMessageDialog(null, auto1.apresentarDados());

		//} catch (NumberFormatException | NullPointerException e) {
		} catch(Exception e) {	//para qualquer exceção gerada
			String erro = "Erro gerado: " + e.getClass().getCanonicalName()
					+ "\nMensagem: " + e.getMessage();
			JOptionPane.showMessageDialog(null, erro);
		} 
//		catch (NullPointerException e) {
//			JOptionPane.showMessageDialog(null, e.getMessage());
//		}

//		auto1.marca = "Peugeot";
//		auto1.modelo = "206";
//		auto1.ano = 2008;


		Automovel auto2 = new Automovel();
		auto2.lerDados("Honda", "Fit", 2021, "ABC1234");
		//auto2.lerDados(null, null, 2021);
		//auto2.setAno(-2020);
		System.out.println(auto2.apresentarDados());
	}
}
