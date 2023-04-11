package egovframework.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Mainctr {
	
	@RequestMapping(value = "/main.do")
	public String MainPage() {
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
		return "main";
		
	}
}
