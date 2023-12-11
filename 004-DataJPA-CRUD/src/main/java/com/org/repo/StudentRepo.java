package com.org.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.org.entity.Student;
import java.util.List;



public interface StudentRepo extends CrudRepository<Student, Integer> {
	

//	                findByXXX() methods
	
	// select * from Student where result >= marks;
	public List<Student> findByResultGreaterThanEqual(double marks);
	
	// select * from Student where gender = gender;
	public List<Student>  findByGender(String gender);
	
	// select * from Student where result < marks;
	public List<Student> findByResultLessThan(double marks);
	
	
	
//	                 Custom Queries
	
//	             sql queries
	  @Query(value = "select * from student" , nativeQuery = true)
	  public List<Student> getAllStudent();
	  
	  @Query(value = "select s_name from student", nativeQuery = true)
	  public List<String> getStudentName();
	  
//	             hql queries
	  @Query(value = "From Book")
	  public List<Student> getStudents();
}
