package br.org.cremesp.dal;

import java.util.ArrayList;
import java.util.List;

import br.org.cremesp.classes.Curso;
import br.org.cremesp.repositorio.RepositorioDao;

public class CursosDao extends Dao<Curso, Integer> {

	@Override
	public void incluir(Curso item) throws Exception {
		try {
			abrirConexao();
			String sql = "INSERT INTO TB_CURSOS (CODIGO, DESCRICAO, CH, PRECO," + " IDALUNO) VALUES (?,?,?,?,?)";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, item.getCodigo());
			stmt.setString(2, item.getDescricao());
			stmt.setInt(3, item.getCh());
			stmt.setDouble(4, item.getPreco());
			stmt.setInt(5, item.getAluno().getId());

			stmt.executeUpdate();

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}
	}

	@Override
	public Curso buscar(Integer key) throws Exception {
		Curso curso = null;

		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_CURSOS WHERE ID = ?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, key);

			rs = stmt.executeQuery();
			if (rs.next()) {
				curso = new Curso(rs.getInt("ID"), rs.getString("DESCRICAO"), rs.getInt("CH"), rs.getDouble("PRECO"),
						RepositorioDao.getAlunosDao().buscar(rs.getInt("IDALUNO")));
				curso.setId(rs.getInt("ID"));
			}

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}

		return curso;
	}

	public List<Curso> listarPorAluno(int idAluno) throws Exception {
		List<Curso> cursos = new ArrayList<Curso>();

		try {
			abrirConexao();
			String sql = "SELECT * FROM TB_CURSOS WHERE IDALUNO = ?";
			stmt = cn.prepareStatement(sql);
			stmt.setInt(1, idAluno);

			rs = stmt.executeQuery();
			if (rs.next()) {
				Curso curso = new Curso(
						rs.getInt("ID"), 
						rs.getString("DESCRICAO"), 
						rs.getInt("CH"),
						rs.getDouble("PRECO"), 
						RepositorioDao.getAlunosDao().buscar(rs.getInt("IDALUNO")));
				curso.setId(rs.getInt("ID"));
				cursos.add(curso);
			}

		} catch (Exception e) {
			throw e;
		} finally {
			fecharConexao();
		}

		return cursos;
	}
}
