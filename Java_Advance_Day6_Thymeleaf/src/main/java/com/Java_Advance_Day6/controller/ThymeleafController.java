package com.Java_Advance_Day6.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
public class ThymeleafController {

	@GetMapping("/hi")
	public String gethtml() {
		return "Form";
	}
	
	@GetMapping("/hello")
	public String getnewhtml(Model model) {
		model.addAttribute("gethtmlFile", model);
		return "NewFile";
	}

}
