package site.metacoding.baseballManagement.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.player.Player;
import site.metacoding.baseballManagement.domain.player.PlayerDao;
import site.metacoding.baseballManagement.web.dto.request.player.InsertPlayerDto;

@RequiredArgsConstructor
@Service
public class PlayerService {
	
	private final PlayerDao playerDao;
	
	public void insertPlayer(InsertPlayerDto insertPlayerDto) {
		Player player = insertPlayerDto.toEntity();
		playerDao.insert(player);
	}
	public void deletePlayer(Integer id) {
		playerDao.deleteById(id);
	}
}
