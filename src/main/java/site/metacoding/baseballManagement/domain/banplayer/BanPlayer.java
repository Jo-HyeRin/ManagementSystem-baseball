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
	private String playerName;
	
	public Banplayer(String banReason, String banDate, String playerName) {
		this.banReason = banReason;
		this.banDate = banDate;
		this.playerName = playerName;
	}
}
