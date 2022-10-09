package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.service.StadiumService;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumService stadiumService;	//서비스에 의존
	
	@GetMapping("/stadium")
	public String list(Model model) {
		List<Stadium> stadiumList = stadiumService.목록보기();
		model.addAttribute("stadiumList",stadiumList); //변수 이름 그대로 담기
		return "stadium/list";
	}
}
