package com.learning.demojpah2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learning.demojpah2.model.Employee;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoJpaH2Application.class, args);
	}
}
