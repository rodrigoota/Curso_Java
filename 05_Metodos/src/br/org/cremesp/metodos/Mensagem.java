package br.org.cremesp.metodos;

public class Mensagem {
	
	//método usado para apresentar uma mensagem para o usuário
	//este método não possui valor de retorno e não recebe parâmetros
	public static void mostrarMensagem() {
		System.out.println("Mensagem fornecida pelo método 'mostrarMensagem()'");
	}
	
	//método usado para retornar uma mensagem para o usuário
	public static String retornarMensagem() {
		return "Mensagem fornecida pelo método 'retornarMensagem()'";
	}
	
	//método usado para retornar uma mensagem combinada com um valor
	//fornecido pelo usuario
	public static String apresentarMensagem(String msg) {
		return "Texto enviado pelo usuário: " + msg;
		
	}
	
}
