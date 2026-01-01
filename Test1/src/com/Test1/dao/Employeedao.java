package com.Test1.dao;


	
	

	import java.util.List;

	import com.Test1.beans.Employee;

	public interface Employeedao {

		boolean save(Employee e);

		List<Employee> findAll();

		Employee findById(int eid);

		boolean deleteById(int eid);

		List<Employee> findByName(String nm);
		
		List<Employee> sortBySal();

		List<Employee> sortByName();

		List<Employee> sortById();

	}



