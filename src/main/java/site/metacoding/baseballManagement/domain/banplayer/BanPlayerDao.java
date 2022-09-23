package site.metacoding.baseballManagement.domain.banplayer;

import java.util.List;

public interface BanplayerDao {
	public void insert(Banplayer banplayer);
	public List<Banplayer> findAll();
}
