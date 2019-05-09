<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="../static/js/index.js"/>
		<link rel="stylesheet" href="../static/css/style.css">
		
	</head>
	<body>
		<div class="container">
			<section id="content">
				<form action="login" method="post">
					<h1>Login Form</h1>
					<div>
						<input type="text" placeholder="Username" required="" id="username" name = "devNo" />
					</div>
					<div>
						<input type="password" placeholder="Password" required="" id="password" value = "password"/>
					</div>
					<div>
						<input type="submit" value="Log in" />
						<a href="#">忘记密码?</a>
						<a href="#">注册用户</a>
					</div>
				</form><!-- form -->
				<div class="button">
					<a href="#">Download source file</a>
				</div><!-- button -->
			</section><!-- content -->
		</div><!-- container -->
	</body>
</html>