package site.metacoding.baseballManagement.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.player.Player;
import site.metacoding.baseballManagement.domain.player.PlayerDao;
import site.metacoding.baseballManagement.service.PlayerService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.player.InsertPlayerDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerService playerService;
	private final PlayerDao playerDao;

	@GetMapping("/playerList")
	public String getPlayerList(Model model) {
		List<Player> playerList = playerDao.findAll();
		model.addAttribute("playerList", playerList);
		return "player/playerList";
	}
	
	@GetMapping("/playerSaveForm")
	public String insertPlayer() {
		return "player/insertPlayer";
	}
	
	@PostMapping("/playerSaveForm")
	public @ResponseBody CMRespDto<?> join(InsertPlayerDto insertPlayerDto) {
		playerService.insertPlayer(insertPlayerDto);
		return new CMRespDto<>(1, "선수 등록 성공", null);
	}
	
	
	
	
}
