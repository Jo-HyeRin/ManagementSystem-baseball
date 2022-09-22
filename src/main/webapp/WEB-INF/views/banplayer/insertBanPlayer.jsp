<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br />
	<br />
	<h1 style="text-align: center;">퇴출선수등록</h1>
	<br /> 
	
	<label for="team">퇴출선수이름:</label> 
	<select id="team" name="team">
		<c:forEach var="teamName" items="${teamList}">
			<option value="${team.teamName}">${team.teamName}</option>
		</c:forEach>
	</select>

	<br/>

		<div class="mb-3 mt-3">
			<input id="banReason" type="text" class="form-control" placeholder="Enter banReason" maxlength="20">
		</div>		
		
		<button id="btnInsert" type="button" class="btn btn-primary">퇴출선수등록하기</button>

</div>

<script src="/js/banplayer.js"></script>

<%@ include file="../layout/footer.jsp"%>
