package mx.com.cx.util;

import java.io.IOException;
import java.util.ResourceBundle;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mx.com.cx.dto.UsuarioDTO;
import org.apache.log4j.Logger;

public class ForcedLoginFilter implements Filter {

    private final Logger log = Logger.getLogger(this.getClass());
    private static final String LOGIN_JSF = ResourceBundle.getBundle("RecursosSistema").getString("REDIRECCIONAMIENTO_SESION");
    private static final String LOGIN_JSF_REDIRECT = ResourceBundle.getBundle("RecursosSistema").getString("LOGIN_JSF_REDIRECT");

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        boolean isLoggedIn = checkLoginState(request, response);
        if (isRedirect((HttpServletRequest) request) && !isLoggedIn) {
            ((HttpServletResponse) response).sendRedirect(LOGIN_JSF_REDIRECT);
        } else {
            try {
                chain.doFilter(request, response);
            } catch (IOException | ServletException t) {
                log.error(t.getMessage());
            }
        }
    }

    private static boolean checkLoginState(ServletRequest request, ServletResponse response) throws IOException, ServletException {
        boolean isLoggedIn = false;
        HttpSession session = ((HttpServletRequest) request).getSession(false);
        UsuarioDTO managedUserBean = null;
        if (null != session && (null != (managedUserBean = (UsuarioDTO) session.getAttribute(ResourceBundle.getBundle("RecursosSistema").getString("USUARIO_SESION"))))) {
            if (managedUserBean.getIdUsuario() > 0) {
                isLoggedIn = true;
            }
        }
        return isLoggedIn;
    }

    private boolean isRedirect(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        return (!requestURI.contains(LOGIN_JSF));
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
    }

}