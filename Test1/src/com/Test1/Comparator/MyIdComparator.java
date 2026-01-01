package com.Test1.Comparator;

import java.util.Comparator;

import com.Test1.beans.Employee;

public class MyIdComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getId() - o2.getId();
	}
	
	

}
