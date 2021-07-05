package br.org.cremesp.exercicios.aplicacao;

import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showConfirmDialog;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.UIManager;

import br.org.cremesp.exercicios.classes.Clinica;
import br.org.cremesp.exercicios.classes.Medico;
import br.org.cremesp.exercicios.classes.Paciente;
import br.org.cremesp.exercicios.classes.Procedimento;
import br.org.cremesp.exercicios.classes.Tratamento;
import br.org.cremesp.exercicios.enumeracoes.Especialidade;
import br.org.cremesp.exercicios.enumeracoes.Sexo;

public class AppClinica {
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			Clinica clinica = getClinica();
			showMessageDialog(null, clinica.exibir());		
			
//			Paciente[] pacientes = getPacientes();
//			String relatorioPacientes = new String();
//			for (int i = 1; i <= pacientes.length; i++) {
//				relatorioPacientes += pacientes[i-1].exibir("\r\nDADOS DO PACIENTE " + i);
//			}
//			showMessageDialog(null, relatorioPacientes);
//			showMessageDialog(null, showRelatorioPacientes(getPacientes()));
				
			
		} catch (Exception e) {
			showMessageDialog(null, getErro(e), "Erro reportado", ERROR_MESSAGE);

		}
		
	}
	
	private static Clinica getClinica() throws ParseException{
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Clinica clinica = new Clinica();
		clinica.setCodigo(Integer.parseInt(showInputDialog("Informe o código da clínica:")));
		clinica.setDescricao(showInputDialog("Informe a descrição da clínica:"));
		clinica.setDataFundacao(df.parse(showInputDialog("Informe a data de fundação (dd/MM/aaaa)")));
		
		int opcao = showConfirmDialog(null, "Deseja incluir pacientes?", 
				"Pacientes", 
				YES_NO_OPTION, 
				QUESTION_MESSAGE);
		
		if(opcao == YES_OPTION) {
			clinica.setPacientes(getPacientes());		
		}
		return clinica;
		 
	}
	
	private static Paciente[] getPacientes() throws ParseException {
		
		int qtde = Integer.parseInt(showInputDialog("Quantos pacientes?"));
		if (qtde <= 0) {
			throw new IllegalArgumentException("Quantidade inválida.");
		}
		
		Paciente[] pacientes = new Paciente[qtde];	
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		for (int i = 1; i <= qtde; i++) {
			Paciente paciente = new Paciente();
			
			paciente.setCpf(showInputDialog("Informe o CPF do " + i + " paciente:"));
			paciente.setDataNascimento(df.parse(showInputDialog("Informe a data de nascimento (dd/MM/aaaa) do " + i + " paciente:")));
			paciente.setNome(showInputDialog("Informe o nome do " + i + " paciente:"));
			Sexo sexo = (Sexo) showInputDialog(
					null,
					"Informe o sexo:",
					"Sexo",
					QUESTION_MESSAGE,
					null,
					Sexo.values(),
					null);
			paciente.setSexo(sexo);
			
			int opcao = showConfirmDialog(null, "Deseja incluir tratamentos?", 
					"Tratamentos", 
					YES_NO_OPTION, 
					QUESTION_MESSAGE);
			if(opcao == YES_OPTION) {
				paciente.setTratamentos(getTratamentos());		
			}
			
			
			pacientes[i-1] = paciente;
		}
		return pacientes;
	}
	
	private static String showRelatorioPacientes(Paciente[] pacientes) {
		String relatorioPacientes = new String();
		for (int i = 1; i <= pacientes.length; i++) {
			relatorioPacientes += pacientes[i-1].exibir("\r\nDADOS DO PACIENTE " + i);
		}
		return relatorioPacientes;
	}
	
	private static Tratamento[] getTratamentos() {
		int qtde = Integer.parseInt(showInputDialog("Quantos tratamentos?"));
		if (qtde <= 0) {
			throw new IllegalArgumentException("Quantidade inválida.");
		}		
		Tratamento[] tratamentos = new Tratamento[qtde];
		
		for (int i = 1; i <= qtde; i++) {
			Tratamento tratamento = new Tratamento();
			
			tratamento.setCodigo(Integer.parseInt(showInputDialog("Informe o código do tratamento:")));
			tratamento.setDescricao(showInputDialog("Informe a descrição do tratamento:"));
			tratamento.setMedico(getMedico());

			int opcao = showConfirmDialog(null, "Deseja incluir procedimentos?", 
					"Procedimentos", 
					YES_NO_OPTION, 
					QUESTION_MESSAGE);
			if(opcao == YES_OPTION) {
				tratamento.setProcedimentos(getProcedimentos());	
			}
			
			tratamentos[i-1] = tratamento;
		}
		
		return tratamentos;
	}
	
	private static Procedimento[] getProcedimentos() {
		int qtde = Integer.parseInt(showInputDialog("Quantos procedimentos?"));
		if (qtde <= 0) {
			throw new IllegalArgumentException("Quantidade inválida.");
		}		
		Procedimento[] procedimentos = new Procedimento[qtde];		
		
		for (int i = 1; i <= qtde; i++) {
			Procedimento procedimento = new Procedimento();
			
			procedimento.setCodigo(Integer.parseInt(showInputDialog("Informe o código do procedimento:")));
			procedimento.setDescricao(showInputDialog("Informe a descrição do procedimento:"));
			procedimento.setValor(Double.parseDouble(showInputDialog("Informe o valor:")));

			procedimentos[i-1] = procedimento;
		}
		return procedimentos;
	}

	private static Medico getMedico() {
		Medico medico = new Medico();
		
		medico.setCrm(Integer.parseInt(showInputDialog("Informe o CRM do médico:")));
		medico.setNome(showInputDialog("Informe o nome do médico:"));
		Especialidade especialidade = (Especialidade) showInputDialog(
				null,
				"Informe a especialidade:",
				"Especialidade",
				QUESTION_MESSAGE,
				null,
				Especialidade.values(),
				null);
		medico.setEspecialidade(especialidade);
		
		return medico;
	}
	
	private static String getErro(Exception e) {
		
		String origem = e.getClass().getName();
		
		String pilha = "";
		for (StackTraceElement item : e.getStackTrace()) {
			pilha += item.toString() + "\r\n";
		}
		String erro = "Classe: " + origem + "\r\nMensagem: "  + e.getMessage()
		+ "\r\n\r\nPilha:\r\n" + pilha;
		
		//System.out.println(erro);
		
		return erro;
	}
	
}
