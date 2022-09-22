package site.metacoding.baseballManagement.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.banplayer.BanPlayer;
import site.metacoding.baseballManagement.domain.banplayer.BanPlayerDao;
import site.metacoding.baseballManagement.web.dto.request.banplayer.InsertBanPlayerDto;

@RequiredArgsConstructor
@Service
public class BanPlayerService {

	private final BanPlayerDao banPlayerDao;
	
	public void insertBanPlayer(InsertBanPlayerDto insertBanPlayerDto) {
		BanPlayer banplayer = insertBanPlayerDto.toEntity();
		banPlayerDao.insert(banplayer);
	}
}
