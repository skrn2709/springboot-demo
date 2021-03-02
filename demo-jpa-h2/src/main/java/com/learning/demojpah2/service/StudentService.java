package com.learning.demojpah2.service;

import java.util.List;

import com.learning.demojpah2.model.Student;

public interface StudentService {
	public List<Student> fetchAllStudents();

	public void addStudent(Student student);
}
