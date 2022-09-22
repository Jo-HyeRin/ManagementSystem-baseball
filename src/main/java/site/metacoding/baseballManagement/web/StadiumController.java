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
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.stadium.Stadium;
import site.metacoding.baseballManagement.domain.stadium.StadiumDao;
import site.metacoding.baseballManagement.service.StadiumService;
import site.metacoding.baseballManagement.web.dto.CMRespDto;
import site.metacoding.baseballManagement.web.dto.request.stadium.InsertStadiumDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	
	private final StadiumService stadiumService;
	private final StadiumDao stadiumDao;	
	private final HttpSession session;

	@GetMapping({"/", "/stadiumList"})
	public String getStadiumList(Model model) {
		List<Stadium> stadiumList = stadiumDao.findAll();
		model.addAttribute("stadiumList", stadiumList);
		return "stadium/main";
	}
	
	@GetMapping("/stardiumSaveForm")
	public String insertStadium() {
		return "stadium/insertStadium";
	}
	
	@PostMapping("/stardiumSaveForm")
	public @ResponseBody CMRespDto<?> join(InsertStadiumDto insertStadiumDto) {
		stadiumService.insertStadium(insertStadiumDto);
		return new CMRespDto<>(1, "경기장 등록 성공", null);
	}
	
	@DeleteMapping("/stadium/{id}")
	public @ResponseBody CMRespDto<?> deleteStadium(@PathVariable Integer id, HttpServletResponse response) {
		stadiumService.deleteStadium(id);
		session.invalidate();
		return new CMRespDto<>(1, "경기장 삭제 성공", null);
	}
	
}
