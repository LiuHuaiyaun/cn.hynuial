<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="../static/css/style.css">
	</head>
	<body>
		<div class="container">
			<section id="content">
				<form action="registry" method="post">
					<h1>APP Developer</h1>
					<div>
						<input type="text" placeholder="开发编号" required="" id="devNo" name = "devNo" />
					</div>
					<div>
						<input type="text" placeholder="开发人员姓名" required="" id="devName" name = "devName" />
					</div>
					<div>
						<input type="password" placeholder="登录密码" required="" id="password" name = "password"/>
					</div>
					<div>
						<input type="password" placeholder="密码验证" required="" id="password" name="password"/>
					</div>
					<div>
						<input type="text" placeholder="联系电话" required="" id="cellphone" name = "cellphone" />
					</div>
					<div>
						<input type="email" placeholder="电子邮箱" required="" id="devName" name = "devName" />
					</div>
					<div>
						<input type="submit" value="注&nbsp;册" />
						<a href="#">忘记密码?</a>
						<a href="registry">注册用户</a>
					</div>
				</form><!-- form -->
				<div class="button">
					<a href="#">Download source file</a>
				</div><!-- button -->
			</section><!-- content -->
		</div><!-- container -->
	</body>
</html>