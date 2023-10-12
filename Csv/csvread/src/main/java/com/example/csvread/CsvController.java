package com.example.csvread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class CsvController {
	
	@Autowired
	CsvRepository csvRepo;
	
	@GetMapping("/hello")
	public String saySomething() {
		return "hi hello";
	}
	
	@PostMapping("/user")
	public String saveUser(@RequestBody Users users) {
		csvRepo.save(users);
		return "saved succesfully";
	}
}
