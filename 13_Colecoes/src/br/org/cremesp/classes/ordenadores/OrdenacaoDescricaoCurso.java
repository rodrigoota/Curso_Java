package br.org.cremesp.classes.ordenadores;

import java.util.Comparator;

import br.org.cremesp.classes.Curso;

public class OrdenacaoDescricaoCurso implements Comparator<Curso> {

	@Override
	public int compare(Curso o1, Curso o2) {
		return o1.getDescricao().compareTo(o2.getDescricao());
	}

}
