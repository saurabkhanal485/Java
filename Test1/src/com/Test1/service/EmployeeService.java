package com.Test1.service;

import java.util.List;

import com.Test1.beans.Employee;

public interface EmployeeService {
	
	boolean addNewEmployee();
	
	List<Employee> displayAll();
	
	Employee searchById(int id);
	
	Employee deleteById(int id); 
	
	List<Employee> findByName(String nm);
	
	
	
	

}
