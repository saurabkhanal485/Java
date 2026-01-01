package com.demo.beans;

public class MyClass {
	
	private int x;
	
	public MyClass() {
		super();
		this.x=5;
	}
	
	synchronized public int factorial(int n) {
		x=x+10;
		int fact=1;
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("at the end of factorial"+x);
		return fact;
	}
	
	synchronized public void printTable(int n) {
		x=x+20;
		
		for(int i=2;i<=10;i++) {
			System.out.println(n+"*"+i+"="+(n*i));
			try {
				Thread.sleep(250);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("at the end of printtable"+x);
	}
	
	synchronized public boolean checkPrime(int n) {
		x=x+30;
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(250);
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(n%i==0) {
				
				System.out.println("is a prime number"+x);
				return false;
				
			}
		}
		System.out.println("at the end of check prime no"+x);
		return true;
	}

}
