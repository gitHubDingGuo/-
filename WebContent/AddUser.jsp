<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
     String error1=(String)request.getAttribute("error");
     
     if(error1!=null)
      out.print(error1);
     String error=(String)request.getAttribute("exiterror");
     
     if(error!=null)
      out.print(error);
%>

<form action="AddUser" method="post">
      <span style="margin-left:555px">名字:</span><input type="text" name="username" />
      <br>
      <br>
      <span style="margin-left:555px">密码:</span><input type="password" name="password" />
       <br>
       <br>
      <input  style="margin-left:590px;background-color: yellow;width:150px;height: 20px" type="submit" value="登录"/>
</form>
</body>
</html>