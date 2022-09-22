$("#btnInsert").click(() => {
	insertPlayer();
});

$("#btnDelete").click(() => {
	let isChecked = $("#deleteCheck").is(':checked');
	
	if (isChecked==true) {
		deletePlayer();
	}
	
});

function insertPlayer() {
	let data = {
		playerName: $("#playerName").val(),
		position: $("#position").val(),
		playerTeam: $("#playerTeam").val()
	};

	$.ajax("/playerSaveForm", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 등록 완료");
			location.href = "/playerList";
		}
	});
}

function deletePlayer() {
	let id = $("#id").val();

	$.ajax("/player/" + id, {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("선수 삭제 완료");
			location.href = "/teamList";
		} else {
			alert("선수 삭제 실패");
		}
	});
}