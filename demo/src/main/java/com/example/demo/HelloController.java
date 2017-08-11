package com.example.demo;


@Controller
public class HelloController {
	@RequestMapping("/")
	public String Hello(){
		return "Hello,Sun Shihao";
	}
}
