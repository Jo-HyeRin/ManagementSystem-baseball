<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /> <br />
	<h1 style="text-align: center;">퇴출선수등록</h1>
	<br /> 
	<label for="player">퇴출선수이름:</label>
	<select id="playerName" name="player">
		<c:forEach var="player" items="${playerList}">
			<option value="${player.playerName}">${player.playerName}</option>
		</c:forEach>
	</select> <br />

	<div class="mb-3 mt-3">
		<input id="banReason" type="text" class="form-control" placeholder="Enter banReason"
			maxlength="20">
	</div>
	<div class="mb-3 mt-3">
		<input id="banDate" type="text" class="form-control" placeholder="Enter YYYY-MM-DD"
			maxlength="20">
	</div>

	<button id="btnInsert" type="button" class="btn btn-primary">퇴출선수등록하기</button>

</div>

<script>
$("#btnInsert").click(() => {
	let data = {		
			banReason: $("#banReason").val(),
			banDate: $("#banDate").val(),
			playerName: $("#playerName").val()
		};

		$.ajax("/banplayerSave", {
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("퇴출 선수 등록 완료");
				location.href = "/banplayerList";
			}else{
				alert("등록 실패");
			}
		});
});

</script>

<%@ include file="../layout/footer.jsp"%>
