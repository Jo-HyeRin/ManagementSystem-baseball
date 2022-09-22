package site.metacoding.baseballManagement.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.team.Team;
import site.metacoding.baseballManagement.domain.team.TeamDao;
import site.metacoding.baseballManagement.web.dto.request.team.InsertTeamDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	
	private final TeamDao teamDao;
	
	public void insertTeam(InsertTeamDto insertTeamDto) {
		Team team = insertTeamDto.toEntity();
		teamDao.insert(team);
	}
	
	public void deleteTeam(Integer id) {
		teamDao.deleteById(id);
	}
}
