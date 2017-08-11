package com.example.demo;


@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String Hello(){
		return "Hello,Sun Shihao";
	}
	@RequestMapping("/sun")
	public String sun(){
		return "SUN test";
	}
}
