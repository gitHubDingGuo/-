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
 * Servlet implementation class passwordModify
 */
@WebServlet("/PasswordModifyServelet")
public class PasswordModifyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PasswordModifyServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String oldPassword=(String) request.getParameter("oldPassword");
		String password=(String) request.getParameter("newPassword2");
		UserDao dao=new UserDao();
		String accountName=(String) request.getSession().getAttribute("accountName");
		String flag=null;
		try {
			flag = dao.getUserOldPassword(accountName);
		    System.out.println(flag+" "+oldPassword);
			if(flag.equals(oldPassword)) {
				dao.updateUserPassword(accountName,password);//更新密码
				
				response.sendRedirect("Login.jsp");
			}
			else{
	            request.setAttribute("passwordError","旧密码不对");
	            request.getRequestDispatcher("PasswordModify.jsp").forward(request, response);		
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//取得旧密码
		
	}

}
