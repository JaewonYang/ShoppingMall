<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��ǰ ����</title>
</head>
<body>
	<div id="Header">
		��ǰ����
	</div>
	<div id="Menu">
		<a href="list.jsp">��Ϻ���</a><br/>
		<a href="modify.jsp">�����ϱ�</a>
	</div>
	<div id="Content">
		<form action="save" method="POST">
			<fieldset>
				<legend>��ǰ ���� ����</legend>
				<p>
					<label>��ǰ��</label>
					<input type="text" name="id" value="${product.title}" readonly="readonly"/>
				</p>
				<p>
					<label>����</label>
					<input type="text" name="price" value="${product.price}" readonly="readonly"/>
				</p>
				<p>
					<label>�Ǹ��ڸ�</label>
					<input type="text" name="userName" value="${user.name }" readonly="readonly"/>
				</p>
				<p>
				<label>��ǰ ����</label>
					<input type="textarea" value="����" value="${user.? }" width="100px" height="50px" readonly="readonly"/>
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>