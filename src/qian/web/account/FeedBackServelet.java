package qian.web.account;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import qian.web.userdao.UserDao;

/**
 * Servlet implementation class FeedBackServelet
 */
@WebServlet("/FeedBackServelet")
public class FeedBackServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedBackServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String feedBack=request.getParameter("feedBack");
		String accountNumber=(String) request.getSession().getAttribute("accountName");
		UserDao dao=new UserDao();
		try {
			dao.saveFeedBack(feedBack,accountNumber);
			response.sendRedirect("UserIndex.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
