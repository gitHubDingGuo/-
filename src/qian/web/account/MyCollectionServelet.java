package qian.web.account;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import qian.web.userdao.UserDao;

/**
 * Servlet implementation class MyCollectionServelet
 */
@WebServlet("/MyCollectionServelet")
public class MyCollectionServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyCollectionServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("UTF-8");
	      response.setContentType("text/html;charset=UTF-8");
	      String allId=request.getParameter("allId1");
	      int id=Integer.parseInt(allId);
	      String accountNumber=request.getParameter("accountNumber");
	      UserDao dao=new UserDao();
	      try {
			 dao.saveMyCollection(id,accountNumber);
			 response.sendRedirect("MyCollection.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	      
	      
	}

	
}
