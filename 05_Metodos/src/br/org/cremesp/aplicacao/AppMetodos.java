package br.org.cremesp.aplicacao;

import javax.swing.JOptionPane;

import br.org.cremesp.metodos.Mensagem;

public class AppMetodos {
	public static void main(String[] args) {
		Mensagem.mostrarMensagem();
		show(Mensagem.retornarMensagem());
		show(Mensagem.apresentarMensagem("Curso Java"));
		
		show(TesteVisibilidade.monstrarTexto());
	}
	
	private static void show(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
