<%@page import="qian.web.model.Recipe"%>
<%@page import="java.util.ArrayList"%>
<%@page import="qian.web.userdao.AdminDao"%>
<%@page import="qian.web.cookiecode.CookieCode"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="qian.web.cookiecode.CookieCode" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<%
    String name="";
    String password="";
    Cookie[] cookies=request.getCookies();//获取cookie
    if(cookies!=null) {
    	    for(Cookie c:cookies){
    	    	if("cookie_applicantName".equals(c.getName())){
    			   name=CookieCode.decodeBase64(c.getValue());
    		   }
    	    
    	    	if("cookie_applicantPassword".equals(c.getName())){
    			   password=CookieCode.decodeBase64(c.getValue());
    		   }
    	}
    }

%>
		
		
<%-- <p>${tip}</p>--%>
<p>当前在线人数:${applicationScope.online}</p> 
<div class="main">
		<div class="logo">
			<div class="logo-in">
				<div>
					<a href="index.html">

						<img src="img/index.png" />

					</a>
					<span>会员登录</span>
					<div/>

				</div>
			</div>
		</div>

		<div class="big">
			<div class="big-bg"></div>
			<div class="big-contain">
				<div class="search">
					<a href="Register.jsp">没有账号？点此注册</a>
				</div>

				<div class="big-login">
					<div class="big-login-picture left">
						<img src="http://meishixing.com/Public/index/images/login/login-bg.png" />
					</div>
					<div class="big-login-right right">
						<h2 class="big-login-head">美食菜谱网</h2>
						  
							<p style="color: red;margin-right: -90px">${requestScope.exiterror1}${requestScope.userExit}</p>
							<form  action="LoginServlet" method="post">

							<div class="box">
							            <ul class="dian">
							                    	
							                <li>
							  
							                    <br>					                  
							                  	<p>邮箱:<input  name="username" value="<%=name%>" id="UserName" type="text" placeholder="输入邮箱"  pattern="^[\w._]+@([qQ][qQ]|[gG][mM][aA][iI][lL]|163)\.[cC][oO][mM](\r\n|\r|\n)?$" required oninvalid="this.setCustomValidity('邮箱不对哦');" oninput="setCustomValidity('')" ></p>						                 
							                </li>
							
							                <li>
							            
							                 
							                   	<p>密码:<input name="password" value="<%=password%>" id="Password" type="password" placeholder="6~20位" class="" pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('6~20字母数字或下划线');" oninput="setCustomValidity('')" ></p>				
							                  
							                </li>
							                <li>
							                
							                    <div>
							                     <p style="margin-left:-165px">记住我:<input style="margin-left:5px;width: 10px;height: 10px"     checked="checked"  type="checkbox" name="remember" value="true" ></p> 
							                    </div>
							                   
							                  
							                </li>
							                
							            </ul>
							        </div>
						
						
            <input value="登录" type="submit"   class="form-login" name="name"/>
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
</body>
</html>