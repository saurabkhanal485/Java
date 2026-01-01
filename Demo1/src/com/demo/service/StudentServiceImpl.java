package com.demo.service;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.*;

import com.demo.dao.Studentdao;
import com.demo.dao.StudentdaoImpl;
public class StudentServiceImpl implements StudentService {

	
	
		
		private Studentdao edao;
		
		public StudentServiceImpl() {
			super();
			this.edao=new StudentdaoImpl();
		}
		
		public boolean addNewStudent() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Id:");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			 String name=sc.next();
			 System.out.println("Enter Roll No:");
			 int rollNo=sc.nextInt();
			 System.out.println("Enter Marks");
			 int marks=sc.nextInt();
			 
			 Student s=new Student(id,name,rollNo,marks);
			 
			return edao.save(s);
	}

		@Override
		public Set<Student> displayAll() {
			
			return edao.findAll();
		}

		@Override
		public Student displayById(int id) {
			return edao.findById(id);
			
		}

		@Override
		public Set<Student> displayByName(String name) {
			// TODO Auto-generated method stub
			return edao.findByName(name);
		}

		@Override
		public boolean updateByMarks(int id, int marks) {
			// TODO Auto-generated method stub
			return edao.updateByMarks(id,marks);
		}

		@Override
		public boolean deleteById(int id) {
			// TODO Auto-generated method stub
			return edao.deleteById(id);
		}

		@Override
		public boolean deleteByMarks(int marks) {
			// TODO Auto-generated method stub
			return edao.deleteByMarks(marks);
		}

		@Override
		public boolean searchByRollno(int rollNo) {
			// TODO Auto-generated method stub
			return edao.searchByRollno(rollNo);
		}

		@Override
		public List<Student> sortByrollNo() {
			// TODO Auto-generated method stub
			return edao.sortByrollNo();
		}

}
