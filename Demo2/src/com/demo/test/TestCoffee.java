package com.demo.test;



import com.demo.enums.Coffee;

public class TestCoffee {
	
	public static void main(String [] args) {
		Coffee c=Coffee.small;
		
		switch(c) {
		case small->{
			System.out.println("small selected"+c.getSize()+"---->"+c.getPrice());
		}
			
			case medium->{
				System.out.println("medium selected"+c.getSize()+"---->"+c.getPrice());
			
		}
			
			case large->{
				System.out.println("large selected"+c.getSize()+"----->"+c.getPrice());
				
			}
		}
		
		
	}

}
