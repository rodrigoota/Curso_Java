package br.org.cremesp.repositorio;

import br.org.cremesp.dal.AlunosDao;
import br.org.cremesp.dal.CursosDao;

public class RepositorioDao {
	private static AlunosDao alunosDao;
	
	private static CursosDao cursosDao;
		
	public static AlunosDao getAlunosDao() {
		if(alunosDao == null) {
			alunosDao = new AlunosDao();
		}
		return alunosDao;
	}
	
	public static CursosDao getCursosDao() {
		if(cursosDao == null) {
			cursosDao = new CursosDao();
		}
		return cursosDao;
	}
}
