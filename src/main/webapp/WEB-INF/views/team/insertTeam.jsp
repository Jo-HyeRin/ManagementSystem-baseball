<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /><br/>
	<h1 style="text-align: center;">팀등록</h1>	
	<br />

	<label for="stadium">Choose a stadium:</label> 
	<select id="stadiumName" name="stadium">
		<c:forEach var="stadium" items="${stadiumList}">
			<option value="${stadium.stadiumName}">${stadium.stadiumName}</option>
		</c:forEach>
	</select>	
	
	<br/><br/>
	
	<div class="mb-3">
		<input id="teamName" type="text" class="form-control" placeholder="Enter teamName" maxlength="20">
	</div>
	<div class="mb-3">
		<input id="createDate" type="text" class="form-control" placeholder="Enter createDate"
			maxlength="20">
	</div>
	
	<button id="btnInsert" type="button" class="btn btn-primary">팀등록하기</button>
</div>

<script>

$("#btnInsert").click(() => {
	let data = {
			teamName: $("#teamName").val(),
			createDate: $("#createDate").val(),
			stadiumName: $("#stadiumName").val()
		};

		$.ajax("/teamSave", {
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("팀 등록 완료");
				location.href = "/teamList";
			}else{
				alert("등록 실패");
			}
		});
});

</script>

<%@ include file="../layout/footer.jsp"%>
