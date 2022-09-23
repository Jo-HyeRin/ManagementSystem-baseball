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
import site.metacoding.baseballManagement.domain.player.Player;
import site.metacoding.baseballManagement.domain.player.PlayerDao;
import site.metacoding.baseballManagement.domain.team.Team;
import site.metacoding.baseballManagement.domain.team.TeamDao;
import site.metacoding.baseballManagement.service.PlayerService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.player.InsertPlayerDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final PlayerDao playerDao;
	private final TeamDao teamDao;
	private final HttpSession session;

	@GetMapping("/playerList")
	public String getPlayerList(Model model) {
		List<Player> playerList = playerDao.findAll();
		model.addAttribute("playerList", playerList);
		return "player/playerList";
	}
	
	@GetMapping("/playerSaveForm")
	public String insertPlayer(Model model) {
		List<Team> teamList = teamDao.findAll();
		model.addAttribute("teamList", teamList);
		return "player/insertPlayer";
	}
	
	@PostMapping("/playerSave")
	public @ResponseBody CMRespDto<?> playerSave(@RequestBody InsertPlayerDto insertPlayerDto) {
		playerService.insertPlayer(insertPlayerDto);
		return new CMRespDto<>(1, "선수 등록 성공", null);
	}
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?> deletePlayer(@PathVariable Integer id, HttpServletResponse response) {
		playerService.deletePlayer(id);
		session.invalidate();
		return new CMRespDto<>(1, "선수 삭제 성공", null);
	}
	
	@GetMapping("/listByPosition")
	public String listByPosition() {
		return "player/listByPosition";
	}
	
	
	
}
