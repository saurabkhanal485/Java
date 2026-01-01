package com.Test1.test;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Optional;

import com.Test1.beans.Employee;

public class TestArrayList {
	
	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>();
		elist.add(new Employee(12,"Rajesh",45678,LocalDate.of(2025,02,10)));
		elist.add(new Employee(13,"Rashmi",56678,LocalDate.of(2025,07,10)));
		elist.add(new Employee(12,"Amit",35678,LocalDate.of(2025,03,10)));
		
		
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		
		System.out.println("-------------");
		
		for(Employee e:elist) {
			System.out.println(e);
		}
		
		System.out.println("---------------");
		Iterator<Employee> it=elist.iterator();
		
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
		
		ListIterator<Employee> it1=elist.listIterator();
		
		elist.forEach(System.out::println);
		
		int id=13;
		Optional<Employee> op=elist.stream().filter(emp->emp.getId()==id).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("Not found");
		}
	}

}
