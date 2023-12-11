package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.entity.Course;

public interface CouresDao extends JpaRepository<Course, String> {

}
