package qian.web.account;



import java.sql.SQLException;
import qian.web.userdao.UserDao;
import org.apache.catalina.Session;
import java.io.File;
import com.sun.tracing.dtrace.FunctionName;
import javax.servlet.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

/**
 * Servlet implementation class AccountSetServlet
 */
@WebServlet("/AccountSetServlet")
@MultipartConfig
public class AccountSetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountSetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String name=request.getParameter("myName");
		String sex=request.getParameter("sex");
		String email=request.getParameter("email");
		String address=request.getParameter("address");
		String phoneNumber=request.getParameter("phoneNumber");
		
		Part part=request.getPart("headShot");//域
		String fileName=part.getSubmittedFileName();//名字
		System.out.println(fileName);
		
			String newFileName=System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));//新名字
			System.out.println(newFileName);
		/*	String filePath="D:/JavaEE/Java-Web/ending/WebContent/img";//保存路径
		 * 
*/			String filePath=getServletContext().getRealPath("/recipeImg");
			File file=new File(filePath);
			if(!file.exists()) {
				file.mkdirs();
			}
			part.write(filePath+"/"+newFileName);//写
			String newFileName1="recipeImg/"+newFileName;
			String accountName=(String) request.getSession().getAttribute("accountName");
			UserDao dao=new UserDao();
	
				try {
					dao.saveAccountSet(accountName,name,sex,email,address,phoneNumber,newFileName1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				request.getRequestDispatcher("Account.jsp").forward(request, response);
			
			
		
			
		
	
		}
	    

}
	

