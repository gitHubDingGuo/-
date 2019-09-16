<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5shiv.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link href="static/h-ui/css/H-ui.min.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/H-ui.login.css" rel="stylesheet" type="text/css" />
<link href="static/h-ui.admin/css/style.css" rel="stylesheet" type="text/css" />
<link href="Hui-iconfont/1.0.8/iconfont.css" rel="stylesheet" type="text/css" />
<link href="css/adminLogin.css" rel="stylesheet" type="text/css" />
<!--[if IE 6]>
<script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
<script>DD_belatedPNG.fix('*');</script>
<![endif]-->
<title>后台登录 - H-ui.admin v3.1</title>
<meta name="keywords" content="H-ui.admin v3.1,H-ui网站后台模版,后台模版下载,后台管理系统模版,HTML后台模版下载">
<meta name="description" content="H-ui.admin v3.1，是一款由国人开发的轻量级扁平化网站后台模板，完全免费开源的网站后台管理系统模版，适合中小型CMS后台系统。">
</head>
<body>
<input type="hidden" id="TenantId" name="TenantId" value="" />
<div  style="position: absolute;left: 0;right: 0;width: 100%;z-index: 99;top: 0;height: 60px;">
	<span style="font-size: 28px;color:#5eb95e">后台管理</span>
</div>
<div class="loginWraper">
  <div id="loginform" class="loginBox">
    <form class="form form-horizontal" action="AdminLoginServlet" method="post">
    
      <div class="row cl">
       
        <div class="formControls col-xs-8">
     <span style="color: red;margin-left: 250px">${requestScope.exiterror2}${requestScope.adminExit }</span>
        </div>
      </div>
    
    
    
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60d;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="adminName" type="text" placeholder="账户" class="input-text size-L"     pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('账号不对哦');" oninput="setCustomValidity('')" >
        </div>
      </div>
      
      <div class="row cl">
        <label class="form-label col-xs-3"><i class="Hui-iconfont">&#xe60e;</i></label>
        <div class="formControls col-xs-8">
          <input id="" name="adminPassword" type="password" placeholder="密码" class="input-text size-L" pattern="^[a-zA-Z0-9]\w{5,19}$" required oninvalid="this.setCustomValidity('6~20字母数字或下划线');" oninput="setCustomValidity('')">
        </div>
      </div>
      
      <div class="row cl">
        <div class="formControls col-xs-8 col-xs-offset-3">
          <button type="submit" class="btn btn-success radius size-L">&nbsp 登&nbsp &nbsp &nbsp &nbsp 录&nbsp </button>
					&nbsp &nbsp &nbsp &nbsp &nbsp 
          <button type="reset" class="btn btn-default radius size-L">&nbsp 取&nbsp &nbsp &nbsp &nbsp 消&nbsp </button>
        </div>
      </div>
    </form>
  </div>
</div>
<div class="footer">Copyright 舌尖的美食 by H-ui.admin v3.1</div>
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>

</body>
</html>