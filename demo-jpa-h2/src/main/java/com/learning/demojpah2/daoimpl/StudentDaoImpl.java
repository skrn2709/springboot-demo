package com.learning.demojpah2.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learning.demojpah2.dao.StudentDao;
import com.learning.demojpah2.model.Student;
import com.learning.demojpah2.repository.StudentRepository;
@Component
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> fetchAllStudents() {
		// TODO Auto-generated method stub
		List<Student> students=(List<Student>) studentRepo.findAll();
		return students;
	}

}
