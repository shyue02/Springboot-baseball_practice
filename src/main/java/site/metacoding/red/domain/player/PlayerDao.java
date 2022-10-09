package site.metacoding.red.domain.player;

import java.util.List;

public interface PlayerDao {
	public List<Player> findAll();	// db에서 찾아줄거니까 return값이 필요하다 / 수정될 수도 있지만 처음에는 엔티티 넣는다
	public Player findById(Integer id);
	public void insert(Player stadium);
	public void update(Player stadium, Integer id); // update는 보통 두 개를 받는다
	public void deleteById(Integer id);
}


//public void findAll()	->		public List<Stadium> findAll();