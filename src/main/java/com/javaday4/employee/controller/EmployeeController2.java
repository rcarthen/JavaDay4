package com.javaday4.employee.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController

public class EmployeeController2 {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Employee Application!";
	}
	
	

}
