package br.org.cremesp.exercicios.classes;

public class Tratamento {
	
	private int codigo;
	private String descricao;
	private Medico medico;
	private Procedimento[] procedimentos;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Procedimento[] getProcedimentos() {
		return procedimentos;
	}
	public void setProcedimentos(Procedimento[] procedimentos) {
		this.procedimentos = procedimentos;
	}
	
	public String exibir() {
		return exibir("DADOS DO TRATAMENTO");
	}
	
	public String exibir(String titulo) {
		return new StringBuilder("\r\n").append(titulo)
				.append("\r\nCódigo: ").append(this.getCodigo())
				.append("\r\nDescrição: ").append(this.getDescricao())
				.append("\r\nMédico: ").append(this.getMedico().exibir())
				.append("\r\nProcedimentos: ")
				.append(this.getProcedimentos() == null ? "Tratamentos não informados" : showRelatorioProcedimentos(this.getProcedimentos()))
				.toString();
	}
	
	private static String showRelatorioProcedimentos(Procedimento[] procedimentos) {
		String relatorioProcedimentos = new String();
		for (int i = 1; i <= procedimentos.length; i++) {
			relatorioProcedimentos += procedimentos[i-1].exibir("\r\nDADOS DO PACIENTE " + i);
		}
		return relatorioProcedimentos;
	}
	
	
}
