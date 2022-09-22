$("#btnInsert").click(() => {
	insertBanPlayer();
});

function insertBanPlayer() {
	let data = {
		banPlayerName: $("#banPlayerName").val(),
		banReason: $("#banReason").val()
	};

	$.ajax("/banPlayerSaveForm", {
		type: "POST",
		dataType: "json",
		data: JSON.stringify(data),
		headers: {
			"Content-Type": "application/json"
		}
	}).done((res) => {
		if (res.code == 1) {
			alert("퇴출 선수 등록 완료");
			location.href = "/banPlayerList";
		}
	});
}
