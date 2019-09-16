package qian.web.updateuser;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import qian.web.model.Entity;
import qian.web.userdao.UserDao;

/**
 * Servlet implementation class SaveUpdateUser
 */
@WebServlet("/SaveUpdateUser")
public class SaveUpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveUpdateUser() {
        super();
     
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    request.setCharacterEncoding("UTF-8");
		    response.setContentType("text/html;UTF-8");
		    String  id=request.getParameter("id");
		    String name=(String)request.getParameter("name1");
		    String password=(String)request.getParameter("password1");
		    System.out.println(id+name+password);
		    UserDao dao=new UserDao();
		    Entity entity=new Entity();
		    entity.setId(Integer.parseInt(id));
			entity.setName(name);
			entity.setPassword(password);
			dao.save(entity.getId(),entity.getName(), entity.getPassword());
			request.getRequestDispatcher("main.jsp").forward(request, response);
		
		}
	}


