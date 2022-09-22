package site.metacoding.baseballManagement.domain.banplayer;

import java.sql.Timestamp;

public class BanPlayer {
	private Integer id;
	private String teamName;
	private String position;
	private String playerName;
	private String banReason;
	private Timestamp banDate;
	
	public BanPlayer(String playerName, String banReason) {
		this.playerName = playerName;
		this.banReason = banReason;
	}
}
