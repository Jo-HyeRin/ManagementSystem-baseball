<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">선수등록</h1>	
	<br />
	
	<label for="team">Choose a team:</label> 
	<select id="team" name="team">
		<c:forEach var="team" items="${teamList}">
			<option value="${team.teamName}">${team.teamName}</option>
		</c:forEach>
	</select>	
	<input id="teamId" type="hidden" value="${team.id}">
	<form>
		<div class="mb-3 mt-3">
			<input id="playerName" type="text" class="form-control" placeholder="Enter playerName" maxlength="20">
		</div>
		<div class="mb-3">
			<input id="position" type="text" class="form-control" placeholder="Enter position" maxlength="20">
		</div>
		<div class="mb-3">
			<input id="insertDate" type="text" class="form-control" placeholder="Enter YYYY-MM-DD" maxlength="20">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">선수등록하기</button>
	</form>
</div>

<script>

$("#btnInsert").click(() => {
	let data = {
			playerName: $("#playerName").val(),
			position: $("#position").val(),
			insertDate: $("#insertDate").val(),
			teamId: $("#teamId").val()
		};

		$.ajax("/playerSave", {
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("선수 등록 완료");
				location.href = "/player/playerList";
			}else{
				alert("등록 실패");
			}
		});
});

</script>

<%@ include file="../layout/footer.jsp"%>
