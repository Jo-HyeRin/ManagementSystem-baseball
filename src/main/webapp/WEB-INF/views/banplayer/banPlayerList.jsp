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
				<th>소속팀</th>
				<th>포지션</th>
				<th>선수이름</th>
				<th>사유</th>
				<th>퇴출일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="banplayer" items="${banplayerList}">
				<tr>
					<td>${banplayer.id}</td>
					<td>소속팀</td>
					<td>포지션</td>
					<td>선수이름</td>
					<td>${banplayer.banReason}</td>
					<td>${banplayer.banDate}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>

<script></script>

<%@ include file="../layout/footer.jsp"%>
