package br.org.cremesp.referencias;

public class VariaveisString {

	public static void main(String[] args) {
		//Informa��es sobre o curso
		String descricao = "Fundamentos do Java";   // 0bits
		int cargaHoraria = 100;  // 32 bits
		boolean ativo = true;    // 8 bits
		
		descricao = "Java Programmer";
		descricao = descricao + " - Diurno";
		
		System.out.println("Descri��o: " + descricao);
		System.out.println("Carga Horaria: " + cargaHoraria);
		System.out.println("Est� ativo? " + ativo);
		
		

	}

}
