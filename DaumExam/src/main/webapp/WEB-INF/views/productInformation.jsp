<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 정보</title>
</head>
<body>
	<div id="Header">
		상품정보
	</div>
	<div id="Menu">
		<a href="list.jsp">목록보기</a><br/>
		<a href="modify.jsp">수정하기</a>
	</div>
	<div id="Content">
		<form action="save" method="POST">
			<fieldset>
				<legend>상품 정보 변경</legend>
				<p>
					<label>상품명</label>
					<input type="text" name="id" value="${product.title}" readonly="readonly"/>
				</p>
				<p>
					<label>가격</label>
					<input type="text" name="price" value="${product.price}" readonly="readonly"/>
				</p>
				<p>
					<label>판매자명</label>
					<input type="text" name="userName" value="${user.name }" readonly="readonly"/>
				</p>
				<p>
				<label>제품 설명</label>
					<input type="textarea" value="정보" value="${user.? }" width="100px" height="50px" readonly="readonly"/>
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>