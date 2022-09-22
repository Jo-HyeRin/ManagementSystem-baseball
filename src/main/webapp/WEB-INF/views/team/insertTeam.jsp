<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">팀등록</h1>	
	<br />

	<label for="team">Choose a team:</label> 
	<select id="team" name="team">
		<c:forEach var="teamName" items="${teamList}">
			<option value="${team.teamName}">${team.teamName}</option>
		</c:forEach>
	</select>	
	
	<br/><br/>
	
	<div class="mb-3">
		<input id="teamName" type="text" class="form-control" placeholder="Enter teamName" maxlength="20">
	</div>
	<div class="mb-3">
		<input id="makeTeamDate" type="text" class="form-control" placeholder="Enter makeTeamDate"
			maxlength="20">
	</div>
	<div class="mb-3">
		<input id="teamStadium" type="text" class="form-control" placeholder="Enter teamStadium"
			maxlength="20">
	</div>
	<button id="btnInsert" type="button" class="btn btn-primary">팀등록하기</button>
</div>

<%@ include file="../layout/footer.jsp"%>
