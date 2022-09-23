package site.metacoding.baseballManagement.web.dto.response.banplayer;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class listBanplayerDto {
	private Integer no;	
	private String teamName;
	private String position;	
	private String playerName;
	private String banReason;
	private String banDate;
}
