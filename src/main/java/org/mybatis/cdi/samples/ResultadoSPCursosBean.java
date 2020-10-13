
package org.mybatis.cdi.samples;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("resultadoSPcursosBean")
public class ResultadoSPCursosBean {

  @Inject
  ResultadoSPCursoMapper cursoMapper;
  
  	private List<ResultadoSPCurso> listaCursos;
  	
  	public ResultadoSPCurso getCursoMapper() {
  		return  (ResultadoSPCurso) cursoMapper.getCurso();
  	}

	public void setCursoMapper(ResultadoSPCursoMapper cursoMapper) {
		this.cursoMapper = cursoMapper;
	}

	public List<ResultadoSPCurso> getListaCursos(int arg1) {
		this.listaCursos= this.cursoMapper.listaMCurso(arg1);
		return this.listaCursos;
	}

	public void setListaCursos(List<ResultadoSPCurso> listaCursos) {
		this.listaCursos = listaCursos;
	}

	
  
  
}
