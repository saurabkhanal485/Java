package com.demo.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.MyClass;
public class TestMyClass {
	
	public static void main(String[] args) {
		MyClass obj =new MyClass(12,101);
		Class cls = obj.getClass();
		Constructor[] carr = cls.getConstructors();
		for (Constructor c : carr) {
			System.out.println("In c.GetName() :" + c.getName());
			System.out.println( "In c.getParameters() : "+ c.getParameterCount());
		}
		
		Method[] marr = cls.getMethods();
		
		for (Method m : marr) {
			System.out.println(m.getName());
			if(m.getName().equals("m1")) {
				try {
					m.invoke(obj, 12);
				}
				catch(IllegalAccessException e) {
					e.printStackTrace();
				}
				catch(InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		Field[] farr = cls.getDeclaredFields();
		for (Field f : farr) {
			if(f.getName().equals("n1")) {
				f.setAccessible(true);
			}
			System.out.println(f.getName());
		}
		try {
			Field f = cls.getDeclaredField("n1");
			System.out.println("Before Changing: ");
			System.out.println(obj);
			f.setAccessible(true);
			f.set(obj, 100);
			System.out.println("After Changing:");
			System.out.println(obj);
		}
		catch (NoSuchFieldException | SecurityException e) {
			
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
		
			e.printStackTrace();
		} catch (IllegalAccessException e) {
		
			e.printStackTrace();
		}
		
	}

}
