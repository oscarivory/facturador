

package org.mybatis.cdi.samples;

import java.io.Serializable;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("conv")
@ConversationScoped
public class SampleConversationScopedBean implements Serializable {

 
	private static final long serialVersionUID = 1L;
@Inject
  UserMapper userMapper;
  
  public User getUser() {
    return userMapper.getUser(1);
  }
  
}
