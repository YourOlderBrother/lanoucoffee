package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavigateController {

	@RequestMapping("/feature")
	public String coffee() {
		return "Feature";
	}

	@RequestMapping("/personalinfo")
	public String personalinfo() {
		return "PersonalInfo";
	}

	@RequestMapping("/ordering")
	public String ordering() {
		return "Ordering";
	}

	@RequestMapping("/help")
	public String help() {
		return "Help";
	}

}
