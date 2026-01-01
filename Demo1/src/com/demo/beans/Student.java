package com.demo.beans;

import java.util.Set;

public class Student {
	
	private int id;
	private String name;
	private int rollNo;
	private int marks;
	
	
	public Student() {
		super();
	}
	
	public Student(int id,String name,int rollNo,int marks) {
		super();
		this.id=id;
		this.name=name;
		this.rollNo=rollNo;
		this.marks=marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public void add(Set<Student> eset) {
		// TODO Auto-generated method stub
		
	}

	
	}


