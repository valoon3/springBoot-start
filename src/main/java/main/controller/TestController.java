package main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import main.service.TestService;

@Controller
@RequestMapping("/")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping
	public String testView() {
		
		testService.showMember();
		
		return "";
	}
	
}
