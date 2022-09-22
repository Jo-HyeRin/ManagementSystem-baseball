<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">선수목록&삭제</h1>	
	<br />
	
	<button id="btnDelete" type="button" class="btn btn-danger" style="float: right;">삭제</button>
	<br/>
	
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>선수이름</th>
				<th>포지션</th>
				<th>소속팀</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="player" items="${playerList}">
				<tr>
					<td>${player.id}</td>
					<td>${player.playerName}</td>
					<td>${player.position}</td>
					<td>${player.playerTeam}</td>
					<td><input id="deleteCheck" type="checkbox" name="delete" value="true"></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>
