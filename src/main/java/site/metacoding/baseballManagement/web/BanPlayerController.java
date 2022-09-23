package site.metacoding.baseballManagement.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.banplayer.Banplayer;
import site.metacoding.baseballManagement.domain.banplayer.BanplayerDao;
import site.metacoding.baseballManagement.domain.player.Player;
import site.metacoding.baseballManagement.domain.player.PlayerDao;
import site.metacoding.baseballManagement.domain.team.Team;
import site.metacoding.baseballManagement.service.BanplayerService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.banplayer.InsertBanplayerDto;

@RequiredArgsConstructor
@Controller
public class BanplayerController {
	
	private final BanplayerService banplayerService;
	private final BanplayerDao banPlayerDao;
	private final PlayerDao playerDao;
	
	@GetMapping("/banplayerList")
	public String getBanPlayerList(Model model) {
		List<Banplayer> banplayerList = banPlayerDao.findAll();
		model.addAttribute("banplayerList", banplayerList);
		return "banplayer/banplayerList";
	}
	
	@GetMapping("/banplayerSaveForm")
	public String insertBanplayer(Model model) {
		List<Player> playerList = playerDao.findAll();
		model.addAttribute("playerList", playerList);
		return "banplayer/insertBanplayer";
	}
	
	@PostMapping("/banplayerSave")
	public @ResponseBody CMRespDto<?> banplayerSave(@RequestBody InsertBanplayerDto insertBanplayerDto) {
		banplayerService.insertBanplayer(insertBanplayerDto);
		return new CMRespDto<>(1, "퇴출 선수 등록 성공", null);
	}
}

