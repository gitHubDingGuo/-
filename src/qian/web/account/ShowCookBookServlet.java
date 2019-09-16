package qian.web.account;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import qian.web.model.Recipe;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class ShowCookBookServlet
 */
@WebServlet("/ShowCookBookServlet")
public class ShowCookBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowCookBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;UTF-8");
		UserDao dao=new UserDao();
		String userAccount=(String)request.getSession().getAttribute("accountName");
		ArrayList<Recipe> recipe=dao.getRecipe(userAccount);//通过登录的人的账号找到menu——message菜谱信息
		request.setAttribute("recipes", recipe);
		request.getRequestDispatcher("CookBook.jsp").forward(request, response);//回到菜谱页面显示
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
