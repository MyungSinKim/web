package com.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	// web :: 
	@RequestMapping("/jsp")
	public String jspPage(Model model){
		model.addAttribute("name","hello springBoot1234");
		return "hello";
	}
	
	@RequestMapping("/")
	public String index(){
		return "helloHome";
	}
}
