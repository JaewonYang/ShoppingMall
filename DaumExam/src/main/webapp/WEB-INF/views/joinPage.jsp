<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/menu.css" rel="stylesheet" type="text/css"
	media="all" /><title>ȸ������ ������</title>
</head>
<body>

	<div id="Header">���θ�ȸ������ prototype</div>
	<div id="Menu">
		<a href="index" id="sideList">��Ϻ���</a><br />
	</div>
	<div id="Content">
		<form action="userinsertComplete" method="POST">
			<input type="hidden" name="usergrade" value="0" />
			<fieldset>
				<legend>ȸ������</legend>
				<p>
					<label>���̵�</label> <input type="text" name="userid" value="" />
				</p>
				<p>
					<label>��й�ȣ</label> <input type="text" name="userpassword" value="" />
				</p>
				<p>
					<label>�Ǹ��ڸ�</label> <input type="text" name="username" value="" />
				</p>
				<p>
					<label>email</label> <input type="text" name="useremail" value="" />
				</p>
				<p>
					<select name="gradeChoice">
						<option value="seller">�Ǹ���</option>
						<option value="consumer">������</option>
					</select>
				</p>
				<button type="submit" class="submitbtn">�Է¿Ϸ�!</button>
			</fieldset>
		</form>
	</div>
</body>
</html>