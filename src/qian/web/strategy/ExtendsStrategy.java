package qian.web.strategy;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import qian.web.jdutil.JDUtil;
public class ExtendsStrategy extends Strategy{
	String sql;
	public ExtendsStrategy(String sql) {
		this.sql=sql;
	}
	@Override
	public ResultSet allConnection() throws Exception, SQLException {
		connection=(Connection) JDUtil.getConnetion();
		statement=(PreparedStatement) connection.prepareStatement(this.sql);
		resultSet=statement.executeQuery();
		return resultSet;
	}
	
	public void allClose() throws SQLException {
		connection.close();
		statement.close();
		resultSet.close();
	}
	
}
