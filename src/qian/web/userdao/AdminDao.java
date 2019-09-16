package qian.web.userdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.sun.corba.se.impl.util.PackagePrefixChecker;
import com.sun.xml.internal.ws.Closeable;

import qian.web.jdutil.JDUtil;
import qian.web.model.Recipe;
import qian.web.strategy.ExtendsStrategy;
import sun.net.www.content.text.plain;

public class AdminDao {

	public AdminDao() {

	}

	/**
	 * me 返回反馈的总的数目
	 * 
	 * @return
	 * @throws SQLException
	 */

	public int getTotalFeedBackNumber() throws SQLException {
		ResultSet resultSet = null;
		ExtendsStrategy pp=null;
		String sql = "select count(*) from feedback";
		int NUM = 0;
		try {
			 pp=new ExtendsStrategy(sql);
			 resultSet =pp.allConnection(); 
			while (resultSet.next()) {
				NUM = resultSet.getInt(1);
			}

		} catch (Exception e) {

		} finally {
	       pp.allClose();
		}
		System.out.println("ok1");
		return NUM;
	}

	/**
	 * me 返回反馈的信息
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Recipe> getTotalFeedBackMessage() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		String sql = "select * from feedback ";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Recipe recipe = new Recipe();
				recipe.setAccountName(resultSet.getString("accountNumber"));
				recipe.setContent(resultSet.getString("content"));
				recipe.setAllID(resultSet.getInt("feedBackId"));
				recipes.add(recipe);

			}
		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}

		return recipes;
	}

	/**
	 * me 删除反馈
	 * 
	 * @param id
	 * @throws SQLException
	 */
	public void deleteFeedBack(int id) throws SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "delete from feedback where feedBackId=?";

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();

		} catch (Exception e) {

		} finally {
			JDUtil.close(null, statement, connection);
		}
	}

	/**
	 * me 返回评论的总的数目
	 * 
	 * @return
	 * @throws SQLException
	 */

	public int getTotalComentNumber() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "select count(*) from comment";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				NUM = resultSet.getInt(1);
			}

		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}
		System.out.println("ok1");
		return NUM;
	}

	/**
	 * me 
	 * 返回评论的信息
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Recipe> getTotalCommnetMessage() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		String sql = "select * from comment as c,all_recipe as a where c.allId=a.allId ";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Recipe recipe = new Recipe();
				recipe.setAccountName(resultSet.getString("accountNumber"));
				recipe.setContent(resultSet.getString("content"));
				recipe.setAllID(resultSet.getInt("commentId"));
				recipe.setRecipeName(resultSet.getString("a.recipeName"));
				recipes.add(recipe);

			}
		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}

		return recipes;
	}

	/**
	 * me 
	 * 删除评论
	 * @param id
	 * @throws SQLException
	 */
	public void deleteComment(int id) throws SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "delete from comment where CommentId=?";

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();

		} catch (Exception e) {

		} finally {
			JDUtil.close(null, statement, connection);
		}
	}
	
	/**me
	 * 返回用户数目
	 * @return
	 * @throws SQLException
	 */
	public int getTotalUserNumber() throws SQLException {
	    int NUM=0;
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		String sql="select count(*) from register";
		try {
			connection=(Connection) JDUtil.getConnetion();
			statement=(PreparedStatement) connection.prepareStatement(sql);
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				NUM=resultSet.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDUtil.close(resultSet, statement, connection);
		}
		
		return NUM;
	}
	
	
	/**
	 * me 
	 * 返回用户的信息
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Recipe> getTotalUserMessage() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		String sql = "select * from register ";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Recipe recipe = new Recipe();
				recipe.setAccountName(resultSet.getString("accountNumber"));
				recipe.setSex(resultSet.getString("sex"));
				recipe.setPhoneNumber(resultSet.getString("phoneNumber"));
				recipe.setEmail(resultSet.getString("email"));
				recipe.setAddress(resultSet.getString("address"));
				recipes.add(recipe);

			}
		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}

		return recipes;
	}

	/**
	 * me 
	 * 删除用户
	 * @param id
	 * @throws SQLException
	 */
	public void deleteUser(String id) throws SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "delete from register where accountNumber=?";

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();

		} catch (Exception e) {

		} finally {
			JDUtil.close(null, statement, connection);
		}
	}
	
	
	/**me
	 * 返回管理员数目
	 * @return
	 * @throws SQLException
	 */
	public int getTotalAdminNumber() throws SQLException {
	    int NUM=0;
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		String sql="select count(*) from admin";
		try {
			connection=(Connection) JDUtil.getConnetion();
			statement=(PreparedStatement) connection.prepareStatement(sql);
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				NUM=resultSet.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDUtil.close(resultSet, statement, connection);
		}
		
		return NUM;
	}
	
	
	/**
	 * me 
	 * 返回管理员的信息
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Recipe> getTotalAdminMessage() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		String sql = "select * from admin ";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Recipe recipe = new Recipe();
				recipe.setAccountName(resultSet.getString("adminName"));
				recipe.setSex(resultSet.getString("sex"));
				recipe.setPhoneNumber(resultSet.getString("phoneNumber"));
				recipe.setEmail(resultSet.getString("email"));
				recipe.setEnjionTime(resultSet.getString("enjoinTime"));
				recipes.add(recipe);

			}
		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}
		return recipes;
	}

	/**
	 * me 
	 * 删除管理员
	 * @param id
	 * @throws SQLException
	 */
	public void deleteAdmin(String id) throws SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "delete from admin where adminName=?";

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();

		} catch (Exception e) {

		} finally {
			JDUtil.close(null, statement, connection);
		}
	}
	
	/**me
	 * 返回all_recipe菜谱的数目
	 * @return
	 * @throws SQLException
	 */
	public int getTotalAllRecipeNumber() throws SQLException {
	    int NUM=0;
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet resultSet=null;
		String sql="select count(*) from all_recipe";
		try {
			connection=(Connection) JDUtil.getConnetion();
			statement=(PreparedStatement) connection.prepareStatement(sql);
			resultSet=statement.executeQuery();
			while(resultSet.next()) {
				NUM=resultSet.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDUtil.close(resultSet, statement, connection);
		}
		
		return NUM;
	}
	
	
	/**
	 * me 
	 * 返回all_recipe菜谱的信息
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Recipe> getTotalAllRecipeMessage() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		ArrayList<Recipe> recipes = new ArrayList<Recipe>();
		String sql = "select * from all_recipe ";
		int NUM = 0;

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Recipe recipe = new Recipe();
				recipe.setAllID(resultSet.getInt("allID"));
				recipe.setDescription(resultSet.getString("description"));
				recipe.setMainIngredient(resultSet.getString("mainIngredient"));
				recipe.setFlavour(resultSet.getString("flavour"));
				recipe.setStep(resultSet.getString("step"));
				recipe.setRecipeName(resultSet.getString("recipeName"));
				recipes.add(recipe);

			}
		} catch (Exception e) {

		} finally {
			JDUtil.close(resultSet, statement, connection);
		}
		return recipes;
	}

	/**
	 * me 
	 * 删除all_recipe的菜谱
	 * @param id
	 * @throws SQLException
	 */
	public void deleteAllRecipe(String id) throws SQLException {

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "delete from all_recipe where allID=?";

		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, id);
			statement.executeUpdate();

		} catch (Exception e) {

		} finally {
			JDUtil.close(null, statement, connection);
		}
	}
	
	
	
}// 总的括号
