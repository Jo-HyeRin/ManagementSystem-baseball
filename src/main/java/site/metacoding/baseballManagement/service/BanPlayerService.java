package site.metacoding.baseballManagement.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.banplayer.Banplayer;
import site.metacoding.baseballManagement.domain.banplayer.BanplayerDao;
import site.metacoding.baseballManagement.web.dto.request.banplayer.InsertBanplayerDto;

@RequiredArgsConstructor
@Service
public class BanplayerService {

	private final BanplayerDao banplayerDao;
	
	public void insertBanplayer(InsertBanplayerDto insertBanplayerDto) {
		Banplayer banplayer = insertBanplayerDto.toEntity();
		banplayerDao.insert(banplayer);
		// 기존 player 퇴출 여부 업데이트 필요
	}
}
