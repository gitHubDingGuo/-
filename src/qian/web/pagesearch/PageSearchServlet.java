package qian.web.pagesearch;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.DALOAD;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import qian.web.model.Entity;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class PageSearchServlet
 */
@WebServlet("/PageSearchServlet")
public class PageSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;UTF-8");
		String newCurrentPage=request.getParameter("currentPage");
		UserDao dao=new UserDao();
		System.out.println("ok");
		int num=5;//显示页数
		int total=dao.getTotalPage();//总页数
		System.out.println(newCurrentPage);
		System.out.println(total);
		int totalPage=total%num>0?total/num+1:total/num;
		int  currentPage=1;
		
		if(newCurrentPage!=null) {
			currentPage=Integer.parseInt(newCurrentPage);
		}
		if(currentPage<=1) {
			currentPage=1;
		}
		if(currentPage>=totalPage) {
			currentPage=totalPage;
		}
		int start=(currentPage-1)*num;//开始位置
		int end=num;//结束位置
		
		ArrayList<Entity> userList=dao.searchUserPage(start,end);
		request.setAttribute("currentPage", currentPage);
		request.setAttribute("totalPage", totalPage);
		request.setAttribute("userlist",  userList);
		request.getRequestDispatcher("Main.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
