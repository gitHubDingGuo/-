package qian.web.loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.sun.glass.ui.Application;
import com.sun.org.apache.bcel.internal.generic.NEW;

import qian.web.applicant.Applicant;
import qian.web.cookiecode.CookieCode;
import qian.web.model.Entity;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Entity entity = null;
		String exiterror;
		UserDao dao;
		StringBuffer buffer = new StringBuffer();
		String name = (String) request.getParameter("username");
		String password = (String) request.getParameter("password");
		String remember = (String) request.getParameter("remember");

		if ((name != null && (name.equals(""))) || (name != null && (name.length() < 1))) {
			buffer.append("名字为空");
			request.setAttribute("error1", buffer.toString());

		}

		if ((password != null && password.equals("")) || (password != null && password.length() < 1)) {
			buffer.append("密码为空");
			request.setAttribute("error1", buffer.toString());

		}

		if (!buffer.toString().equals("")) {
			RequestDispatcher aDispatcher = request.getRequestDispatcher("login.jsp");
			aDispatcher.forward(request, response);
		}

		if (buffer.toString().equals("")) {
			dao = new UserDao();

			try {
				int right = dao.allExsit(name, password);
				if (right != 0) {
					Applicant applicant = new Applicant(right, name, password);
					
					request.getSession().setAttribute("session_applicant", applicant);

					int idd = dao.getId(name);
					request.getSession().setAttribute("Id", idd);
					request.getSession().setAttribute("accountName", name);

					ServletContext application = getServletContext();//判断是否多次登录
					TreeSet<String> userlists = (TreeSet) application.getAttribute("userlist");
                    
					if (userlists == null) {
						userlists = new TreeSet<String>();
						userlists.add(name);
						application.setAttribute("userlist", userlists);
						if ("true".equals(remember)) {
							Cookie cookie1 = new Cookie("cookie_applicantName", CookieCode.encodeBase64(name));
							cookie1.setPath("/");
							cookie1.setMaxAge(60);
							response.addCookie(cookie1);

							Cookie cookie2 = new Cookie("cookie_applicantPassword", CookieCode.encodeBase64(password));
							cookie2.setPath("/");
							cookie2.setMaxAge(60);
							response.addCookie(cookie2);
						} else {

							Cookie[] all = request.getCookies();
							if (all != null) {
								for (Cookie c : all) {
									if ("cookie_applicantName".equals(c.getName())
											|| "cookie_applicantPassword".equals(c.getName())) {
										c.setMaxAge(0);
										c.setPath("/");
										response.addCookie(c);
									}

								}
							}
						}
						RequestDispatcher a = request.getRequestDispatcher("UserIndex.jsp");
						a.forward(request, response);
					}

					else {
						if (userlists.contains(name)) {
							request.setAttribute("userExit", "用户已经登录!");
							request.getRequestDispatcher("Login.jsp").forward(request, response);
						} else {
							userlists.add(name);
							if ("true".equals(remember)) {
								Cookie cookie1 = new Cookie("cookie_applicantName", CookieCode.encodeBase64(name));
								cookie1.setPath("/");
								cookie1.setMaxAge(60);
								response.addCookie(cookie1);

								Cookie cookie2 = new Cookie("cookie_applicantPassword",
										CookieCode.encodeBase64(password));
								cookie2.setPath("/");
								cookie2.setMaxAge(60);
								response.addCookie(cookie2);
							} else {

								Cookie[] all = request.getCookies();
								if (all != null) {
									for (Cookie c : all) {
										if ("cookie_applicantName".equals(c.getName())
												|| "cookie_applicantPassword".equals(c.getName())) {
											c.setMaxAge(0);
											c.setPath("/");
											response.addCookie(c);
										}

									}
								}
							}
							RequestDispatcher a = request.getRequestDispatcher("UserIndex.jsp");
							a.forward(request, response);
						}
					}

				} else {
					request.setAttribute("exiterror1", "用户名字或者密码错误");
					RequestDispatcher aDispatcher = request.getRequestDispatcher("Login.jsp");
					aDispatcher.forward(request, response);

				}
			} catch (ReflectiveOperationException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
