package com.learning.demojpah2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.learning.demojpah2.model.Student;
@Component
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
