package qian.web.strategy;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import qian.web.jdutil.JDUtil;
public abstract class Strategy {
    JDUtil dJdUtil;
    Connection connection=null;
    PreparedStatement statement=null;
    ResultSet resultSet=null;
	public Strategy() {
		// TODO Auto-generated constructor stub
	}
	public abstract ResultSet allConnection() throws Exception, SQLException;

}
