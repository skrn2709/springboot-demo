package com.learning.demojpah2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.learning.demojpah2.model.Student;
import com.learning.demojpah2.repository.StudentRepository;
import com.learning.demojpah2.service.StudentService;
import com.learning.demojpah2.serviceimpl.StudentServiceImpl;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(
			path="/",
			method=RequestMethod.GET
			)
	public String home() {
		return "home";
	}
	
	@RequestMapping(
			path="/fetchAllStudents",
			method=RequestMethod.GET
			)
	public ModelAndView fetchAllStudents() {
		ModelAndView mv=new ModelAndView("showView");
		
		//List<Student> studentList=(List<Student>) studentRepository.findAll();
		List<Student> studentList=(List<Student>) studentService.fetchAllStudents();
		
		mv.addObject("students", studentList);
		return mv;
	}
	
	@RequestMapping(
			path="/addStudent",
			method=RequestMethod.POST
			)
	public ModelAndView addStudent( Student student) {
		ModelAndView mv=new ModelAndView("home");
		
		studentService.addStudent(student);
		mv.addObject("message","added into db");
		
		return mv;
	}
	
	@RequestMapping(
			path= "/fetchStudent",
			method=RequestMethod.GET
			)
	public ModelAndView findStudent(@RequestParam int id) {
		ModelAndView mv=new ModelAndView("showView");
		List<Student> students=new ArrayList<Student>();
		
		Student student=studentService.findStudent(id);
		if(student.getId()!=0){
			students.add(student);
		}
		mv.addObject("students",students);
		
		return mv;
	}
	
	@RequestMapping(
			path="/fetchAllStudentsJson",
			method=RequestMethod.GET
					)
	@ResponseBody
	public List<Student> fetchAllStudentsJson(){
		
		List<Student> studentList=(List<Student>) studentService.fetchAllStudents();
		return studentList;
	}
	
	@RequestMapping(
			path = "/addStudentJSON",
			method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces= MediaType.APPLICATION_JSON_VALUE
			)
	@ResponseBody
	public Student addStudentJSON(@RequestBody Student student) {
		studentService.addStudent(student);
		return studentService.findStudent(student.getId());
	}
	// add header in postman
	// Content-Type: application/json
}
