package site.metacoding.baseballManagement.web.dto.request.banplayer;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagement.domain.banplayer.BanPlayer;

@Setter
@Getter
public class InsertBanPlayerDto {
	private String playerName;
	private String banReason;
	
	public BanPlayer toEntity() {
		BanPlayer banPlayer = new BanPlayer(this.playerName, this.banReason);
		return banPlayer;
	}
}
