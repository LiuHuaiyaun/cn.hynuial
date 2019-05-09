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
				<form action="login" method="post">
					<h1>APP Developer</h1>
					<div>
						<input type="text" placeholder="Developer Cellphone" required="" id="cellphone" name = "cellphone" />
					</div>
					<div>
						<input type="password" placeholder="Password" required="" id="password" value = "password"/>
					</div>
					<div>
						<input type="submit" value="登&nbsp;录" />
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