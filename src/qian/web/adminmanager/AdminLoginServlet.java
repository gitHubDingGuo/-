package qian.web.adminmanager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.PRIVATE_MEMBER;

import com.sun.glass.ui.Application;

import qian.web.applicant.Applicant;
import qian.web.cookiecode.CookieCode;
import qian.web.model.Entity;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdminLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Entity entity = null;
		String exiterror;
		UserDao dao;
		StringBuffer buffer = new StringBuffer();
		String name = (String) request.getParameter("adminName");
		String password = (String) request.getParameter("adminPassword");
		dao = new UserDao();

		try {

			int id = dao.adminExsit(name, password);
			System.out.println(id);
			if (id != 0) {

				ServletContext application = getServletContext();
				TreeSet<String> adminlists = (TreeSet) application.getAttribute("adminList");
				request.getSession().setAttribute("adminName", name);

				if (adminlists == null) {
					adminlists = new TreeSet<String>();
					adminlists.add(name);
					application.setAttribute("adminList", adminlists);
					RequestDispatcher a = request.getRequestDispatcher("AdminMenu.jsp");
					a.forward(request, response);
				}
				

				else {

					if (adminlists.contains(name)) {
						request.setAttribute("adminExit", "管理员已经登录!");
						request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
					} else {
						adminlists.add(name);
						RequestDispatcher a = request.getRequestDispatcher("AdminMenu.jsp");
						a.forward(request, response);
					}
				}
				

			} else {
				request.setAttribute("exiterror2", "用户名字或者密码错误");
				RequestDispatcher aDispatcher = request.getRequestDispatcher("AdminLogin.jsp");
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
