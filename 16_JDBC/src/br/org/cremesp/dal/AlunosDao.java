package br.org.cremesp.dal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

import br.org.cremesp.classes.Aluno;
import br.org.cremesp.enumeracoes.Sexo;
import br.org.cremesp.repositorio.RepositorioDao;

public class AlunosDao extends Dao<Aluno, Integer> {

	@Override
	public void incluir(Aluno item) throws Exception {
		
		try {
			abrirConexao();

			String sql = "INSERT INTO TB_ALUNOS (NOME, DATANASC, SEXO) VALUES (?, ?, ?)";
			
			stmt = cn.prepareStatement(sql);
			stmt.setString(1, item.getNome());
			stmt.setDate(2, new java.sql.Date(item.getDataNascimento().getTime()));
			stmt.setString(3, item.getSexo().toString());
			
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno incluído com sucesso");			
			
		
		}catch (Exception e) {
				throw e;
		} finally {
			fecharConexao();
		}
		
	}

	@Override
	public Aluno buscar(Integer key) throws Exception {
		
		Aluno aluno = null;
		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_ALUNOS WHERE ID = ?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, key);
			
			rs = stmt.executeQuery();
			if (rs.next()) {
				
				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				Date dataNasc = rs.getDate("DATANASC");
				Sexo sexo = rs.getString("SEXO").equals("MASCULINO") ? Sexo.MASCULINO : Sexo.FEMININO;
			
				aluno = new Aluno(nome, sexo, dataNasc);
				aluno.setId(id);
				
				aluno.getCursos().addAll(RepositorioDao.getCursosDao().listarPorAluno(id));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		return aluno;
	}
	
	public List<Aluno> listar() throws Exception{
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_ALUNOS";
			stmt = cn.prepareStatement(sql);
			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				
				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				Date dataNasc = rs.getDate("DATANASC");
				Sexo sexo = rs.getString("SEXO").equals("MASCULINO") ? Sexo.MASCULINO : Sexo.FEMININO;
				
				Aluno aluno = new Aluno(nome, sexo, dataNasc); 
				aluno.setId(id);
				aluno.getCursos().addAll(RepositorioDao.getCursosDao().listarPorAluno(id));
				alunos.add(aluno);
			}

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
		
		return alunos;
	}

}
