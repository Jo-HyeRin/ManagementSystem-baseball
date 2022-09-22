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
				<th>경기장</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="team" items="${teamList}">
				<tr>
					<td>${team.id}</td>
					<td>${team.teamName}</td>
					<td>${team.makeTeamDate}</td>
					<td>${team.teamStadium}</td>
					<td><input type="checkbox" name="delete" value="true"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>
