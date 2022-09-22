<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">퇴출선수목록</h1>	
	<br />

	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>팀이름</th>
				<th>포지션</th>
				<th>선수이름</th>
				<th>사유</th>
				<th>퇴출일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="banPlayer" items="${banPlayerList}">
				<tr>
					<td>${banPlayer.id}</td>
					<td>${banPlayer.teamName}</td>
					<td>${banPlayer.position}</td>
					<td>${banPlayer.playerName}</td>
					<td>${banPlayer.banReason}</td>
					<td>${banPlayer.banDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<script src="/js/banplayer.js"></script>

<%@ include file="../layout/footer.jsp"%>
