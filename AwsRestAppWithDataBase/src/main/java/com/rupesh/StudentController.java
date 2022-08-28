package com.rupesh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@Autowired
	private StudentDao sDao;
	
	
	@GetMapping("/")
	public String sayHello() {
		return "Welcome to Student App";
	}
	
	@PostMapping("/students")
	public Student saveStudent(@RequestBody Student student) {
		return sDao.save(student);
	}
	
	
	
}
