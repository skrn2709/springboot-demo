package com.learning.demojpah2.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "EMPLOYEE_TBL")
public  class Employee {
	@Id
	private int id;
	private int age;
	private String mobile;
	private String email;
	private String address;
	
}
