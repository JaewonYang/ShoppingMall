<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입</title>
</head>
<body>
	<div id="wrap">
    <label id="idName" >ID</label>
    <input id="idArea" >
    <label id="pwName">Password</label>
    <input id="pwArea">
    <label id="memberName">이름</label>
    <input id="memberArea">
    <label id="gradeName">권한</label>
    <select name="gradeChoice">
        <option value="seller">판매자</option>
        <option value="consumer">구매자</option>
        <option value="operator">운영자</option>
    </select>

    <button id="loginBtn">회원가입</button>
    <button id="cancelBtn">취소</button>
</div>
	
</body>
</html>