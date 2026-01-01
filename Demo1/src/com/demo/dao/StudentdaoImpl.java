package com.demo.dao;

import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import java.util.Set;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentdaoImpl implements Studentdao {
	static Set<Student> eset;
    static{eset=new HashSet<>();
          eset.add(new Student(105,"Amit",575,95));
          eset.add(new Student(106,"Ajay",565,89));
          eset.add(new Student(100,"Arti",555,46));
         eset.add(new Student(101,"Anita",465,37));
         eset.add(new Student(103,"Ajay",999,77));
         eset.add(new Student(104,"Ajay",777,76));
    }

	@Override
	public boolean save(Student s) {
		return eset.add(s);
	}

	@Override
	public Set<Student> findAll() {
		return eset;
		
	}

	@Override
	public Student findById(int id) {
		
		for(Student e : eset) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}

	@Override
	public Set<Student> findByName(String name) {
		Set<Student> e = new HashSet<>();
	   for(Student e1 : eset) 
		   if(e1.getName().equals(name)) {
				   e1.add(eset);
			   }
		   
		return null;
	}

	@Override
	public boolean updateByMarks(int id, int marks) {
		Student e = findById(id);
		if(e != null) {
			e.setMarks(marks);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		return eset.removeIf(e -> e.getId() == id);
	
	}
	
	public boolean deleteByMarks(int marks) {
		return eset.removeIf(e -> e.getMarks()==marks);
	}

	@Override
	public boolean searchByRollno(int rollNo) {
	    
	    return eset.stream().filter(e -> e.getRollNo() == rollNo).findFirst().isPresent();
	}

	@Override
	public List<Student> sortByrollNo() {
		Set<Student> tset=new TreeSet<>();
		tset.forEach(System.out::println);
			
		
		for(Student e:tset) {
			tset.add(e);
			System.out.println("in treeset: " + e);
		}
		System.out.println("In Sort By roll no method" + "\n");
		tset.forEach(System.out::println);
		return new ArrayList<>(tset);
		
	}
		
	}


