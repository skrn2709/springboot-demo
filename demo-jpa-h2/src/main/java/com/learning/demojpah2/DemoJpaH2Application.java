package com.learning.demojpah2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.demojpah2.model.Employee;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

//	@EnableSwagger2  
// 	swagger on main class (Method I for documenting api's)
//	....Method II check in config package

public class DemoJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaH2Application.class, args);
	}
}
