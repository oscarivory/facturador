
package org.mybatis.cdi.samples;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter(filterName = "SampleWebFilter", urlPatterns = {"/*"})
public class SampleWebFilter implements Filter {

  private static final Logger LOG = Logger.getLogger(SampleWebFilter.class.getName());
  
  
  @Inject
  UserMapper userMapper;
  
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    
      User user = userMapper.getUser(1);
      LOG.log(Level.INFO, "Mapper called on filter doFilter, User = {0}", user.getName());
    
      chain.doFilter(request, response);
    
  }

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    
      User user = userMapper.getUser(1);
      LOG.log(Level.INFO, "Mapper called on filter init, User = {0}", user.getName());
  
  }

  @Override
  public void destroy() {
  }
  
}
