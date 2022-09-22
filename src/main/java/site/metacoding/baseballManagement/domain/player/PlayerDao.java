package site.metacoding.baseballManagement.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player player);
	public List<Player> findAll();
	public void deleteById(Integer id);
}
