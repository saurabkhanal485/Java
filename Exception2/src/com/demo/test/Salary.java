package com.demo.test;
import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<3;i++) {
			try {
				System.out.println("Enter Salary");
				double sal=sc.nextInt();
				
				if(sal<0) {
					throw new NullPointerException("Sal cannot be negative");
				}
				System.out.println("Salary:"+sal);
				break;
			}catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
