package com.demo.test;
import java.util.stream.IntStream;

import java.util.Arrays;

import com.demo.Arrays.MyArray;
public class TestArray {
	public static void main(String[] args) {
	MyArray ob=new  MyArray();
	
	System.out.println("Capacity : " + ob.getCapacity());
	ob.add(10);
	ob.add(20);
	ob.add(30);
	ob.add(40);
	
	ob.add(20, 1);
	
	ob.add(30, 2);
	
	System.out.println(ob);
	
	
	System.out.println("position of 10 : "+ob.searchByValue(10));
	ob.add(3);
	ob.add(5);
	System.out.println(ob);
	ob.deleteByValue(7);
	System.out.println(ob);
	ob.add(1);
	System.out.println(ob);
	ob.deleteByPos(1);
	System.out.println(ob);
	int[] arr1=ob.exchangeIndexValue();
	IntStream.of(arr1).forEach(e->System.out.print(e+","));
	arr1=ob.reverseArray(true);
	System.out.println(ob);
	IntStream.of(arr1).forEach(e->System.out.print(e+","));
	ob.rotateArray(false, 3);
	System.out.println(ob);
	}
}
