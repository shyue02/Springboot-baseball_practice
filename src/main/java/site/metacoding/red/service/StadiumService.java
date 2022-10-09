package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;

@RequiredArgsConstructor
@Service 	// 메모리에 띄어야하니까 Service라고해서 IoC에 등록 -> 나중에 DI가 됨
public class StadiumService {
	
	// DI
	private final StadiumDao stadiumDao;	// Dao 에 의존
	
	public List<Stadium> 목록보기(){
		return stadiumDao.findAll();
	}
}
