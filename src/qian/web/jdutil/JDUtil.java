package qian.web.jdutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class JDUtil {

	private final static String DRIVER="com.mysql.jdbc.Driver";
    private final static String URL="jdbc:mysql://localhost:3306/test?&useSSL=true";
    private final static String ROOT="root";
    private final static String PASSWORD="12580";
   private JDUtil() {};
   private static Connection connection=null;//私有的静态
   public static Connection getConnetion() throws ReflectiveOperationException, SQLException {
	   if(connection==null) {
			Class.forName(DRIVER);   
	    	Connection connection=(Connection) DriverManager.getConnection(URL,ROOT,PASSWORD);
	    	return connection;  
	   }else {
		   return connection;   
	}
     	
    }
    
    
    
    public static void close(ResultSet rs,PreparedStatement prepare,Connection conn) throws SQLException {
    	if(rs==null) {
    		conn.close();
        	prepare.close();
    	}else {
    		conn.close();
        	prepare.close();
        	rs.close();
    	}
    
    	
    }
    
  

}
