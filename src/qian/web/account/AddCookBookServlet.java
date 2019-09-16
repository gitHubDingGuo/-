package qian.web.account;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.sun.org.apache.bcel.internal.generic.NEW;

import qian.web.userdao.UserDao;

/**
 * Servlet implementation class AddCookBookServlet
 */
@WebServlet("/AddCookBookServlet")
@MultipartConfig
public class AddCookBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("test/html;");
																																						
		String recipeName=request.getParameter("recipeName");//菜谱名字
		String accountName=(String) request.getSession().getAttribute("accountName");//用户id
		String decription=request.getParameter("decription");//描述
		String mainIgredient=request.getParameter("mainIngredient");//主料
		String flavour=request.getParameter("flavour");//辅料
		String step=request.getParameter("step");//步奏
		String knack=request.getParameter("knack");//窍门	
		
		Part part=request.getPart("headShot");//获取作用域
		String fileName=part.getSubmittedFileName();//获取文件名字
		String newFileName=System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));//重命名
		String filePath = getServletContext().getRealPath("/recipeImg");
		System.out.println(filePath);
	/*	String filePath="D:/JavaEE/Java-Web/ending/WebContent/recipeImg";//保存到该路径下面
*/	    File f=new File(filePath);
	    if(!f.exists()) {
	    	f.mkdirs();
	    } 
	    part.write(filePath+"/"+newFileName);//写图片
	   /* String picturePath="recipeImg"+"/"+newFileName;*/
	     /* String picturePath=filePath+"/"+newFileName;*/
	    String pictureName="recipeImg/"+newFileName;
	    UserDao dao=new UserDao();
	    dao.insertRecipe(accountName,recipeName, pictureName,decription,mainIgredient,flavour,step,knack);//插入图片到数据库
	    request.getRequestDispatcher("UserIndex.jsp").forward(request, response);
	    
	    
		
		
		
	
	
	}

}
