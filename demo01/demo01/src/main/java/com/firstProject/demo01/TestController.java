package com.firstProject.demo01;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	
	
	
	
	@RequestMapping("/get")
	public String getData() {
		return "Success";
	}
	
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String postData(@RequestBody String body) {
		return body;
	}
	
	
	
	
	
}








