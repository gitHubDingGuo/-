package qian.web.listen;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenOnline implements HttpSessionListener {
   public ListenOnline() {
        // TODO Auto-generated constructor stub
    }
    
	public int num=0;
    public void sessionCreated(HttpSessionEvent arg0)  { 
       num++;
       ServletContext context=arg0.getSession().getServletContext();
       context.setAttribute("online", num);
       num++;
    
    }

	
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	 num--;
         ServletContext context=arg0.getSession().getServletContext();
         context.setAttribute("online", num);
    }


	

	

	


	

}
