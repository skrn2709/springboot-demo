package com.learning.demojpah2.dao;

import java.util.List;

import com.learning.demojpah2.model.Student;

public interface StudentDao {

	List<Student> fetchAllStudents();

	void addStudent(Student student);

	Student findStudent(int id);

}
