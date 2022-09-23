package site.metacoding.baseballManagement.domain.team;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Team {
	private Integer id;
	private String teamName;
	private String createDate;
	private String stadiumName;
	
	public Team (String teamName, String createDate, String stadiumName) {
		this.teamName = teamName;
		this.createDate = createDate;
		this.stadiumName = stadiumName;
	}
}
