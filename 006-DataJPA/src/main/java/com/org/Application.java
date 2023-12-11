package com.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.org.dao.CouresDao;
import com.org.entity.Course;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		CouresDao dao = context.getBean(CouresDao.class);
		
		Course c = new Course();
		c.setCname("Spring");
		c.setCprice(6000.0);
		c.setDuration("4 months");
		
		dao.save(c);
	}

}
 