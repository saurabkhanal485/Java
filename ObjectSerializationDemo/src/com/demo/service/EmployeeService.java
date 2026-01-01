package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {
	void readFile(String fname);
	boolean addNewEmployee();
	boolean deleteById(int empid);
	List<Employee> displayAll();
	boolean modifyById(int empid, double sal);

	Employee getById(int empid);

	void writeToFile(String string);
}
