package site.metacoding.baseballManagement.domain.banplayer;

import java.util.List;

public interface BanPlayerDao {
	public void insert(BanPlayer Banplayer);
	public List<BanPlayer> findAll();
}
