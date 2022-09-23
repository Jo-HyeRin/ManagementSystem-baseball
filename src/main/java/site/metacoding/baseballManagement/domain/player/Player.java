package site.metacoding.baseballManagement.domain.player;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Player {
	private Integer id;
	private String playerName;
	private String position;
	private String insertDate;
	private String teamName;
	
	public Player(String playerName, String position, String insertDate, String teamName) {
		this.playerName = playerName;
		this.position = position;
		this.insertDate = insertDate;
		this.teamName = teamName;
	}
}
