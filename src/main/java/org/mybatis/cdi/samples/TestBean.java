
package org.mybatis.cdi.samples;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped
@Named("testBean")
public class TestBean {

  @Inject
  UserMapper userMapper;
  
  @Inject
  SampleStatefulBean stateful;
  
  @Inject
  SampleStatelessBean stateless;
  
  public User getUser() {
    return userMapper.getUser(1);
  }
  
  public User getUserFromStateless() {
    return stateless.findUser(1);
  }
    
  public User getUserFromStateful() {
    return stateful.findUser(1);
  }
    
  
  
  
}
