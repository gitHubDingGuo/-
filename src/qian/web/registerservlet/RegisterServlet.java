package qian.web.registerservlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.mysql.jdbc.interceptors.ServerStatusDiffInterceptor;

import jdk.internal.org.objectweb.asm.Handle;
import qian.web.jdutil.JDUtil;
import qian.web.model.Entity;
import qian.web.userdao.UserDao;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
	    Entity entity=null;
	    String exiterror;
	    UserDao dao;
	    StringBuffer buffer=new StringBuffer();
	    String name= (String) request.getParameter("username");
	    String password=(String)request.getParameter("password");
	   
	    if( ( name != null && ( name.equals("") ) ) || ( name != null && ( name.length()<1 ) ) ) {
	    	buffer.append("名字为空");
	    	request.setAttribute("error",buffer.toString());
	    	
	    }
	    
	  
	    
	    if( (password != null && password.equals("")) ||(password!=null&&password.length()<1) ) {
	    	buffer.append("密码为空");
	    	request.setAttribute("error", buffer.toString());
	    	
	    }
	    
	    if( !buffer.toString().equals("")) {
          RequestDispatcher aDispatcher=request.getRequestDispatcher("Register.jsp");
          aDispatcher.forward(request, response);
	    }
	    
	    if(buffer.toString().equals("")) {
	    	 dao=new UserDao();
	    	 try {
				if(dao.isExsit(name)==true) {
					System.out.println("ok11");
					request.setAttribute("exiterror", "用户名字已经存在");
					RequestDispatcher aDispatcher=request.getRequestDispatcher("Register.jsp");
			        aDispatcher.forward(request, response);
				 }else {
					 entity=new Entity();
					 entity.setName(name);
					 entity.setPassword(password);
					 dao.save(entity.getName(), entity.getPassword());
					 RequestDispatcher a=request.getRequestDispatcher("Login.jsp");
				     a.forward(request, response);
					 
				 }
			} catch (ReflectiveOperationException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	 
	    }
	    
	    
	}

}
