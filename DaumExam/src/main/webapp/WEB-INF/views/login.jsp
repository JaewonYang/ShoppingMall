<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/menu.css" rel="stylesheet" type="text/css"
	media="all" />
<title>login page</title>
</head>
<body>
	<div id="Menu">
		<a href="index" id="sideList">��Ϻ���</a><br/>
	</div>
	<div id="Content">
		<form action="loginComplete" method="POST">
			<fieldset >
				<legend>�α���</legend>
				<p>
					<label>���̵�</label>
					<input type="text" name="userid" value=""/>
				</p>
				<p>
					<label>��й�ȣ</label>
					<input type="text" name="userpassword" value=""/>
				</p>
				<button type="submit" class="submitbtn">�Է¿Ϸ�!</button></br></br>
				 <a href = /index.jeju">���</a>
			</fieldset>
		</form>
	</div>
</body>
</html>