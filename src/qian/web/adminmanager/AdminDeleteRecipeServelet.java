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
 * Servlet implementation class AdminDeleteRecipeServelet
 */
@WebServlet("/AdminDeleteRecipeServelet")
public class AdminDeleteRecipeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AdminDeleteRecipeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String allId=request.getParameter("allId");
		AdminDao dao=new AdminDao();
		try {
			dao.deleteAllRecipe(allId);
			response.sendRedirect("AdminMenu.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	}

	
}
