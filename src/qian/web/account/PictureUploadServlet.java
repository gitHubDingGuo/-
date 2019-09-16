package qian.web.account;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Part;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.apache.catalina.Session;
import java.io.File;
import com.sun.tracing.dtrace.FunctionName;

import qian.web.userdao.UserDao;

import javax.servlet.*;


/**
 * Servlet implementation class PictureUploadServlet
 */
@WebServlet("/PictureUploadServlet")
@MultipartConfig
public class PictureUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PictureUploadServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;UTF-8");
	
		//获取上传文件的域
		Part part=request.getPart("headShot");
		//获取文件的名称
		String fileName=part.getSubmittedFileName();

		//防止重命名,对文件进行重命名。
		String newFileName=System.currentTimeMillis()+fileName.substring(fileName.lastIndexOf("."));
		//将文件存到服务器的发布路径下面
	
		String filePath="D:/JavaEE/Java-Web/ending/WebContent/img";
		System.out.println("头像的保存路径为"+filePath);
		
		File file=new File(filePath);
		if(!file.exists()) {
			file.mkdirs();
		}
		System.out.println(newFileName);
		part.write(filePath + "/" + newFileName);
      
		int id=(int)request.getSession().getAttribute("Id");
		UserDao dao=new UserDao();
		dao.updatePictuer(id,newFileName);
		RequestDispatcher dispatcher = request.getRequestDispatcher("UserIndex.jsp");
		dispatcher.forward(request, response);
	
		
	}

}
