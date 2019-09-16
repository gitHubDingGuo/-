package qian.web.filter;
import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet Filter implementation class Filter
 */
@WebFilter/*(urlPatterns="/*",initParams= {
		@WebInitParam(name="loginPage",  value="login.jsp"),
		@WebInitParam(name="loginservlet",value="loginServlet")
})*/
public class Filter implements javax.servlet.Filter {

	
	 private FilterConfig config;
   
    public Filter() {
  	
    }
    
	public void init(FilterConfig fConfig) throws ServletException {
		this.config=fConfig;
	}
	public void destroy() {
		
		this.config=null;
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException,NullPointerException {
		//初始化参数
		
		

			       /*  String login=config.getInitParameter("loginPage");
			         String loginservlt=config.getInitParameter("loginservlet");
					HttpSession session=((HttpServletRequest)request).getSession();
				
					String requestPath=((HttpServletRequest)request).getServletPath();
					
					if(session.getAttribute("session_applicant") != null||requestPath.endsWith(login)||requestPath.endsWith(loginservlt)) {
						chain.doFilter(request, response);
					}else {
						request.setAttribute("tip", "你还没登陆:");
						request.getRequestDispatcher(login).forward(request, response);
					}*/
		
		
				
		}
		

	

}
