
package org.mybatis.cdi.samples;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("sess")
@ConversationScoped
public class SampleSessionScopedBean implements Serializable {

	private static final long serialVersionUID = 1L;
@Inject
  UserMapper userMapper;
  
  public User getUser() {
    return userMapper.getUser(1);
  }
  
}
