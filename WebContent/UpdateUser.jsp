<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="SaveUpdateUser" method="post">
<table border="1" cellspacing="4" cellpadding="10" bgcolor="yellow">
  
    	<tr><td>id</td><td><input type="text" readonly="readonly" name="id" value="${requestScope.searchUser.id }"></td></tr>																												
        <tr><td>name</td><td><input type="text"  name="name1" value="${requestScope.searchUser.name }"></td></tr>																										
        <tr><td>password</td><td><input type="text"name="password1" value="${requestScope.searchUser.password }"></td></tr>	
        <tr><td colspan="2">
        <input type="submit" value="提交">
        <input type="reset"  value="清空">
        </td>
        </tr> 
    </table>
</form>
</body>
</html>