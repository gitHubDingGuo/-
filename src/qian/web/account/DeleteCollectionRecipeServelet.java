package qian.web.account;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qian.web.userdao.UserDao;

/**
 * Servlet implementation class DeleteCollectionRecipeServelet
 */
@WebServlet("/DeleteCollectionRecipeServelet")
public class DeleteCollectionRecipeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCollectionRecipeServelet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("UTF-8");
       response.setContentType("text/html;charset=UTF-8");	
		String id=request.getParameter("allId");
	    int allId=Integer.parseInt(id);
	    System.out.println(allId);
	    UserDao dao=new UserDao();
	    try {
			dao.deleteCollectionRecipe(allId);
			  response.sendRedirect("MyCollection.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  
	    
	}

	

}
