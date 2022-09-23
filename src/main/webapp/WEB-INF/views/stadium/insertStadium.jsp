<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container">
	<br /> <br />
	<h1 style="text-align: center;">경기장등록</h1>
	<br />
	<form>
		<div class="mb-3 mt-3">
			경기장 이름
			<input id="stadiumName" type="text" class="form-control" placeholder="Enter stadiumName" name="stadiumName"
				maxlength="20">
		</div>
		<div class="mb-3">
			개장일
			<input id="openDate" type="text" class="form-control" placeholder="Enter openDate" name="openDate" maxlength="20">
		</div>
		<button id="btnInsert" type="button" class="btn btn-primary">경기장등록하기</button>
	</form>
</div>

<script>
$("#btnInsert").click(() => {	
	let data = {
			stadiumName: $("#stadiumName").val(),
			openDate: $("#openDate").val()
		};

		$.ajax("/stadiumSave", {
			type: "POST",
			dataType: "json",
			data: JSON.stringify(data),
			headers: {
				"Content-Type": "application/json"
			}
		}).done((res) => {
			if (res.code == 1) {
				alert("경기장 등록 완료");
				location.href = "/stadiumList";
			}
		});

	
});
</script>

<%@ include file="../layout/footer.jsp"%>
