package com.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy2 {

	public static void main(String[] args) {
	try(FileInputStream fis = new FileInputStream("myFile.txt");
		FileOutputStream fos = new FileOutputStream("myFileCopy.txt");
			){
		int i = fis.read();
		while(i!=-1) {
			fos.write(i);
			i = fis.read();
		}
		
	}
	catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
	}
}
