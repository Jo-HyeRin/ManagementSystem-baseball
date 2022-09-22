package site.metacoding.baseballManagement.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public void insert(Stadium stadium);
	public List<Stadium> findAll();
	public void deleteById(Integer id);
}
