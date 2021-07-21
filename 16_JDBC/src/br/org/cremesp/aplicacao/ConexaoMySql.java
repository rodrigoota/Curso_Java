package br.org.cremesp.aplicacao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.org.cremesp.enumeracoes.Sexo;

public class ConexaoMySql {
	public static void main(String[] args) {
		
		//objeto usado para manter a conexao com o banco de dados
		Connection con;
		
		PreparedStatement stmt;
		
		try {
			//String de conexao com o banco de dados
			String url = "jdbc:mysql://localhost:3306/db_alunos_cursos?useSSL=false";
			
			//definindo o driver de acesso como sendo o mysql
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, "root", "desenv");
			
			System.out.println("Conexão OK");
			
			String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
			String data = JOptionPane.showInputDialog("Informe a data de nesc. do aluno:");
			Date dataNasc = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			Sexo sexo = (Sexo) JOptionPane.showInputDialog(null,
					"Informe o sexo do aluno:",
					"Sexo",
					JOptionPane.QUESTION_MESSAGE,
					null,
					Sexo.values(),
					null);

			String sql = "INSERT INTO TB_ALUNOS (NOME, DATANASC, SEXO) VALUES (?, ?, ?)";
			
			stmt = con.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setDate(2, new java.sql.Date(dataNasc.getTime()));
			stmt.setString(3, sexo.toString());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno incluído com sucesso");
			
			
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
