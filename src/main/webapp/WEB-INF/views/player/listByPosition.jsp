<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<br />
	<h1 style="text-align: center;">포지션별 팀의 선수</h1>
	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>포지션</th>				
				<th>서울팀</th>
				<th>창원팀</th>
				<th>부산팀</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${playerlist}">
				<tr>
					<td>${player.position}</td>
					<td>${player.team1}</td>
					<td>${player.team2}</td>
					<td>${player.team3}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<%@ include file="../layout/footer.jsp"%>