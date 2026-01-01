package com.demo.test;
import java.util.List;
import java.util.Optional;

public class TestStreamFunctions {
	public static void main(String[] args) {
		List<Integer>lst=List.of(24,6,79,99,87,76);
		Optional<Integer> MaxNum=lst.stream().max(Integer::compare);
		System.out.println(MaxNum.get());
		
		Optional<Integer> MinNum=lst.stream().min(Integer::compare);
		System.out.println(MinNum.get());
	}
}
