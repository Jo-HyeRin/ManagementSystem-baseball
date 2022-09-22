$("#btnInsert").click(() => {
	insertTeam();
});

$("#btnDelete").click(() => {
	let isChecked = $("#deleteCheck").is(':checked');
	
	if (isChecked==true) {
		deleteTeam();
	}
});

function insertTeam() {
	let data = {
		teamName: $("#teamName").val(),
		makeTeamDate: $("#makeTeamDate").val(),
		teamStadium: $("#teamStadium").val()
	};

	$.ajax("/teamSaveForm", {
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
		}
	});
}

function deleteTeam() {
	let id = $("#id").val();

	$.ajax("/team/" + id, {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("팀 삭제 완료");
			location.href = "/teamList";
		} else {
			alert("팀 삭제 실패");
		}
	});
}