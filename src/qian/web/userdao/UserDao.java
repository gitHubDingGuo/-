package qian.web.userdao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.org.apache.regexp.internal.recompile;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import qian.web.jdutil.JDUtil;
import qian.web.model.Entity;
import qian.web.model.Recipe;

public class UserDao {

	public UserDao() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 判断是否已经注册过的用户
	 * 
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 * @throws SQLException
	 */
	public boolean isExsit(String name) throws Exception, SQLException {// 注册时候用户名的判断
		Connection connection=null;
		PreparedStatement statement = null;
		ResultSet result = null;
		String sql = "select * from register where accountNumber=?";
		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, name);
			result = statement.executeQuery();
			if (result.next())
				return true;
		} catch (SQLException e) {

			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDUtil.close(result, statement, connection);
		}
		return false;
	}

	/**
	 * 登录时候判断该用户的注册信息是否存在数据库
	 * 
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 * @throws SQLException
	 */
	public int allExsit(String name, String password) throws Exception, SQLException {
		Connection connection = (Connection) JDUtil.getConnetion();
		PreparedStatement statement = null;
		ResultSet result = null;
		String sql = "select * from register where accountNumber=? and password=?";
		try {
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);
			result = statement.executeQuery();
			if (result.next())
				return 1;
		} catch (SQLException e) {

			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDUtil.close(result, statement, connection);
		}
		return 0;
	}

	/**
	 * 判断该管理员的登录信息是否存在数据库
	 * 
	 * @param name
	 * @param password
	 * @return
	 * @throws Exception
	 * @throws SQLException
	 */
	public int adminExsit(String name, String password) throws Exception, SQLException {// 注册时候用户名的判断
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet result = null;
		/* System.out.println(name+"  "+password); */
		String sql = "select * from admin where adminName=? and adminPassword=?";
		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);
			result = statement.executeQuery();
			if (result.next())
				return 1;

		} catch (SQLException e) {

			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDUtil.close(result, statement, connection);
		}
		return 0;
	}

	/**
	 * 保存注册的用户信息
	 * 
	 * @param name
	 * @param password
	 * @throws ReflectiveOperationException
	 * @throws SQLException
	 */

	public void save(String name, String password) throws ReflectiveOperationException, SQLException {
		Connection connection = (Connection) JDUtil.getConnetion();
		PreparedStatement statement = null;
		String sql = "insert into register(accountNumber,password) values(?,?)";
		System.out.println(name + "   " + password);
		try {
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setString(1, name);
			statement.setString(2, password);
			statement.executeUpdate();
		} catch (SQLException e) {

			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDUtil.close(null, statement, connection);
		}

	}

	/**
	 * 保存查询到所有的用户信息
	 * 
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<Entity> getInstance() throws SQLException {
		ArrayList<Entity> users = new ArrayList<Entity>();
		PreparedStatement statement = null;
		ResultSet result = null;
		Connection connection = null;
		String sql = "select * from register";
		try {
			connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				Entity user = new Entity();
				user.setId(result.getInt("id"));
				user.setName(result.getString("accountNumber"));
				user.setPassword(result.getString("password"));
				user.setStatues(result.getInt("status"));
				users.add(user);
			}
		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
		} finally {
			JDUtil.close(result, statement, connection);
		}
		return users;

	}

	/**
	 * 修改用户的信息
	 * 
	 * @param id
	 * @return
	 */
	public Entity searchUser(String id) {
		Entity user = new Entity();
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String sql = "select * from register where id=?";
		try {
			Connection connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, Integer.parseInt(id));
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				user.setId(resultSet.getInt("id"));
				user.setName(resultSet.getString("accountNumber"));
				user.setPassword(resultSet.getString("password"));
				user.setStatues(resultSet.getInt("status"));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return user;
	}

	/**
	 * 保存修改的信息
	 * 
	 * @param id
	 * @param name
	 * @param password
	 */
	public void save(int id, String name, String password) {
		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String update = "update register set accountNumber=?,password=? where id=?";
		try {
			Connection connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(update);
			statement.setString(1, name);
			statement.setString(2, password);
			statement.setInt(3, id);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public void deleteUser(int id) {

		PreparedStatement statement = null;
		ResultSet resultSet = null;
		String delete = "delete from register where id=?";
		try {
			Connection connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(delete);
			statement.setInt(1, id);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public int getTotalPage() {
		int num = 0;
		PreparedStatement statement = null;
		ResultSet result = null;
		String sql = "select count(*) from register";
		try {
			Connection connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			result = statement.executeQuery();
			while (result.next()) {
				num = result.getInt(1);
			}
		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
		}
		return num;
	}

	public ArrayList<Entity> searchUserPage(int start, int end) {
		ArrayList<Entity> users = new ArrayList<Entity>();
		PreparedStatement statement = null;
		ResultSet result = null;
		String sql = "select * from register limit ?,?";
		try {
			Connection connection = (Connection) JDUtil.getConnetion();
			statement = (PreparedStatement) connection.prepareStatement(sql);
			statement.setInt(1, start);
			statement.setInt(2, end);
			result = statement.executeQuery();
			while (result.next()) {
				Entity user = new Entity();
				user.setId(result.getInt("id"));
				user.setName(result.getString("accountNumber"));
				user.setPassword(result.getString("password"));
				user.setStatues(result.getInt("status"));
				users.add(user);
			}
		} catch (Exception e) {

			// TODO: handle exception
			e.printStackTrace();
		}
		return users;
	}

	/**
	 * 通过登录者的名字获取其id
	 * 
	 * @param name
	 * @return
	 * @throws ReflectiveOperationException
	 * @throws SQLException
	 */

	public int getId(String name) throws ReflectiveOperationException, SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet rs = null;
		int id = 0;
		String sql = "select id from register where accountNumber=?";
		try {
			connection = (Connection) JDUtil.getConnetion();
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.setString(1, name);
			rs = preparedStatement.executeQuery();
			while (rs.next()) {
				id = rs.getInt("id");

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return id;

	}

	/**
	 * 更新register表的图片的名字
	 * 
	 * @param id
	 * @param newFileName
	 */
	public void updatePictuer(int id, String newFileName) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "update register set fileName=? where id=? ";
		try {
			con = (Connection) JDUtil.getConnetion();
			st = (PreparedStatement) con.prepareStatement(sql);
			st.setString(1, newFileName);
			st.setInt(2, id);
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 返回图片的名称。
	 * 
	 * 
	 * @param id
	 * @return
	 */

	public String getPName(int id) {

		Connection con = null;
		PreparedStatement p = null;
		ResultSet rs = null;
		String str = null;
		String sql = "select fileName from register where id=?";
		try {
			con = (Connection) JDUtil.getConnetion();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setInt(1, id);
			rs = p.executeQuery();
			while (rs.next()) {

				str = rs.getString("fileName");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;

	}

	/**
	 * 插入菜谱
	 * 
	 * @param accountName
	 * @param recipeName
	 * @param newFileName
	 * @param decription
	 * @param mainIgredient
	 * @param flavour
	 * @param step
	 * @param knack
	 */
	public void insertRecipe(String accountName, String recipeName, String newFileName, String decription,
			String mainIgredient, String flavour, String step, String knack) {
		Connection con;
		PreparedStatement st;
		ResultSet rs;
		String sql = "insert into menu_message(accountName,menuName,pictureName,description,mainIngredient,flavour,step,knack) value(?,?,?,?,?,?,?,?) ";
		try {
			con = (Connection) JDUtil.getConnetion();
			st = (PreparedStatement) con.prepareStatement(sql);
			st.setString(1, accountName);
			st.setString(2, recipeName);
			st.setString(3, newFileName);
			st.setString(4, decription);
			st.setString(5, mainIgredient);
			st.setString(6, flavour);
			st.setString(7, step);
			st.setString(8, knack);
			st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 返回添加菜谱的所有图片,以便查看所有图片的显示
	 * 
	 * @param accountName
	 * @return
	 */

	public ArrayList<Recipe> getRecipe(String accountName) {
		ArrayList<Recipe> list = new ArrayList<>();
		Connection con;
		PreparedStatement st;
		ResultSet rs;
		String sql = "select * from menu_message where accountName=?";
		try {
			con = (Connection) JDUtil.getConnetion();
			st = (PreparedStatement) con.prepareStatement(sql);
			st.setString(1, accountName);
			rs = st.executeQuery();
			while (rs.next()) {
				Recipe recipe = new Recipe();
				recipe.setPictureName(rs.getString("pictureName"));
				recipe.setMenuName(rs.getString("menuName"));
				recipe.setAccountName(rs.getString("accountName"));
				recipe.setMainIngredient(rs.getString("mainIngredient"));
				list.add(recipe);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 移除菜谱图片
	 * 
	 * @param pictureName
	 */
	public void deletePicture(String pictureName) {
		Connection con;
		PreparedStatement p;
		ResultSet rs;
		String sql = "delete from menu_message where pictureName=?";
		try {
			con = (Connection) JDUtil.getConnetion();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setString(1, pictureName);
			p.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * 保存用户信息设置
	 * 
	 * @param accountName
	 * @param name
	 * @param sex
	 * @param email
	 * @param address
	 * @param phoneNumber
	 * @param newPictureName
	 * @throws SQLException
	 */

	public void saveAccountSet(String accountName, String name, String sex, String email, String address,
			String phoneNumber, String newPictureName) throws SQLException {
		Connection con = null;
		PreparedStatement p = null;
		ResultSet rs;
		String sql = "update register set name=?,sex=?,email=?,address=?,phoneNumber=?,fileName=? where accountNumber=?";
		try {
			con = (Connection) JDUtil.getConnetion();
			p = (PreparedStatement) con.prepareStatement(sql);
			p.setString(1, name);
			p.setString(2, sex);
			p.setString(3, email);
			p.setString(4, address);
			p.setString(5, phoneNumber);
			p.setString(6, newPictureName);
			p.setString(7, accountName);
			p.executeUpdate();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			JDUtil.close(null, p, con);
		}

	}

	/**
	 * 获取旧密码
	 * 
	 * @param accountName
	 * @return
	 * @throws SQLException
	 */

	public String getUserOldPassword(String accountName) throws SQLException {
		Connection c = null;
		PreparedStatement s = null;
		ResultSet r = null;
		String oldPassword = null;
		String sql = "select password from register where accountNumber=?";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setString(1, accountName);
			r = s.executeQuery();
			while (r.next()) {
				oldPassword = r.getString("password");
			}
		} catch (Exception e) {

			e.printStackTrace();
		} finally {
			JDUtil.close(r, s, c);
		}
		return oldPassword;
	}

	/**
	 * 更新用户密码
	 * 
	 * @param password
	 * @param password2
	 * @throws SQLException
	 */
	public void updateUserPassword(String accountName, String password) throws SQLException {
		Connection c = null;
		PreparedStatement s = null;
		ResultSet r = null;
		String sql = "update register set password=? where accountNumber=?";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setString(1, password);
			s.setString(2, accountName);
			s.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(null, s, c);
		}

	}

	/**
	 * 为修改信息之前获取该用户的信息
	 * 
	 * @param accountName
	 * @return
	 * @throws SQLException
	 */

	public Entity getPersonlMessage(String accountName) throws SQLException {
		Connection c = null;
		PreparedStatement s = null;
		ResultSet r = null;
		Entity entity = new Entity();
		String sql = "select * from register where accountNumber=?";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setString(1, accountName);
			r = s.executeQuery();
			while (r.next()) {
				entity.setSex(r.getString("sex"));
				entity.setPhoneNumber(r.getString("phoneNumber"));
				entity.setEmail(r.getString("email"));
				entity.setAdderss(r.getString("address"));
				entity.setUserName(r.getString("name"));
				entity.setFileName(r.getString("fileName"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(r, s, c);
		}
		return entity;

	}

	/**
	 * 获取所有的菜谱信息
	 * 
	 * @param accountName
	 * @return
	 * @throws SQLException
	 */

	public Recipe getAllpicture(int id) throws SQLException {
		Connection connection = null;
		PreparedStatement pStatement = null;
		ResultSet rs = null;

		Recipe recipe = new Recipe();

		String sql = "select * from all_recipe where allId=?";
		try {
			connection = (Connection) JDUtil.getConnetion();
			pStatement = (PreparedStatement) connection.prepareStatement(sql);
			pStatement.setInt(1, id);
			rs = pStatement.executeQuery();
			while (rs.next()) {
				recipe.setPictureName(rs.getString("pictureName"));
				recipe.setDescription(rs.getString("description"));
				recipe.setMainIngredient(rs.getString("mainIngredient"));
				recipe.setFlavour(rs.getString("flavour"));
				recipe.setStep(rs.getString("step"));
				recipe.setAllID(rs.getInt("allId"));
				recipe.setRecipeName(rs.getString("recipeName"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(rs, pStatement, connection);
		}
		return recipe;
	}

	/**
	 * 获取具体菜谱是那个人评论的
	 * 
	 * @param allId
	 * @return
	 * @throws SQLException
	 */

	public ArrayList<Recipe> getComment(int allId) throws SQLException {
		ArrayList<Recipe> list = null;
		Connection c = null;
		PreparedStatement s = null;
		ResultSet r = null;
		String sql = "select * from comment where allId=? ";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setInt(1, allId);
			r = s.executeQuery();
			list = new ArrayList<Recipe>();
			while (r.next()) {
				Recipe entity = new Recipe();
				entity.setContent(r.getString("content"));
				entity.setAccountName(r.getString("accountNumber"));
				list.add(entity);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(r, s, c);
		}

		return list;

	}

	/**
	 * 保存具体菜谱是那个人评论的
	 * 
	 * @param comment
	 * @param accountName
	 * @param allId
	 * @throws SQLException
	 */

	public void saveComment(String comment, String accountName, int allId) throws SQLException {
		Connection c = null;
		PreparedStatement s = null;
		String sql = "insert into comment(content,accountNumber,allId) values(?,?,?)";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setString(1, comment);
			s.setString(2, accountName);
			s.setInt(3, allId);
			s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(null, s, c);
		}

	}

	/**
	 * 保存反馈内容
	 * 
	 * @param feedBack
	 * @param accountNumber
	 * @throws SQLException
	 */
	public void saveFeedBack(String feedBack, String accountNumber) throws SQLException {

		Connection c = null;
		PreparedStatement s = null;
		String sql = "insert into feedback(content,accountNumber) values(?,?)";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setString(1, feedBack);
			s.setString(2, accountNumber);
			s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(null, s, c);
		}

	}

	/**保存用户收藏的菜谱信息
	 * 
	 * @param id
	 * @param accountNumber
	 * @throws SQLException
	 */
	public void saveMyCollection(int id, String accountNumber) throws SQLException {
		Connection c = null;
		PreparedStatement s = null;
		String sql = "insert into collection(allId,accountNumber) values(?,?)";
		try {
			c = (Connection) JDUtil.getConnetion();
			s = (PreparedStatement) c.prepareStatement(sql);
			s.setInt(1,id);
			s.setString(2,accountNumber);
			s.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(null, s, c);
		}
	}

	/**获取收藏的菜谱信息
	 * 
	 * @param accountNumber
	 * @return
	 * @throws SQLException
	 */
	
	public ArrayList<Recipe> getCollectionRecipe(String accountNumber) throws SQLException {
		Connection c=null;
		PreparedStatement s=null;
		ResultSet r=null;
		ArrayList<Recipe> recipes=new ArrayList<Recipe>();
		String sql="select * from collection as c,all_recipe as al where c.accountNumber=? and c.allId=al.allId ";
		try {
			c=(Connection) JDUtil.getConnetion();
			s=(PreparedStatement) c.prepareStatement(sql);
			s.setString(1, accountNumber);
			r=s.executeQuery();
			while(r.next()) {
				Recipe recipe=new Recipe();
				recipe.setPictureName(r.getString("al.pictureName"));
				recipe.setDescription(r.getString("al.description"));
				recipe.setAllID(r.getInt("al.allID"));
				recipes.add(recipe);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(r, s, c);
		}
		
		return recipes;
	}
	
	
	/** 删除收藏的菜谱
	 *
	 * @param allId
	 * @throws SQLException 
	 */

	public void deleteCollectionRecipe(int allId) throws SQLException {
	
		Connection c=null;
		PreparedStatement s=null;
		ResultSet r=null;
		String sql="delete from collection where allId=?";
		try {
			c=(Connection) JDUtil.getConnetion();
			s=(PreparedStatement) c.prepareStatement(sql);
			s.setInt(1,allId);
			s.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDUtil.close(null, s, c);
		}
	}

}
