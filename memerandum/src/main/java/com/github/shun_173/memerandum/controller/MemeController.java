package com.github.shun_173.memerandum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemeController {

	@GetMapping
	public String index() {
		return "index";
	}

}
