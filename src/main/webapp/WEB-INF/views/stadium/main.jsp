<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">경기장목록&삭제</h1>		
	<br />
	<button id="btnDelete" type="button" class="btn btn-danger" style="float: right;">삭제</button>
	<br/>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>야구장이름</th>
				<th>개장일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="stadiumList" items="${stadiumList}">
				<tr>
					<td>${stadiumList.id}</td>
					<td>${stadiumList.stadiumName}</td>
					<td>${stadiumList.openDate}</td>
					<td><input id="deleteCheck" type="checkbox" name="delete" value="true"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<script src="/js/stadium.js"></script>

<%@ include file="../layout/footer.jsp"%>
