package com.org;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.entity.Student;
import com.org.repo.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		List<Student> list = repo.findByGender("male");
		
		for(Student s : list)
			System.out.println(s);
	}

}
