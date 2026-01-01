package com.demo.test;
import com.demo.beans.Employee;
import com.demo.service.*;
import java.util.*;
public class TestCrudDemo {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	EmployeeService eService = new EmployeeServiceImplementation();
	eService.readFile("empdata1.txt");
	int choice=0;
	do {
	System.out.println("1. add new Employee\n2. delete by id\n");
	System.out.println("3. modify by id\n4.display all\n5. display by id\n6. exit\nchoice: ");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1->{
		boolean status=eService.addNewEmployee();
		if(status) {
			System.out.println("Employee Added Successfully");
		}
		else {
			System.out.println("Error while adding employee");
		}
		
	}
	case 2->{
		System.out.println("Enter Id: ");
		int empid =sc.nextInt();
		
		boolean status =eService.deleteById(empid);
		if(status) {
			System.out.println("Successfully Deleted !!");
		}
		else {
			System.out.println("Error While Deleting");
		}
		
	}
	case 3->{
		System.out.println("Enter Employee Id:");
		int empid=sc.nextInt();
		System.out.println("Enter Employee Salary : ");
		double sal=sc.nextDouble();
		boolean status=eService.modifyById(empid, sal);
		
		if(status) {
			System.out.println("Modified Successfully:");
		}
		else {
			System.out.println("Error While modifying...");
		}
		
	}
	case 4->{
		List<Employee> lst=eService.displayAll();
		lst.forEach(System.out::println);
		
	}
	case 5->{
		System.out.println("Enter Employee id : ");
		int empid=sc.nextInt();
		Employee ob=eService.getById(empid);
		if(ob!=null) {
			System.out.println(ob);
		}
		else {
			System.out.println("Not Found");
		}
		
	}
	case 6-> {
		eService.writeToFile("empdata1.txt");
		System.out.println("Thank You For Visiting!!!");
		
	}
	default -> {
		System.out.println("Wrong Choice");
	}
	}
	
	}while(choice!=6);
	}
}
