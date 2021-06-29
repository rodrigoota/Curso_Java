package br.org.cremesp.metodos;

public class Mensagem {
	
	//m�todo usado para apresentar uma mensagem para o usu�rio
	//este m�todo n�o possui valor de retorno e n�o recebe par�metros
	public static void mostrarMensagem() {
		System.out.println("Mensagem fornecida pelo m�todo 'mostrarMensagem()'");
	}
	
	//m�todo usado para retornar uma mensagem para o usu�rio
	public static String retornarMensagem() {
		return "Mensagem fornecida pelo m�todo 'retornarMensagem()'";
	}
	
	//m�todo usado para retornar uma mensagem combinada com um valor
	//fornecido pelo usuario
	public static String apresentarMensagem(String msg) {
		return "Texto enviado pelo usu�rio: " + msg;
		
	}
	
}
