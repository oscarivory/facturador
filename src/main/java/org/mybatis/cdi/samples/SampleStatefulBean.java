
package org.mybatis.cdi.samples;

import java.io.Serializable;
import javax.ejb.Stateful;
import javax.inject.Inject;


@Stateful
public class SampleStatefulBean implements Serializable {

	private static final long serialVersionUID = 6233049191090926749L;
@Inject UserMapper users;
  
  public User findUser(int id) {
    return users.getUser(id);
  }
  
}
