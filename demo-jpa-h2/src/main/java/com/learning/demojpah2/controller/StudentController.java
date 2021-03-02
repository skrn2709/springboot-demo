package com.learning.demojpah2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.demojpah2.model.Student;
import com.learning.demojpah2.repository.StudentRepository;

@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/fetchAllStudents")
	public ModelAndView fetchAllStudents() {
		ModelAndView mv=new ModelAndView("showView.jsp");
		
		List<Student> studentList=(List<Student>) studentRepository.findAll();
		mv.addObject("students", studentList);
		
		return mv;
	}
}
