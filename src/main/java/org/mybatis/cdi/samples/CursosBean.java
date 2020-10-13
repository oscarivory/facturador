
package org.mybatis.cdi.samples;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("cursosBean")
public class CursosBean {

  @Inject
  CursoMapper cursoMapper;
  
  	private List<Curso> listaCursos;
  	
  	public Curso getCursoMapper() {
  		return  (Curso) cursoMapper.getCurso();
  	}

	public void setCursoMapper(CursoMapper cursoMapper) {
		this.cursoMapper = cursoMapper;
	}

	public List<Curso> getListaCursos() {
		return this.cursoMapper.listaMCurso();
	}

	public void setListaCursos(List<Curso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	
  
  
}
