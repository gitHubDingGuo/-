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
 * Servlet implementation class DeleteFeedBackServelet
 */
@WebServlet("/DeleteFeedBackServelet")
public class DeleteFeedBackServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFeedBackServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;charset=UTF-8");
		String strId=request.getParameter("feedBackId");
        int id=Integer.parseInt(strId);
        AdminDao dao=new AdminDao();
        try {
			dao.deleteFeedBack(id);
			response.sendRedirect("AdminMenu.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
       
	}

	
}