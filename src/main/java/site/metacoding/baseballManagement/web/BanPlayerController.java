package site.metacoding.baseballManagement.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.banplayer.BanPlayer;
import site.metacoding.baseballManagement.domain.banplayer.BanPlayerDao;
import site.metacoding.baseballManagement.service.BanPlayerService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.banplayer.InsertBanPlayerDto;

@RequiredArgsConstructor
@Controller
public class BanPlayerController {
	
	private final BanPlayerService banPlayerService;
	private final BanPlayerDao banPlayerDao;
	
	@GetMapping("/banPlayerList")
	public String getBanPlayerList(Model model) {
		List<BanPlayer> banPlayerList = banPlayerDao.findAll();
		model.addAttribute("banPlayerList", banPlayerList);
		return "banplayer/banPlayerList";
	}
	
	@GetMapping("/banPlayerSaveForm")
	public String insertBanPlayer() {
		return "banplayer/insertBanPlayer";
	}
	
	@PostMapping("/banPlayerSaveForm")
	public @ResponseBody CMRespDto<?> join(InsertBanPlayerDto insertBanPlayerDto) {
		banPlayerService.insertBanPlayer(insertBanPlayerDto);
		return new CMRespDto<>(1, "퇴출 선수 등록 성공", null);
	}
}

