package site.metacoding.baseballManagement.domain.banplayer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Banplayer {
	private Integer id;	
	private String banReason;
	private String banDate;
	private Integer playerId;
	
	public Banplayer(String banReason, String banDate, Integer playerId) {
		this.banReason = banReason;
		this.banDate = banDate;
		this.playerId = playerId;
	}
}
