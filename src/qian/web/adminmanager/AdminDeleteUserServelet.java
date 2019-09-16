package qian.web.adminmanager;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qian.web.userdao.AdminDao;

/**
 * Servlet implementation class AdminDeleteUserServelet
 */
@WebServlet("/AdminDeleteUserServelet")
public class AdminDeleteUserServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminDeleteUserServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String accountNumber=request.getParameter("accountNumber");
		AdminDao dao=new AdminDao();
		try {
			dao.deleteUser(accountNumber);
			response.sendRedirect("AdminMenu.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
