<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/menu.css" rel="stylesheet" type="text/css"
	media="all" />

<title>사용자 등록</title>
</head>
<body>
	<div id="Header">사용자 관리</div>
	<div id="Menu">
		<a href="/insert.jeju">상품 등록</a>
	</div>
	<div id="Content">
		<table width="800px">
			<caption>쇼핑몰 prototype</caption>
			<thead>
				<tr>
					<th>상품명</th>
					<th>가격</th>
					<th>판매자</th>
					<th>수정</th>
					<th>삭제하기</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="product">
					<tr>
						<td><a href="info?id=${product.id}">${product.title}</a></td>
						<td>${product.price}</td>
						<td>${product.provider}</td>
						<td><a href="modify.jeju?id=${product.id}">수정하기</a></td>
						<td><a href="delete?id=${product.id}">삭제하기</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>