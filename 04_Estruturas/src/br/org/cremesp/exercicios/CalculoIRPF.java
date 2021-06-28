package br.org.cremesp.exercicios;

import javax.swing.JOptionPane;

public class CalculoIRPF {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe a base de cálculo"));
		
		double baseCalculo = salario;
		double imposto = 0;
		double[] taxas = {0, 7.5, 15, 22.5, 27.5};
		double[] valores = {0, 1903.98, 2826.65, 3751.05, 4664.68};
		
		for (int i = taxas.length - 1; i >= 0; i--) {
			if(baseCalculo > valores[i]) {
				imposto += (baseCalculo - valores[i]) * taxas[i] / 100;
				baseCalculo = valores[i];
			}
		}
		
		String resposta = "Base de cálculo: " + salario
				+ "\nImposto de Renda: " + imposto;
		
		JOptionPane.showMessageDialog(null, resposta);
		
	}

}
