package site.metacoding.baseballManagement.domain.player;

import java.util.List;

import site.metacoding.baseballManagement.web.dto.request.player.InsertPlayerDto;

public interface PlayerDao {
	public void insert(Player player);
	public List<Player> findAll();
	public void deleteById(Integer id);
}
