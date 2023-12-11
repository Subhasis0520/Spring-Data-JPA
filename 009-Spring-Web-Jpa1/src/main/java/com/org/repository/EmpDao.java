package com.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.Employee;

public interface EmpDao extends JpaRepository<Employee, Integer>{

}
