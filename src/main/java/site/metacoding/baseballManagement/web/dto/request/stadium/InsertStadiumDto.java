package site.metacoding.baseballManagement.web.dto.request.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseballManagement.domain.stadium.Stadium;

@Setter
@Getter
public class InsertStadiumDto {
	private String stadiumName;
	private String openDate;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.stadiumName, this.openDate);
		return stadium;				
	}

}
