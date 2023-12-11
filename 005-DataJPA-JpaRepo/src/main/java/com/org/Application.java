package com.org;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.org.entity.Employee;
import com.org.repository.EmpRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context 
		                 = SpringApplication.run(Application.class, args);
		
		EmpRepo repo = context.getBean(EmpRepo.class);
		
		Employee e = new Employee();
		e.setGender("Male");
		e.setDept("IT");
		
		Example<Employee> ex = Example.of(e);
		
		List<Employee> list = repo.findAll(ex);
		list.forEach(System.out :: println);
	}

}
