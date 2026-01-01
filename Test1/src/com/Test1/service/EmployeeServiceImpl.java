package com.Test1.service;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.Test1.beans.Employee;
import com.Test1.dao.EmployeeDaoImpl;

public  class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDaoImpl edao;
	
	public EmployeeServiceImpl() {
		edao=new  EmployeeDaoImpl();
	}

	@Override
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		
		String n = sc.next();
		
		System.out.println("Enter Salary");
		double sal=sc.nextDouble();
		
		
		System.out.println("Enter Date (dd/mm/yyyy)");
		
		String jdt=sc.next();
		LocalDate ldt=LocalDate.parse(jdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(id,name,sal,ldt);
		return edao.save(e);
	

		
		
		
	}

	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}

	@Override
	public Employee deleteById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return edao.findByName(name);
	}
	
	
	

}
