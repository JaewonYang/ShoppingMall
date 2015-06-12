<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 입력하기</title>
<link href="resources/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div id="Header">
		상품 입력하기
	</div>
	<div id="Menu">
		<a href="index" id="sideList">목록보기</a><br/>
	</div>
	<div id="Content">
		<form action="insertComplete" method="POST">
		<input type="hidden" name="id" value="${product.id}" />
			<fieldset >
				<legend>상품 정보 변경</legend>
				<p>
					<label>상품명</label>
					<input type="text" name="title" value=""/>
				</p>
				<p>
					<label>가격</label>
					<input type="text" name="price" value=""/>
				</p>
				<p>
					<label>판매자명</label>
					<input type="text" name="provider" value=""/>
				</p>
				<p>
				<label>제품 설명</label>
					<input type="textarea" name="goodinfo" value="" width="100px" height="50px"/>
				</p>
				<button type="submit" class="submitbtn">입력완료!</button>
			</fieldset>
		</form>
	</div>
</body>
</html>