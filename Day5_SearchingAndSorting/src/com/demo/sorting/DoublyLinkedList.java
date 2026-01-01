package com.demo.sorting;

public class DoublyLinkedList {
	class Node {
		int data;
		Node prev, next;
		
		public Node(int data) {
			this.data=data;
			prev=null;
			next=null;
		}
	}
	Node head;
	public DoublyLinkedList() {
		head=null;
	}
	
	public void addNewNode(int value) {
		Node newNode = new Node(value);
		
		if(head==null) {
			head=newNode;
		}
		
		else {
			Node temp=head;
			
			while(temp.next!=null) {
				temp=temp.next;
			}
			
			newNode.prev=temp;
			temp.next=newNode;
		}
	}
	
	public void addByPosition(int pos,int val) {
		Node newNode = new Node(val);
		if(pos==1) {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
		else {
			Node temp=head;
			
			for(int i=0; temp!=null && i<pos-2; i++) {
				temp=temp.next;
			}
			
			if(temp != null) {
			newNode.prev=temp;
			newNode.next=temp.next;
			temp.next=newNode;
			temp.next.prev=newNode;
			}
			else {
				System.out.println("Position beyond the limits"); 
				
				
			}
		}
		
	}
	public void deleteByValue(int val) {
		Node temp =head;
		
		if(head.data==val) {
			head.next.prev=null;
			head=temp.next;
			temp.next=null;
		}
		else {
			while(temp!=null && temp.data!=val) {
				temp=temp.next;
			}
			
			if(temp!=null) {
				temp.prev.next=temp.next;
				if(temp.next!=null) {
					temp.next.prev=temp.prev;
					temp.next=null;
				}
				temp.prev=null;       
			}else {
				System.out.println(val + "Not Found!");
			}
		}
	}
	
	public void displayData() {
		Node temp=head;
		
		while(temp!=null) {
			System.out.println(temp.data + "---------->");
			temp=temp.next;
		}
		System.out.println("null");
		
	}
}
