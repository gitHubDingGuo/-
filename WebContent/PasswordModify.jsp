<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title></title>
		  <link rel="stylesheet" type="text/css" href="css/register.css">
			<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
		
				<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
				<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
		
				<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
				<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
				<link rel="stylesheet" type="text/css" href="css/test4.css" />
		
				<style type="text/css">
					.navbar-nav>li>a {
						line-height: 45px;
					}
		
					.navbar-form {
						margin-top: 20px;
					}
				</style>

	</head>
	<body>
		<nav class="navbar navbar-default" style="background: #FFFFFF;min-height: 80px;">
					<div class="container" id="context">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header" style="min-height: 80px;">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
							 aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
							<a class="navbar-brand" href="#"><img src="img/index.png"></a>
						</div>
		
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav" id="context">
								
								<li><a href="PasswordModify.jsp" id="zi">密码修改 <span class="sr-only">(current)</span></a></li>
								
								
							</ul>
		
							
						</div><!-- /.navbar-collapse -->
					</div><!-- /.container-fluid -->
				</nav>
				
				
				
				
				<div class="container"><!-- 有账号？点此登录 -->
					<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12">
						<div class="search">
							<a href="UserIndex.jsp">首页</a>
						
						</div>
						
					</div>	
				</div><!-- 有账号？点此登录 -->
				
				
				
				<div class="container style="color:#f8f0e5">
					<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12" >
						
						<form action="PasswordModifyServelet" method="post"><!-- onsubmit="return checkForm();" -->
						
									<div class="box">
													            <ul class="dian">
													          
													                <li>
													                    <p style="color: red"> ${requestScope.passwordError}</p>
													                </li>
													                <li>					                  
													                    <p>旧的密码:<input name="oldPassword" id="UserName" type="text" placeholder="输入旧密码"  pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('格式不对哦');" oninput="setCustomValidity('')"></p>							                 
													                </li>
													
													                <li>
													            
													                 
													                   	<p>新的密码:<input name="newPassword1" id="Password" type="password" placeholder="6~20位" class="" pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('6~20字母数字或下划线');" oninput="setCustomValidity('')" onchange="checkPassword()"></p>				
													                  
													                </li>
													                <li>
													                
													           
													                   <p>确认密码:<input name="newPassword2" id="Repassword" type="password" placeholder="确认密码" class="" required onchange="checkPassword()"></p>				
													                  
													                </li>
																	
																	<li>
																	 <p>提交请求:<input value="提交" type="submit"  class="form-login "  name="name"/></p>

													                </li>
													            </ul>
													        </div>				
													
						                                 
                     </form>
						
						
					</div>	
				</div>
				
									        <div class="container"><!--关于我们 -->
													
													
													<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12" style="margin-top: 150px;margin-left: -45px; display: inline-block;background-color: #FFFFFF; ">
														<h2 style="font-size: 14px;font-weight: normal;line-height: 20px;position: relative;padding: 0 16px;"> 友情链接: </h2>
				
									
														
															<ul class="nav nav-pills navbar-nav navbar-left">
															
																					<li><a href="#">关于我们</a></li>
																					<li><a href="#">服务条款</a></li>
																					<li><a href="#">加入我们</a></li>
																					<li><a href="#">商家合作</a></li>
																					<li><a href="#">捐助我们</a></li>
																					
									
														</ul>
													
													</div>     
														
														
												</div><!--关于我们 -->
									
									      <div class="container" ><!--条款 -->
									      									
									      									
									      <div class="col-sm-12 col-xm-12 col-md-12 col-lg-12" style="margin-top: -10px;margin-left: -45px; display: inline-block;background-color: #EEEEEE; ">
									 
									      					<h6 style="text-align: center;">Copyright 2010-2017 All Rights Reserved. &nbsp;&nbsp;&nbsp;湘ICP备11005707号-1</h6>
									  
									      									
									     </div>     
									      										
									      										
									    </div><!--条款 -->
				
				<script type="text/javascript">
						function checkPassword() {
							var pass1 = document.getElementById("Password");
							var pass2 = document.getElementById("Repassword");
					
							if (pass1.value != pass2.value)
								pass2.setCustomValidity("两次输入的密码不匹配");
							else
								pass2.setCustomValidity("");
						}
				
					
					</script>
		
		
	</body>
</html>