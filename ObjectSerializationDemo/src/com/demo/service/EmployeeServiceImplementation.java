package com.demo.service;

import java.util.*;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImplementation;
import com.demo.beans.*;
public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeDao edao;
	
	public EmployeeServiceImplementation(){
		super();
		this.edao = new EmployeeDaoImplementation();
	}
	@Override 
	public void readFile(String fname) {
		edao.readData(fname);
		
	}
	public boolean addNewEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id: ");
		int empid=sc.nextInt();
		System.out.println("Enter Employee Name: ");
		String nm=sc.next();
		System.out.println("Enter Employee Designation: ");
		String desg=sc.next();
		System.out.println("Enter sal");
		int sal = sc.nextInt();
		Employee e = new Employee(empid, nm, desg, sal);
		return edao.save(e);
	}

	@Override
	public boolean deleteById(int empid) {
		return edao.removeById(empid);
	}
	
	@Override
	public boolean modifyById(int empid, double sal) {
		return edao.updateById(empid,sal);
	}
	@Override
	public List<Employee> displayAll() {
		// TODO Auto-generated method stub
		return edao.findAll();
	}
	
	public Employee getById(int empid) {
		return edao.findById(empid);
	}
	
	public void writeToFile(String fname) {
		edao.writeData(fname);
	}
}
