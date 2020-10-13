
package org.mybatis.cdi.samples;

import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "SampleServlet", urlPatterns = {"/SampleServlet"})
public class SampleServlet extends HttpServlet {


	private static final long serialVersionUID = 1L;
@Inject
  UserMapper userMapper;
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = response.getWriter()) {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet SampleServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>User (Servlet): " + userMapper.getUser(1).getName() + "</h1>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  @Override
  public String getServletInfo() {
    return "Sample Servlet";
  }

}
