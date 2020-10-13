
package org.mybatis.cdi.samples;

import javax.ejb.Stateless;
import javax.inject.Inject;


@Stateless
public class SampleStatelessBean {

  @Inject UserMapper users;
  
  public User findUser(int id) {
    return users.getUser(id);
  }
  
}
