package com.demo.dao;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface Studentdao {

	boolean save(Student s);

	Set<Student> findAll();

	Student findById(int id);

	Set<Student> findByName(String name);

	boolean updateByMarks(int id, int marks);

	boolean deleteById(int id);

	boolean deleteByMarks(int marks);

	boolean searchByRollno(int rollNo);

	
	

	List<Student> sortByrollNo();

	

}
