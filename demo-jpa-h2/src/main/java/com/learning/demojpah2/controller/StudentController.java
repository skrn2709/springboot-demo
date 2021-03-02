package com.learning.demojpah2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.demojpah2.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
}
