<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>상품정보 수정</title>
	<link href="resources/menu.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<div id="Header">
		상품정보
	</div>
	<div id="Menu">
		<a href="index">목록보기</a><br/>
	</div>
	<div id="Content">
		<form action="/ProductModifyComplete" method="POST">
		<input type="hidden" name="id" value="${product.id}" />
			<fieldset >
				<legend>상품 정보 변경</legend>
				<p>
					<label>상품명</label>
					<input type="text" name="title" value="${product.title}"/>
				</p>
				<p>
					<label>가격</label>
					<input type="text" name="price" value="${product.price}"/>
				</p>
				<p>
					<label>판매자명</label>
					<input type="text" name="provider" value="${product.provider}" readonly="readonly"/>
				</p>
				<p>
				<label>제품 설명</label>
					<input type="textarea" name="goodinfo" id="productexplain" value="${product.goodinfo}" width="500px" height="50px"/>
				</p>
								<button type="submit" class="submitbtn">수정완료!</button>
			</fieldset>
		</form>
	</div>
</body>
</html>