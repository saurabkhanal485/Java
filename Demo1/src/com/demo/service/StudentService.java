package com.demo.service;

import java.util.List;
import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

	boolean addNewStudent();

	Set<Student> displayAll();

	Student displayById(int id);

	Set<Student> displayByName(String name);

	boolean updateByMarks(int id, int marks);

	boolean deleteById(int id);

	boolean deleteByMarks(int marks);

	boolean searchByRollno(int rollNo);

	
	List<Student> sortByrollNo();

}
