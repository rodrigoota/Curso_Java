package br.org.cremesp.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class Dao<T, K> {
	
	protected Connection cn;
	protected PreparedStatement stmt;
	protected ResultSet rs;
	
	private String url = "jdbc:mysql://localhost:3306/db_alunos_cursos?useSSL=false";
	
	//m�todo para abrir a conex�o
	protected void abrirConexao() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		cn = DriverManager.getConnection(url, "root", "desenv");	
	}
	
	//m�todo para fechar a conex�o
	protected void fecharConexao() throws Exception {
		if (cn != null && !cn.isClosed()) {
			cn.close();
		}
	}
	
	public abstract void incluir(T item) throws Exception;
	
	public abstract T buscar(K key) throws Exception;
}
