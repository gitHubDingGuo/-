package qian.web.cookiecode;
import java.io.UnsupportedEncodingException;
import org.apache.tomcat.util.codec.binary.Base64;
public class CookieCode {


	
    public static String encodeBase64(String jia) {//加密
		try {  
			 jia=new String(Base64.encodeBase64(jia.getBytes("UTF-8")));
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
    	return jia;
    }
    
    public static String decodeBase64(String jie) {//解密
		try {  
			 jie=new String(Base64.decodeBase64(jie.getBytes()),"UTF-8");			 
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return jie;
    }
}
