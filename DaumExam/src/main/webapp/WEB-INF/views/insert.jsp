<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ �Է��ϱ�</title>
<link href="resources/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div id="Header">
		��ǰ �Է��ϱ�
	</div>
	<div id="Menu">
		<a href="index" id="sideList">��Ϻ���</a><br/>
	</div>
	<div id="Content">
		<form action="insertComplete" method="POST">
		<input type="hidden" name="id" value="${product.id}" />
			<fieldset >
				<legend>��ǰ ���� ����</legend>
				<p>
					<label>��ǰ��</label>
					<input type="text" name="title" value=""/>
				</p>
				<p>
					<label>����</label>
					<input type="text" name="price" value=""/>
				</p>
				<p>
					<label>�Ǹ��ڸ�</label>
					<input type="text" name="provider" value=""/>
				</p>
				<p>
				<label>��ǰ ����</label>
					<input type="textarea" name="goodinfo" value="" width="100px" height="50px"/>
				</p>
				<button type="submit" class="submitbtn">�Է¿Ϸ�!</button>
			</fieldset>
		</form>
	</div>
</body>
</html>