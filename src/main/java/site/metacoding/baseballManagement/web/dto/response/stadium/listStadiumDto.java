package site.metacoding.baseballManagement.web.dto.response.stadium;

import java.util.List;

import site.metacoding.baseballManagement.domain.stadium.Stadium;

public class listStadiumDto {
	
	private Integer id;
	private String stadiumName;
	private String openDate;
	private String stadiumTeam;
	private String deleteCheck; // 추후 체크박스 추가하기
	
	public List<Stadium> stadiumDto;
}
