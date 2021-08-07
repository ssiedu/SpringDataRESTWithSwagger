package com.ssi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class TestController {
	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	@GetMapping("welcome")
	public String welcome() {
		return "welcome";
	}
}
