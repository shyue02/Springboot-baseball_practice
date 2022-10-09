package site.metacoding.red.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter	//필요 없을 때는 없는게 조아!
@Getter
public class Team {
	private Integer id;
	private String name;
	private Integer stadiumId;
	private Timestamp createdAt;
}
