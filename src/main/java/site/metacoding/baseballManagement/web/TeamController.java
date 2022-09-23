package site.metacoding.baseballManagement.web;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.stadium.Stadium;
import site.metacoding.baseballManagement.domain.stadium.StadiumDao;
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
	private final StadiumDao stadiumDao;
	private final HttpSession session;
	
	@GetMapping("/teamList")
	public String getTeamList(Model model) {
		List<Team> teamList = teamDao.findAll();
		model.addAttribute("teamList", teamList);
		return "team/teamList";
	}
	
	@GetMapping("/teamSaveForm")
	public String insertTeam(Model model) {
		List<Stadium> stadiumList = stadiumDao.findAll();
		model.addAttribute("stadiumList", stadiumList);
		return "team/insertTeam";
	}
	
	@PostMapping("/teamSave")
	public @ResponseBody CMRespDto<?> teamSave(@RequestBody InsertTeamDto insertTeamDto) {
		teamService.insertTeam(insertTeamDto);
		return new CMRespDto<>(1, "팀 등록 성공", null);
	}
	
	@DeleteMapping("/team/{id}")
	public @ResponseBody CMRespDto<?> deleteTeam(@PathVariable Integer id, HttpServletResponse response) {
		teamService.deleteTeam(id);
		session.invalidate();
		return new CMRespDto<>(1, "팀 삭제 성공", null);
	}

}
