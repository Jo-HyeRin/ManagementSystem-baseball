package site.metacoding.baseballManagement.web.dto.request.player;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagement.domain.player.Player;

@Setter
@Getter
public class InsertPlayerDto {
	private String playerName;
	private String position;
	private String insertDate;
	private String teamName;
	
	public Player toEntity() {
		Player player = new Player(this.playerName, this.position, this.insertDate, this.teamName);
		return player;
	}
}
	
