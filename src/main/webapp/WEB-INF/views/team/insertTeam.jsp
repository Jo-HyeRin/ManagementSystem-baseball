<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">팀등록</h1>	
	<br />

	<label for="team">Choose a stadium:</label> 
	<select id="stadium" name="stadium">
		<c:forEach var="stadium" items="${stadiumList}">
			<option value="${stadiumName}">${stadium.stadiumName}</option>
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

<script src="/js/team.js"></script>

<%@ include file="../layout/footer.jsp"%>
