package site.metacoding.baseballManagement.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert();
	public List<Team> findAll();
	public void findById();
	public void deleteById(Integer id);
}
