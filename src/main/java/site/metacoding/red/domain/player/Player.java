package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter	//필요 없을 때는 없는게 조아!
@Getter
public class Player {
	private Integer id;
	private String name;
	private String position;
	private Integer teamId;
	private boolean isOuter;		// db에서 boolean은 boolean으로 
	private Timestamp createdAt;
}
