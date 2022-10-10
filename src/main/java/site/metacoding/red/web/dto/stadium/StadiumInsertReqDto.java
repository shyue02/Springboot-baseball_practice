package site.metacoding.red.web.dto.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.red.domain.stadium.Stadium;

@Setter
@Getter
public class StadiumInsertReqDto {
	private String name;
	
	public Stadium toEntity() { //반대로 나중에 엔티티에서는 응답할 때 toDto 만들어주면 좋다
		Stadium stadium = new Stadium();
		stadium.setName(this.name);
		return stadium;
	}
}