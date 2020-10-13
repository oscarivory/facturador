package org.mybatis.cdi.samples;

import java.util.List;
import org.mybatis.cdi.samples.Curso;

public class Cursos {
List <org.mybatis.cdi.samples.Curso> Cursos;

public List<org.mybatis.cdi.samples.Curso> getCursos() {
	return Cursos;
}


public void setCursos(List<org.mybatis.cdi.samples.Curso> cursos) {
	Cursos = cursos;
}


}
