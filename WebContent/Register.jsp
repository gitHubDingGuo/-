<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/login.css">
<title></title>
</head>
<body>
	<div class="main">
		<div class="logo">
			<div class="logo-in">
				<div>
					<a href="index.html">

						<img src="img/index.png" />

					</a>
					<span>会员注册</span>
					<div/>

				</div>
			</div>
		</div>

		<div class="big">
			<div class="big-bg"></div>
			<div class="big-contain">
				<div class="search">
					<a href="Login.jsp">有账号？点此登录</a>
				</div>

				<div class="big-login">
					<div class="big-login-picture left">
						<img src="http://meishixing.com/Public/index/images/login/login-bg.png" />
					</div>
					<div class="big-login-right right">
						<h2 class="big-login-head">美食菜谱网</h2>
						
							
							<form onsubmit="return message()" action="RegisterServlet" method="post">

							<div class="box">
							            <ul class="dian">
							                    	
							                <li>
							                    <label id="msg" style="color: red"> ${requestScope.exiterror} </label>
							                    <br>					                  
							                  	<p>邮箱:<input  name="username" id="UserName" type="text" placeholder="输入邮箱"  pattern="^[\w._]+@([qQ][qQ]|[gG][mM][aA][iI][lL]|163)\.[cC][oO][mM](\r\n|\r|\n)?$" required oninvalid="this.setCustomValidity('邮箱不对哦');" oninput="setCustomValidity('')" onblur="cheeckName(this)"></p>						                 
							                </li>
							
							                <li>
							            
	
							                   	<p>密码:<input name="password" id="Password" type="password" placeholder="6~20位" class="" pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('6~20字母数字或下划线');" oninput="setCustomValidity('')" onchange="checkPassword()"></p>				
							                  
							                </li>
							                <li>
							                
							           
							                   <p>确认:<input name="repassword" id="Repassword" type="password" placeholder="确认密码" class="" required onchange="checkPassword()"></p>				
							                  
							                </li>
							                
							            </ul>
							        </div>
						
						
            <input value="注册" type="submit"   class="form-login" name="name"/>
						</form>
						
						<div class="block"></div>
						<p><a class="forget-mi" href="find.html">忘记密码？</a></p>
				      <!--  <div class="three">
				        	
				        </div>
						 -->
					</div>
               <div class="last"><p>Copyright 2010-2017 All Rights Reserved. &nbsp;&nbsp;&nbsp;辽ICP备11005707号-1</p></div>
				</div>
			</div>
		</div>
     	<script src="js/checkPassword.js"></script><!-- 密码是否一致 -->
     	<script src="js/checkEmail.js"></script><!-- ajax判断邮箱是否已经存在 -->
     <!-- 	<script src="js/checkName.js"></script>强行注册后的提示 -->
</body>
</html>