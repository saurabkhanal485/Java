package com.demo.test;
import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.enums.Gender;
import com.demo.enums.Coffee;

public class TestPerson {

    public static void main(String[] args) {

        
        Person p = new Person(23, "Saurabh", Gender.male);
        System.out.println(p);

        
        for (Gender g : Gender.values()) {
            System.out.println(g);
        }

        
        for (Coffee c : Coffee.values()) {
            System.out.println(c);
        }

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter id");
        int id = sc.nextInt();

        System.out.println("Enter Name");
        String nm = sc.next();

        System.out.println("Enter gender");
        String gender = sc.next();

        System.out.println("Enter Coffee size");
        String sizeStr = sc.next(); 

        System.out.println("Enter Coffee Price");
        double price = sc.nextDouble();

        Gender g1 = Gender.valueOf(gender);

       
        Person p2 = new Person(id, nm, g1);

        
        Coffee c3 = Coffee.valueOf(sizeStr); 

        
        System.out.println(p2);
        System.out.println(g1);
        System.out.println(c3);
        System.out.println("Coffee Price: " + price);

        
        sc.close();
    }
}
