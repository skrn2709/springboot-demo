package com.learning.demojpah2.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.demojpah2.dao.StudentDao;
import com.learning.demojpah2.daoimpl.StudentDaoImpl;
import com.learning.demojpah2.model.Student;
import com.learning.demojpah2.service.StudentService;
@Component
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	public List<Student> fetchAllStudents(){
		return studentDao.fetchAllStudents();
	}
}
