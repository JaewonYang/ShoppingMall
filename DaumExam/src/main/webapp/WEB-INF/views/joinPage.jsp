<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/menu.css" rel="stylesheet" type="text/css"
	media="all" /><title>회원가입 페이지</title>
</head>
<body>

	<div id="Header">쇼핑몰회원가입 prototype</div>
	<div id="Menu">
		<a href="index" id="sideList">목록보기</a><br />
	</div>
	<div id="Content">
		<form action="userinsertComplete" method="POST">
			<input type="hidden" name="usergrade" value="0" />
			<fieldset>
				<legend>회원가입</legend>
				<p>
					<label>아이디</label> <input type="text" name="userid" value="" />
				</p>
				<p>
					<label>비밀번호</label> <input type="text" name="userpassword" value="" />
				</p>
				<p>
					<label>판매자명</label> <input type="text" name="username" value="" />
				</p>
				<p>
					<label>email</label> <input type="text" name="useremail" value="" />
				</p>
				<p>
					<select name="gradeChoice">
						<option value="seller">판매자</option>
						<option value="consumer">구매자</option>
					</select>
				</p>
				<button type="submit" class="submitbtn">입력완료!</button>
			</fieldset>
		</form>
	</div>
</body>
</html>