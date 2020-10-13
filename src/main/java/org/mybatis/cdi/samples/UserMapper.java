
package org.mybatis.cdi.samples;

import java.util.List;
import org.mybatis.cdi.Mapper;


@Mapper
public interface UserMapper {

  User getUser(Integer id);
  
}
