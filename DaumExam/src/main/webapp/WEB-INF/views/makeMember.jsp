<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������</title>
</head>
<body>
	<div id="wrap">
    <label id="idName" >ID</label>
    <input id="idArea" >
    <label id="pwName">Password</label>
    <input id="pwArea">
    <label id="memberName">�̸�</label>
    <input id="memberArea">
    <label id="gradeName">����</label>
    <select name="gradeChoice">
        <option value="seller">�Ǹ���</option>
        <option value="consumer">������</option>
        <option value="operator">���</option>
    </select>

    <button id="loginBtn">ȸ������</button>
    <button id="cancelBtn">���</button>
</div>
	
</body>
</html>