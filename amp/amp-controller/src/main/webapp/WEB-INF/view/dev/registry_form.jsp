<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title></title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="../static/css/style.css">
		<link rel="stylesheet" type="text/css" href="../static/css/bootstrap.min.css">
		<script type="text/javascript" src="../static/js/jquery-3.4.1.min.js"></script>
		<script type="text/javascript" src="../static/js/bootstrap.min.js"></script>
		<script type="text/javascript">
			function registryDev(){
				var formData = $("#saveForm").serialize();
				$.ajax({
					url: "registry",
					type: "post",
					data: formData,
					dataType: "json",
					success: function(data){
						var flag = data.result;
						if(flag == true){
							// 标志着注册成功
							// 将开发者账号显示到模态框中
							var devNo = data.dev.devNo;
							$("#devNo").html(devNo);
							// 给按钮设置具体的操作
							$("#modalBtn").click(function() {
								location.href = "login";
							});
							// 开启模态框
							$("#myModal").modal({
								keyboard: false
							});
						} else {
							$("#devNo").html("注册失败，请重新注册");
							// 给按钮设置具体的操作
							$("#modalBtn").click(function() {
								location.href = "registry";
							});
							// 开启模态框
							$("#myModal").modal({
								keyboard: false
							});
						}
					}
					
				})
				
			}
		</script>
		
	</head>
	<body class="mybody">
		<div class="container">
			<section id="content">
				<form id="saveForm">
					<h1 class="myh1">APP Developer</h1>
					<div>
						<input type="text" placeholder="开发人员姓名" required="" id="devName" name = "devName" />
					</div>
					<div>
						<input type="password" placeholder="登录密码" required="" id="password" name = "password"/>
					</div>
					<div>
						<input type="password" placeholder="密码验证" required="" id="password"/>
					</div>
					<div>
						<input type="text" placeholder="联系电话" required="" id="cellphone" name = "cellphone" />
					</div>
					<div>
						<input type="email" placeholder="电子邮箱" required="" id="devName" name = "email" />
					</div>
					<div>								
						<button type="button" onclick="registryDev();" class="btn btn-success">
							<span class="glyphicon glyphicon-log-in"></span>&nbsp;
							注册
						</button>
						<a href="#">忘记密码?</a>
						<a href="registry">注册用户</a>
					</div>
				</form>
				<div class="button">
					<a href="#">Download source file</a>
				</div>
			</section>
		</div>
		
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
		    <div class="modal-dialog">
		        <div class="modal-content">
		            <div class="modal-header">
		                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
		                <h4 class="modal-title" id="myModalLabel">你的开发者编号：</h4>
		            </div>
		            <div class="modal-body" style="text-align: center;">
		            	<h1 id="devNo"></h1>
		            </div>
		            <div class="modal-footer">
		                <button type="button" id="modalBtn" class="btn btn-default">关闭</button>
		            </div>
		        </div>
		    </div>
		</div>
	</body>
</html>