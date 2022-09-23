package site.metacoding.baseballManagement.domain.stadium;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Stadium {
	private Integer id;
	private String stadiumName;
	private String openDate;
	
	public Stadium (String stadiumName, String openDate) {
		this.stadiumName = stadiumName;
		this.openDate = openDate;
	}
}
