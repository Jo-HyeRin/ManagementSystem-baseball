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
	private String makeTeamDate;
	private String teamStadium;
	
	public Team (String teamName, String makeTeamDate, String teamStadium) {
		this.teamName = teamName;
		this.makeTeamDate = makeTeamDate;
		this.teamStadium = teamStadium;
	}
}
