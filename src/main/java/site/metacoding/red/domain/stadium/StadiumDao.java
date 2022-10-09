package site.metacoding.red.domain.stadium;

import java.util.List;

public interface StadiumDao {
	public List<Stadium> findAll(); // db에서 찾아줄거니까 return값이 필요하다 / 수정될 수도 있지만 처음에는 엔티티 넣는다
	public Stadium findById(Integer id); // Stadium을 리턴
	public void insert(Stadium stadium);
	public void update(Stadium stadium, Integer id); // update는 보통 두 개를 받는다
	public void deleteById(Integer id);
}


//public void findAll()	->		public List<Stadium> findAll();