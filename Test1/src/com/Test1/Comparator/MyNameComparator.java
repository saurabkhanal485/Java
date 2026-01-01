package com.Test1.Comparator;

import java.util.Comparator;

import com.Test1.beans.Employee;

public class MyNameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1,Employee o2) {
		System.out.println("Compare Method");
		
		System.out.println("Names:" +o1.getEname()+"-----"+o2.getEname());
		
		return o1.getEname().compareTo(o2.getEname());
	}
	

}
