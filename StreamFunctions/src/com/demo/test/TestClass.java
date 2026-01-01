package com.demo.test;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class TestClass {

	public static void main(String[] args) {
		List<Integer> lst=List.of(23,45,678,9,56,7);
		Predicate<Integer> p1=e->e>10;
		lst.stream().filter(p1).forEach(System.out::println);
		
		
		Supplier<String> s=()->{String[] str= {"hello","welcome"};
		int x=(int) Math.random()*2+1;
		
		return str[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		
		List<Integer> lst2 = List.of(54,71,87,44,69);
		Predicate<Integer> p2= e -> e <71;
		
		lst.stream().filter(p2).forEach(System.out::println);
		
		Supplier<String> s2 = () -> {String[] str2 = {"Text1", "Text2", "Text3","Text4"};
		
			int x = (int) Math.random()*2 +1;
			return str2[x];
		};
		System.out.println(s2.get());
		System.out.println(s2.get());
		
	}
}
