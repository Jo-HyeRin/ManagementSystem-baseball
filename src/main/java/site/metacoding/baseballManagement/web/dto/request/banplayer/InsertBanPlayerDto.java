package site.metacoding.baseballManagement.web.dto.request.banplayer;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagement.domain.banplayer.Banplayer;

@Setter
@Getter
public class InsertBanplayerDto {
	private String banReason;
	private String banDate;
	private Integer playerId;
	
	public Banplayer toEntity() {
		Banplayer banPlayer = new Banplayer(this.banReason, this.banDate, this.playerId);
		return banPlayer;
	}
}
