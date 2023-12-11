package com.org.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.entity.Employee;
import com.org.repository.EmpDao;

@Controller
public class MyController {

	@Autowired
	private EmpDao dao;
	
	@GetMapping("/employee")
	public ModelAndView getEmpById(@RequestParam("eid") Integer id) {
		ModelAndView mav = new ModelAndView();
		
		Optional<Employee> emp1 = dao.findById(id);
		if(emp1.isPresent()) {
			Employee employee = emp1.get();
			mav.addObject("emp", employee);
		}
		mav.setViewName("index");
		return mav;
	}
}
