<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">팀목록&삭제</h1>	
	<br />
	<button id="btnDelete" type="button" class="btn btn-danger" style="float: right;">삭제</button>
	<br/>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀이름</th>
				<th>창단일</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${teamList}">
				<tr>
					<td>${team.id}</td>
					<td>${team.teamName}</td>
					<td>${team.createDate}</td>
					<td><input id="deleteCheck" type="checkbox" name="delete"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>
