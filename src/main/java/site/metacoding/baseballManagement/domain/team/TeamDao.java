package site.metacoding.baseballManagement.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(Team team);
	public List<Team> findAll();
	public void deleteById(Integer id);
}
