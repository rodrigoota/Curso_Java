package br.org.cremesp.classes.ordenadores;

import java.util.Comparator;

import br.org.cremesp.classes.Curso;

public class OrdenacaoCodigoCurso implements Comparator<Curso> {

	@Override
	public int compare(Curso o1, Curso o2) {
		Integer c1 = o1.getCodigo();
		Integer c2 = o2.getCodigo();
		return c1.compareTo(c2);
	}
}
