package br.org.cremesp.estruturaswitch;

import javax.swing.JOptionPane;

public class EstruturaSwitch {

	public static void main(String[] args) {
		
		int mes = 0, dias = 0;
		
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês de 1 a 12")); 
		
		if (mes < 1 || mes > 12) {
			return;
		}
		
		switch(mes) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: dias = 31;break;
			case 4: case 6: case 9: case 11: dias = 30;break;
			//case 2: dias = 28;break;
			default: dias = 28;
		}
		
		JOptionPane.showMessageDialog(null, "O mês " + mes + " possui " + dias + " dias.");

	}

}
