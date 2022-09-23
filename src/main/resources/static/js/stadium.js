$("#btnInsert").click(() => {
	insertStadium();
});

$("#btnDelete").click(() => {
	let isChecked = $("#deleteCheck").is(':checked');
	
	if (isChecked==true) {
		deleteStadium();
	}
});

function insertStadium() {
	let data = {
		stadiumName: $("#stadiumName").val(),
		openDate: $("#openDate").val()
	};

	$.ajax("/stardiumSave", {
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
		}else{
			alert("등록 실패");
		}
	});
}

function deleteStadium() {
	let id = $("#id").val();

	$.ajax("/stadium/" + id, {
		type: "DELETE",
		dataType: "json" // 응답 데이터
	}).done((res) => {
		if (res.code == 1) {
			alert("경기장 삭제 완료");
			location.href = "/";
		} else {
			alert("경기장 삭제 실패");
		}
	});
}