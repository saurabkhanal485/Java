package com.demo.test;
import com.demo.sorting.DoublyLinkedList;
public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList list1 = new DoublyLinkedList();
		list1.addNewNode(10);
		list1.addNewNode(20);
		list1.addNewNode(30);
		list1.addNewNode(40);
		list1.addNewNode(50);
		
		list1.displayData();
		System.out.println("\n");
		list1.addByPosition(6, 45);
		System.out.println("\n");
		list1.displayData();
		System.out.println("\n");
		
		list1.addByPosition(2, 60);	
		System.out.println("\n");
		list1.displayData();
		

		list1.deleteByValue(20);	
		System.out.println("\n");
		list1.displayData();
		

		list1.deleteByValue(40);	
		System.out.println("\n");
		list1.displayData();
		
		
		
		
		
		
		
	}
}
