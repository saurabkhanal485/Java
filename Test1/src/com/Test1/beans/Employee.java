package com.Test1.beans;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	
	private int id;
	private String ename;
	private double sal;
	private LocalDate jdt;
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(int id) {
		super();
		this.id=id;
	}
	
	
	public Employee(int id,String name, double sal, LocalDate jdt) {
		super();
		this.id=id;
		this.ename=name;
		this.sal=sal;
		this.jdt=jdt;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals method "+this.id+"----"+((Employee)obj).id);
		return this.id==((Employee)obj).id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public LocalDate getJdt() {
		return jdt;
	}

	public void setJdt(LocalDate jdt) {
		this.jdt = jdt;               
	}

	
	          
	                                       
	
	@Override
	public String toString() {
		return "id:"+id +"Name:"+ename + "Sal:"+sal+ "JDT:" +jdt;
	}
     
	public int compareTo(Employee ob) {
		System.out.println("in ComapreTo method:"  + this.id+"---"+ob.id);
		System.out.println("Salary->"+this.sal+"---"+ob.sal);
		
		
		return (int)(this.sal-ob.sal);
	}
	
	
	

}
