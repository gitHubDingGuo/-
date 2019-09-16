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
 * Servlet implementation class SaveCommentServelet
 */
@WebServlet("/SaveCommentServelet")
public class SaveCommentServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SaveCommentServelet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String comment = request.getParameter("comment");// 评论内容
		String strId = request.getParameter("rId");
		int id = Integer.parseInt(strId);// 那张菜谱
		String accountName = (String) request.getSession().getAttribute("accountName");// 谁评论
		UserDao dao = new UserDao();

		try {
			dao.saveComment(comment, accountName, id);
			response.sendRedirect("UserIndex.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
