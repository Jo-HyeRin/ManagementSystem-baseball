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
				
				<th>팀1</th>
				<th>팀2</th>
				<th>팀3</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>포지션이름</td>
				<td>선수이름</td>
				<td>선수이름</td>
				<td>선수이름</td>				
			</tr>
		</tbody>
	</table>

</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>