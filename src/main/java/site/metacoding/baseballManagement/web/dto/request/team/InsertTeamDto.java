package site.metacoding.baseballManagement.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagement.domain.team.Team;

@Setter
@Getter
public class InsertTeamDto {
	private String teamName;
	private String makeTeamDate;
	private String teamStadium;
	
	public Team toEntity() {
		Team team = new Team(this.teamName, this.makeTeamDate, this.teamStadium);
		return team;
	}
}
