package com.orderManagementSystem.test;
import java.util.List;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.orderManagementSystem.beans.Customer;
import com.orderManagementSystem.beans.Item;
import com.orderManagementSystem.service.OrderService;
import com.orderManagementSystem.service.OrderServiceImplementation;
public class TestOrderManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		OrderService oService = new OrderServiceImplementation();
		int choice=0;
		
		
		do {
			System.out.println("1. add new customer\n2. display all\n3. display by customer");
			System.out.println("4. delete customer\n5. add a new item in existing order");
			System.out.println("6. delete item from existing order\n7.exit\n choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1 -> {
				boolean status = oService.addNewCustomer();
				if(status) {
					System.out.println("Customer Added Successfully");
				}
				else {
					System.out.println("Not Added");
				}
			}
			case 2->{
				Map<Customer, List<Item>> omap = oService.displayAll();
				Set<Customer> keys = omap.keySet();
				keys.forEach(c->System.out.println( c + "-----" + omap.get(c)));
				
			}
			
			case 3->{
				System.out.println("Enter Customer id");
				int cid=sc.nextInt();
				Map.Entry<Customer, List<Item>> data=oService.findByCustomer(cid);
				if(data!=null) {
					System.out.println(data.getKey()+"------->"+data.getValue());
					
				}else {
					System.out.println("Not Found");
				}
			}
				case 4->{
					System.out.println("Enter Customer id");
					int cid=sc.nextInt();
					boolean status=oService.deleteById(cid);
					if(status) {
						System.out.println("deleted Successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 5->{
					System.out.println("enter customer id");
					int cid=sc.nextInt();
					System.out.println("enter Item id");
					int iid=sc.nextInt();
					System.out.println("enter item name");
					String inm=sc.next();
					System.out.println("enter qty");
					int qty=sc.nextInt();
					System.out.println("enter Item price");
					double price=sc.nextDouble();
					boolean status=oService.addNewItem(cid,new Item(iid,inm,qty,price));
					if(status){
						System.out.println("added successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 6->{
					System.out.println("enter customer id");
					int cid=sc.nextInt();
					System.out.println("enter Item id");
					int iid=sc.nextInt();
					boolean status=oService.removeItemById(cid,iid);
					if(status){
						System.out.println("deleted successfully");
					}else {
						System.out.println("not found");
					}
				}
				case 7-> {
					sc.close();
					System.out.println("ThankYou For Visiting!");
				}
			}
			}while(choice!=7);
	}

}

			
				
			
			
		

	

