
package org.mybatis.cdi.samples;

import java.util.List;

import org.apache.ibatis.annotations.MapKey;
import org.mybatis.cdi.Mapper;


@Mapper
public interface CursoMapper {
  
  List<Curso> listaMCurso();

  Curso getCurso(); 

}
