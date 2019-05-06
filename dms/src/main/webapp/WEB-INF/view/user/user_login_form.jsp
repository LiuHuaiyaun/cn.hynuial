<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta charset="UTF-8">
	</head>
	<body>
		<form action="login" method="post">
			<table>
				<tr>
					<td>
						<label>登录名：</label>
					</td>
					<td>
						<input type="text" id="cellphone" name="cellphone" placeholder="请填入登录手机号码"/>
					</td>
				</tr>
				<tr>
					<td>
						<label>登录密码：</label>
					</td>
					<td>
						<input type="text" id="password" name="password" placeholder="请填入登录密码"/>
					</td>
				</tr>
				<tr>
					<td align="right" colspan="2">
						<button type="submit">登录</button>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>