package qian.web.account;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qian.web.model.Recipe;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class ShowCollectionServlet
 */
@WebServlet("/ShowCollectionServlet")
public class ShowCollectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCollectionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		UserDao dao=new UserDao();
		String accountNumber=(String) request.getSession().getAttribute("accountName");
		ArrayList<Recipe> recipes;
		try {
			recipes = dao.getCollectionRecipe(accountNumber);
			for(Recipe r:recipes) {
				System.out.println(r.getAllID());
			}
			request.setAttribute("showCollectionRecipe", recipes);
			request.getRequestDispatcher("MyCollection.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	
}
