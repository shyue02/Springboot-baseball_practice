package site.metacoding.red.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter	//필요 없을 때는 없는게 조아!
@Getter
public class Stadium {
	private Integer id;
	private Integer no;	//db에 없는 값
	private String name;
	private Timestamp createdAt;
}
