package br.org.cremesp.exercicios;

import javax.swing.JOptionPane;

public class CopaMundo {

	public static void main(String[] args) {
		
		int anoInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual?"));
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de anos a partir do ano atual?"));
		
		int bissextos = 0;
		
		//criando p arrau de inteiros
		int[] anos = new int[quantidade + 1];
		
		anos[0] = anoInicial;
		
		for (int i = 0; i < anos.length; i++) {
			
//			if (i == 0) {
//				anos[i] = anoInicial;
//			} else {
//				anos[i] = anos[i - 1] + 1;
//			} // comentado pois foi utilizado operador ternario
			anos[i] = i == 0 ? anoInicial : anos[i - 1] + 1;
			
			if(anos[i] % 4 == 0) {
				bissextos++;
			}
		}
		
		String resultado = "Ano Inicial: " + anoInicial +
				"\nAno Final: " + anos[anos.length - 1] +
				"\nAnos Bissextos: " + bissextos;
		JOptionPane.showMessageDialog(null, resultado);

	}

}
