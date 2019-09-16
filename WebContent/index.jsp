<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,Chrome=1" />
		<!--使bootstrap兼容ie8-->
		<meta http-equiv="X-UA-Compatible" content="IE=9" />
		<!--使bootstrap兼容ie9-->

		<title></title>
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
<body style="background: #EEEEEE;height: 2000px;" onload="startTime()">

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
					<a class="navbar-brand" href="#" style="margin-top: -15px;"><img src="img/index.png"></a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav" id="context">
						<script src="js/ziti.js"></script>
						<li><a href="index.jsp">首页 <span class="sr-only">(current)</span></a></li>
						<li><a href="#">菜谱大全</a></li>
						<li><a href="#">食材大全</a></li>
						<li><a href="#">美食专题</a></li>
						<li><a href="#">社区广场</a></li>
						<li class="dropdown">
							<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">更多资讯<span
								 class="caret"></span></a>
							<ul class="dropdown-menu" style="width: 20px;">
								<li><a href="#">美食天下</a></li>
								<li style="width: 50px;"><a href="#">美食联盟</a></li>

							</ul>
						</li>
					</ul>

					<ul class="nav navbar-nav navbar-right">

						<li><a href="Login.jsp">登录</a></li>
						<li>
							<p> </p>
						</li>
						<li><a href="Register.jsp">注册</a></li>
					</ul>
				</div><!-- /.navbar-collapse -->
			</div><!-- /.container-fluid -->
		</nav>

		<div class="container">


			<div class="col-sm-12 col-xm-12 col-md-12 col-lg-12" id="carouselinner">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
						<li data-target="#carousel-example-generic" data-slide-to="1"></li>
						<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img  style="width: 1200px;height: 410px;" src="http://pic11.photophoto.cn/20090611/0042040397373829_b.jpg" alt="...">
							<div class="carousel-caption">
								...
							</div>
						</div>
						<div class="item">
							<img style="width: 1200px;height: 410px;" src="http://pic10.photophoto.cn/20090325/0033034316364757_b.jpg" alt="...">
							<div class="carousel-caption">
								...
							</div>
						</div>
					
					<div class="item">
					<img style="width: 1200px;height: 410px;" src="http://pic24.photophoto.cn/20120717/0042040361874769_b.jpg" alt="...">
					<div class="carousel-caption">
						...
					</div>
					</div>
					
					</div>

					<!-- Controls -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>


				</div>

			</div> <!-- col-sm-12 -->


			<div class="container"><!--精品菜谱 -->
				<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4" style="margin-top: 58.8px; ">
					<h2 style="font-size: 24px;font-weight: normal;line-height: 50px;position: relative;padding: 0 16px;">精品菜谱</h2>
				</div>
				
				<div class="col-sm-8 col-xm-8 col-md-8 col-lg-8" style="margin-top: 50px; display: inline-block; ">
					<h2 style="font-size: 14px;font-weight: normal;line-height: 60px;position: relative;padding: 0 16px;">
						
						<ul class="nav nav-pills navbar-nav navbar-right">
						
												<li><a href="#">本月</a></li>
												<li><a href="#">本周</a></li>
												<li><a href="#">今日</a></li>

											</ul>
						
					</h2>
				</div>       
			</div><!-- 精品菜谱 -->




			<div class="container"><!--精品菜谱图片-->


				<div class="row row1" >
		<!-- 	 <div class="col-sm-4">
				<img src="http://img95.699pic.com/photo/50021/5742.jpg_wh300.jpg" class="img-responsive" >
			<p class="hideP">
				<button class="btn btn-primary">查看详情</button>
				<span>图片文字说明xxxxx</span>
			</p>
			</div> -->
			
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50082/6444.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button> 
				<span>香煎牛排</span>
			</p>
			</div>
			
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50082/6444.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>香煎牛排</span>
			</p>
			</div>
			
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50014/7653.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>香菜鱼饼</span>
			</p>
			</div>
				
		</div>


			 <div class="row row2" >
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50047/3228.jpg_wh300.jpg" class="img-responsive" >
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>五味杂陈</span>
			</p>
			</div>
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50014/7653.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>酸辣黄鱼</span>
			</p>
			</div>
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50047/3228.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>四季拼盘</span>
			</p>
			</div>
		</div> 

			 <div class="row row3" >
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50056/6294.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span>御泉柠檬</span>
			</p>
			</div>
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/50042/0644.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span >樱桃橙檬</span>
			</p>
			</div>
			<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
				<img src="http://img95.699pic.com/photo/00040/4625.jpg_wh300.jpg" class="img-responsive">
			<p>
				<button class="btn btn-primary">查看详情</button>
				<span >果物纷纷</span>
			</p>
			</div>
		</div> 

			</div><!--精品菜谱图片-->

    <div class="container"><!--时令蔬菜 -->
    				<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4" style="margin-top: 58.8px; ">
    					<h2 style="font-size: 24px;font-weight: normal;line-height: 50px;position: relative;padding: 0 16px;">时令蔬菜</h2>
    				</div>
    				
    				<div class="col-sm-8 col-xm-8 col-md-8 col-lg-8" style="margin-top: 50px; display: inline-block; ">
    					<h2 style="font-size: 14px;font-weight: normal;line-height: 60px;position: relative;padding: 0 16px;">
    						
    						<ul class="nav nav-pills navbar-nav navbar-right">
    						
    												<li><a href="#">生鲜</a></li>
    												<li><a href="#">谷物</a></li>
    												<li><a href="#">蔬菜</a></li>
    												<li><a href="#">水果</a></li>
    
    											</ul>
    						
    					</h2>
    				</div> 
									
									
    			</div><!--时令蔬菜 -->
					
					
					<div class="container"><!--时令蔬菜图片-->
               	<div class="row row2" >
               	<div class="col-sm-2 col-xm-2 col-md-2 col-lg-2">
               		<img src="https://i3.meishichina.com/static/shicai/nangua.jpg" class="img-responsive">
               	<p>
               	
               		<span>金黄的我______金黄一生</span>
               	</p>
               	</div>
								
               	<div class="col-sm-2 col-xm-2 col-md-4 col-lg-2">
               		<img src="https://i3.meishichina.com/static/shicai/niurou.jpg" class="img-responsive">
               	<p>
               		
               		<span >里根之牛______乡里相投</span>
               	</p>
               	</div>
								
               	<div class="col-sm-2 col-xm-2 col-md-2 col-lg-2">
               		<img src="https://i3.meishichina.com/static/shicai/xia.jpg" class="img-responsive">
               	<p>
               		
               		<span>虾中之宝______宝中之虾</span>
               	</p>
               	</div>
								
								<div class="col-sm-2 col-xm-2 col-md-2 col-lg-2">
									<img src="https://i3.meishichina.com/static/shicai/banli.jpg" class="img-responsive">
								<p>
								
									<span>栗栗在目______甜糯在心</span>
								</p>
								</div>
								<div class="col-sm-2 col-xm-2 col-md-2 col-lg-2">
									<img src="https://i3.meishichina.com/static/shicai/shanzha.jpg" class="img-responsive">
								<p>
								
									<span>酸甜爽口______老少咸宜</span>
								</p>
								</div>
								
								<div class="col-sm-2 col-xm-2 col-md-2 col-lg-2">
									<img src="https://i3.meishichina.com/static/shicai/li.png" class="img-responsive">
								<p>
									
									<span>甜甜爽口______溺化人心</span>
								</p>
								</div>
               </div>
        </div><!--时令蔬菜图片-->
				
		
		<div class="container"><!--美食专题 -->
						<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4" style="margin-top: 58.8px;">
							<h2 style="font-size: 24px;font-weight: normal;line-height: 50px;position: relative;padding: 0 16px;"> 美食专题 </h2>
						</div>
						
						<div class="col-sm-8 col-xm-8 col-md-8 col-lg-8" style="margin-top: 50px; display: inline-block; ">
							<h2 style="font-size: 14px;font-weight: normal;line-height: 60px;position: relative;padding: 0 16px;">
								
								<ul class="nav nav-pills navbar-nav navbar-right">
								
														<li><a href="#">更多</a></li>
														
		
													</ul>
								
							</h2>
						</div>     
							
							
					</div><!--美食专题 -->		
					
            <div class="container"><!--美食专题图片 -->
								<div class="row row1" >
						<!-- 	 <div class="col-sm-4">
								<img src="http://img95.699pic.com/photo/50021/5742.jpg_wh300.jpg" class="img-responsive" >
							<p class="hideP">
								<button class="btn btn-primary">查看详情</button>
								<span>图片文字说明xxxxx</span>
							</p>
							</div> -->
							
							<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
								<img src="http://www.meishixing.com/Public/Upfiles/zhuanti/20170828162529527.jpg" class="img-responsive">
							<p>
								<span style="font-size: 14px; padding-left: 10px;">一日之计在于晨，早餐的重要性无需赘言。</span>
							</p>
							</div>
							
							<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
								<img src="http://www.meishixing.com/Public/Upfiles/zhuanti/20170828160653642.jpg" class="img-responsive">
							<p>
								<span style="font-size: 14px; padding-left: 10px;">饮食，是维持人体生命活动的根本条件。</span>
								<span>香煎牛排</span>
							</p>
							</div>
							
							<div class="col-sm-4 col-xm-4 col-md-4 col-lg-4">
								<img src="http://www.meishixing.com/Public/Upfiles/zhuanti/20170916132223464.jpg" class="img-responsive">
							<p>
								
								<span>螃蟹肉质细嫩，味道鲜美，是人们喜食佳品。</span>
							</p>
							</div>
								
						</div>
					
					<div class="container"><!--美食专题图片 -->

					
					
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
					     
				
			<div id="btnSide">展开侧边栏</div>
			<div id="divSide">
				<span class="glyphicon glyphicon-remove" id="closeSide"></span>
				<br />
				<img src="https://qq.yh31.com/tp/zjbq/201809301216387835.gif" style="width: 110px;height: 110px;" />
				<table border="1">
					<tr>
						<td><a href="#" style="font-size: 15px;color: white;padding-left: 20px;">滴津烧鹅</a></td>
					</tr>
					<tr>
						<td><a href="#" style="font-size: 14px;color: white;">琼浆玉液润全身</a></td>
					</tr>
					<tr>
						<td><a href="#" style="font-size: 14px;color: white;">慢火中厨入味匀</a></td>
					</tr>
					<tr>
						<td><a href="#" style="font-size: 14px;color: white;">肉嫩皮酥骨松脆</a></td>
					</tr>
					<tr>
						<td><a href="#" style="font-size: 14px;color: white;">余鲜缕缕口生津</a></td>
					</tr>
				</table>
			</div>


			<img src="img/jian.PNG" id="rTop" />
			<script src="js/sideOpen.js"></script>
			<script src="js/backTop.js"></script>
			
			
			
			
			

		</div>
		<!--总的边框-->


	</body>
</html>