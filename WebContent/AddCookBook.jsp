<%@page import="qian.web.userdao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
<!--使bootstrap兼容ie8-->
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<!--使bootstrap兼容ie9-->
<title></title>
<link
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/test4.css" />
<link rel="stylesheet" type="text/css" href="css/register.css">

<style type="text/css">
.navbar-nav>li>a {
	line-height: 45px;
}

.navbar-form {
	margin-top: 20px;
}
</style>
</head>

<body style="background: #FFFFFF; height: 2000px;" onload="startTime()">

	<nav class="navbar navbar-default"
		style="background: #EEEEEE; min-height: 80px;">
		<div class="container" id="context">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header" style="min-height: 80px;">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#" style="margin-top: -15px;"><img
					src="img/index.png"></a>
			</div>


			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav" id="context">
					<script src="js/ziti.js"></script>
					<li><a href=""UserIndex.jsp"">首页 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">菜谱大全</a></li>
					<li><a href="#">食材大全</a></li>
					<li><a href="#">美食专题</a></li>
					<li><a href="#">社区广场</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">更多资讯<span class="caret"></span></a>
						<ul class="dropdown-menu" id="dropdown-menu-modify">
							<li><a href="#">美食天下</a></li>
							<li style="width: 50px;"><a href="#">美食联盟</a></li>

						</ul></li>
				</ul>

				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">关于我的<span class="caret"></span></a>
						<ul id="dropdown-menu-modify" class="dropdown-menu">
							<li><a href="CookBook.jsp">菜谱大全</a></li>
							<li><a href="MyCollection.jsp">我的收藏</a></li>
							<li><a href="Account.jsp">账号设置</a></li>
							<li><a href="FeedBack.jsp">我要反馈</a></li>
							<li><a href="Logout.jsp">我要退出</a></li>

						</ul></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="container">
			<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12">
				<!-- col-sm-10 -->

				<div style="border-bottom: 1px solid #eee; margin-top: -32px;">
					<ul class="nav navbar-nav navbar-left">
						<li><a href="CookBook.jsp">我的菜谱</a></li>
						<li>
							<p></p>
						</li>
						<li><a href="AddCookBook.jsp">发布菜谱</a></li>
					</ul>
				</div>



			</div>
			<!-- col-sm-10 -->

			<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12">
				<!-- col-sm-10 -->

				<div style="border-bottom: 1px solid #eee;">
					<ul class="nav navbar-nav navbar-left" style="margin-left: 60px;">

						<div class="container style="color:#f8f0e5">
							<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12">

								<form action="AddCookBookServlet" method="post"
									enctype="multipart/form-data">


									<div class="box" style="margin-left: -180px">
										<ul class="dian">


											<li>
												<p style="margin-left: -200px; color: blue">菜谱名称:</p> <input
												type="text" name="recipeName" placeholder="菜谱名称" required
												oninvalid="this.setCustomValidity("
												姓名不为空") oninput="setCustomValidity('')">
											</li>
											<br />
											<br />
											<li>
												<%
													int id = (int) request.getSession().getAttribute("Id");
													UserDao dao = new UserDao();
													String pName = dao.getPName(id);
													String str = "img/"+pName;
												%>
												<p style="margin-left: -200px; color: blue">菜谱图片:</p> <input
												style="margin-left: 495px" name="headShot" id="headShot"
												type="file" value="上传照片"> <br /> <br />
											</li>

											<li>
												<p style="margin-left: -200px; color: blue">菜谱描述:</p> <input
												style="height: 100px" type="text" name="decription"
												placeholder="菜谱描述" required
												oninvalid="this.setCustomValidity("
												描述不为空") oninput="setCustomValidity('')">


											</li>
											<br />
											<br />

											<li>
												<p style="margin-left: -200px; color: blue">菜谱主料:</p> <input
												style="height: 100px" type="text" name="mainIngredient"
												placeholder="菜谱主料" required
												oninvalid="this.setCustomValidity("
												主料不为空") oninput="setCustomValidity('')">


											</li>
											<br />
											<br />

											<li>
												<p style="margin-left: -200px; color: blue">菜谱辅料:</p> <input
												style="height: 100px" type="text" name="flavour"
												placeholder="菜谱辅料" required
												oninvalid="this.setCustomValidity("
												辅料不为空") oninput="setCustomValidity('')">


											</li>
											<br />
											<br />


											<li>
												<p style="margin-left: -200px; color: blue">菜谱步奏:</p> <input
												style="height: 100px" type="text" name="step"
												placeholder="菜谱步奏" required
												oninvalid="this.setCustomValidity("
												步奏不为空") oninput="setCustomValidity('')">


											</li>
											<br />
											<br />


											<li>
												<p style="margin-left: -200px; color: blue">菜谱窍门:</p> <input
												style="height: 100px" type="text" name="knack"
												placeholder="菜谱窍门" required
												oninvalid="this.setCustomValidity("
												窍门不为空") oninput="setCustomValidity('')">


											</li>
											<br />
											<br />
											<input value="确定" type="submit" class="form-login "
												id="width" />&nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
											<input id="width" type="reset" value="取消" />

										</ul>
									</div>
								</form>
							</div>
						</div>
					</ul>
				</div>
			</div><!-- col-sm-10 -->
		</div>
		
		<div class="container">	<!--关于我们 -->
			<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12"
				style="margin-top: 150px; margin-left: 5px; display: inline-block; background-color: #FFFFFF;">
				<h2
					style="font-size: 14px; font-weight: normal; line-height: 20px; position: relative; padding: 0 16px;">
					友情链接:</h2>
				<ul class="nav nav-pills navbar-nav navbar-left">
					<li><a href="#">关于我们</a></li>
					<li><a href="#">服务条款</a></li>
					<li><a href="#">加入我们</a></li>
					<li><a href="#">商家合作</a></li>
					<li><a href="#">捐助我们</a></li>
				</ul>
			</div>
		</div><!--关于我们 -->

		<div class="container"><!--条款 -->
			<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12"
				style="margin-top: -10px; margin-left: 5px; display: inline-block; background-color: #EEEEEE;">
				<h6 style="text-align: center;">Copyright 2010-2017 All Rights
					Reserved. &nbsp;&nbsp;&nbsp;湘ICP备11005707号-1</h6>
		</div>
		</div><!--条款 -->





		<img src="箭头.PNG" id="rTop" />
		<script src="js/sideOpen.js"></script>
		<script src="js/backTop.js"></script>






	</div>
	<!--总的边框-->


</body>
</html>
