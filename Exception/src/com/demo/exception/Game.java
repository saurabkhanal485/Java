package com.demo.exception;
import java. util.Scanner;

public class Game {
	
public static void main(String[] args) {
	
	int num =45;
	
	Scanner sc=new Scanner(System.in);
	
	while(true) {
		
		try {
		System.out.println("Enter a Number");
		
		int num1=sc.nextInt();
		
		if(num==num1) {
			System.out.println("yepee you guess it right");
			break;
		}else {
			if(num1<num) {
				throw new WrongNumberException("OOps you miss it smaller number");
			}else {
				throw new WrongNumberException("OOps you miss it larger number");
			}
		}
		}
			catch(WrongNumberException e) {
				System.out.println(e.getMessage());
			}
			
		
		}
	}}
		
	
	
	


