package com.orderManagementSystem.service;

import com.orderManagementSystem.beans.Item;
import com.orderManagementSystem.beans.Customer;

import com.orderManagementSystem.dao.OrderDao;

import com.orderManagementSystem.dao.OrderDaoImplementation;
import com.orderManagementSystem.service.OrderService;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.ArrayList;

public class OrderServiceImplementation implements OrderService {
	
	private OrderDao odao;
	
	public OrderServiceImplementation() {
		super();
		odao = new OrderDaoImplementation();
	}
	
	
	public boolean addNewCustomer() {
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Customer Id:");
		int cid =sc.nextInt();
		
		System.out.println("Enter Customer Name :");
		String cName= sc.next();
		
		System.out.println("Enter Customer Mobile No :");
		String mob =sc.next();
		
		Customer c =new Customer(cid, cName, mob);
		
		
		
		List<Item> lst = new ArrayList<>();
		String ans=null;
		
		do {
			System.out.println("Enter Item Id: ");
			int id=sc.nextInt();
			
			System.out.println("Enter Item Name : ");
			String inm =sc.next();
			
			System.out.println("Enter Item Quantity : ");
			int qty=sc.nextInt();
			
			System.out.println("Enter Item Price : ");
			double price = sc.nextDouble();
			
			Item item = new Item(id, inm, qty, price);
			lst.add(item);
			
			System.out.println("Do You Want to Continue : (Y/N) :  ");
			ans = sc.next();
		}while(ans.equals("y"));
		
		return odao.save(c, lst);
		
	}


	@Override
	public Map<Customer, List<Item>> displayAll() {
		
		return odao.findAll();
	}
	
	

	@Override
	public Entry<Customer, List<Item>> findByCustomer(int cid) {
	
		return odao.findById(cid);
	}


	@Override
	public boolean deleteById(int cid) {
		
		return odao.removeById( cid);
	}
	
	@Override
	public boolean addNewItem(int cid, Item item) {
		return odao.addNewItem(cid,item);
	}

	@Override
	public boolean removeItemById(int cid, int iid) {
		return odao.deleteById(cid,iid);
	}
}


	
