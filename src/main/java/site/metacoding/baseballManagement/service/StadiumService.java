package site.metacoding.baseballManagement.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseballManagement.domain.stadium.Stadium;
import site.metacoding.baseballManagement.domain.stadium.StadiumDao;
import site.metacoding.baseballManagement.web.dto.request.stadium.InsertStadiumDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	
	private final StadiumDao stadiumDao;
	
	public void insertStadium(InsertStadiumDto insertStadiumDto) {
		Stadium stadium = insertStadiumDto.toEntity();
		stadiumDao.insert(stadium);
	}
	
	public void deleteStadium(Integer id) {
		stadiumDao.deleteById(id);
	}
}
