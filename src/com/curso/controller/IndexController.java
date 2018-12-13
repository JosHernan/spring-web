package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	
	@RequestMapping("/") //atienda la peticion
	public String showIndex() {
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String showAbout() {
		return "about";
	}

	
}
