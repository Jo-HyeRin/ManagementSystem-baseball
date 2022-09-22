<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">선수등록</h1>	
	<br />
	
	<label for="team">Choose a team:</label> 
	<select id="team" name="team">
		<c:forEach var="team" items="${teamList}">
			<option value="${teamName}">${team.teamName}</option>
		</c:forEach>
	</select>	
	
	<form>
		<div class="mb-3 mt-3">
			<input id="playerName" type="text" class="form-control" placeholder="Enter playerName" maxlength="20">
		</div>
		<div class="mb-3">
			<input id="position" type="text" class="form-control" placeholder="Enter position" maxlength="20">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">선수등록하기</button>
	</form>
</div>

<script src="/js/player.js"></script>

<%@ include file="../layout/footer.jsp"%>
