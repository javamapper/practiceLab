package com.javamapper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MsgController {
	@RequestMapping("/msghello")
	public String getHello() {
		System.out.println("in msghellooo..");
		return "hello";
	}
	
	@RequestMapping("/msgwelcome")
	public String getWelcome() {
		return "welcome";
	}
}
