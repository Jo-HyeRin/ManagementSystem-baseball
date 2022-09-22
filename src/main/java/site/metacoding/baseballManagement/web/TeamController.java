package site.metacoding.baseballManagement.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.team.Team;
import site.metacoding.baseballManagement.domain.team.TeamDao;
import site.metacoding.baseballManagement.service.TeamService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.team.InsertTeamDto;

@RequiredArgsConstructor
@Controller
public class TeamController {
	
	private final TeamService teamService;
	private final TeamDao teamDao;
	
	@GetMapping("/teamList")
	public String getteamList(Model model) {
		List<Team> teamList = teamDao.findAll();
		model.addAttribute("teamList", teamList);
		return "team/teamList";
	}
	
	@GetMapping("/teamSaveForm")
	public String insertTeam() {
		return "team/insertTeam";
	}
	
	@PostMapping("/teamSaveForm")
	public @ResponseBody CMRespDto<?> join(InsertTeamDto insertTeamDto) {
		teamService.insertTeam(insertTeamDto);
		return new CMRespDto<>(1, "팀 등록 성공", null);
	}
	
	

}
