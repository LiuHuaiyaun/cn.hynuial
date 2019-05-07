<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<div style="width:500px;margin: 0 auto;">
			<form action="user_registry" method="post">
				<table>
					<thead>
						<th>
							<td colspan="3">
								<label>注册</label>
							</td>
						</th>
					</thead>
					<tbody>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>用户姓名：</label>
							</td>
							<td>
								<input type="text" id="userName" name="userName" style="width: 200px;border-left: 5px" placeholder="请输入用户姓名！"/>
							</td>
						</tr>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>联系电话：</label>
							</td>
							<td>
								<input type="text" id="cellphone" name="cellphone" style="width: 200px;border-left: 5px" placeholder="请输入联系电话！"/>
							</td>
						</tr>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>登录密码：</label>
							</td>
							<td>
								<input type="password" id="password" name="password" style="width: 200px;border-left: 5px" placeholder="请输入登录密码！"/>
							</td>
						</tr>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>性别：</label>
							</td>
							<td>
								<input type="radio" id="gender" name="gender" value="M" checked="checked"/>&nbsp;男&nbsp;&nbsp;
								<input type="radio" id="gender" name="gender" value="F"/>&nbsp;女&nbsp;&nbsp;
							</td>
						</tr>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>用户职称：</label>
							</td>
							<td>
								<select >
									<option value="1" selected="selected">普通用户</option>
									<option value="0">admin</option>
								</select>
							</td>
						</tr>
						<tr>
							<td>
								<span style="color: red">*</span>
								<label>身份证号码：</label>
							</td>
							<td>
								<input type="text" id="idCard" name="idCard" style="width: 200px;border-left: 5px" placeholder="请输入身份证号码！"/>
							</td>
						</tr>
					</tbody>
					<tfoot>
						<tr>
							<td>
								<button type="submit">注&nbsp;册</button>
							</td>
						</tr>
					</tfoot>
				</table>
				
			</form>
		</div>
	</body>
</html>