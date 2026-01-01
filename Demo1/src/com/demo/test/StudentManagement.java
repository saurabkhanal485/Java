package com.demo.test;


import com.demo.beans.Student;
import com.demo.service.*;

import java.util.List;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		StudentService sService= new StudentServiceImpl();
		
		
		int choice=0;
		
		do {
			System.out.println("1. add new student\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update marks\n6. delete by id\n7. delete by marks\n");
			System.out.println("8. search by rollNo \n 9. sort by rollNo\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1-> {
			
			boolean status=sService.addNewStudent(); 
				if(status) {
					System.out.println("added Successfully");
				}else {
					System.out.println("not added");
				}
				}
			
			case 2->{
				Set<Student> eset=sService.displayAll();
				eset.forEach(System.out::println);
						
			}
			
			case 3->{
				System.out.println("enter id");
				int id=sc.nextInt();
				Student e=sService.displayById(id);
				if(e!=null) {
					System.out.println(e);
				}else {
					System.out.println("not found");
				}
			}
			
			
			case 4->{
				System.out.println("Enter Name");
				String name=sc.next();
				Set<Student> e=sService.displayByName(name);
				
				if(e!=null) {
				e.forEach(System.out::println);
				}else {
					System.out.println("not found");
				}
			}
					
			case 5->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				
				System.out.println("Enter marks");
				int marks=sc.nextInt();
				
				
				boolean status=sService.updateByMarks(id,marks);
					if(status) {
						System.out.println("Updated Successfully");
						
				}else {
					System.out.println("Not found");
				}
			}
			
			case 6->{
				System.out.println("Enter Id");
				int id=sc.nextInt();
				boolean status=sService.deleteById(id);
					if(status) {
						System.out.println("deleted Successfully");
					}else {
						System.out.println("error");
					}
				}
			
			case 7->{
				System.out.println("Enter marks");
				int marks=sc.nextInt();
				boolean status =sService.deleteByMarks(marks);
				if(status) {
					System.out.println("deleted Successfully");
				}else {
					System.out.println("Error");
				}
			}
			
				
			case 8->{
				System.out.println("Enter rollNo:");
					int rollNo=sc.nextInt();
					boolean status=sService.searchByRollno(rollNo);
						if(status) {
						
							System.out.println("Search Successfully");
						}else {
							System.out.println("error");
						}
				}
			
			case 9->{
				List<Student> elist=sService.sortByrollNo();
				elist.forEach(System.out::println);
				
			}
			}
				
			
			
		}while(choice!=12);
	}
}
