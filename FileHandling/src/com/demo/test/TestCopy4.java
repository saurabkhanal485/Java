package com.demo.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestCopy4 {

	public static void main(String[] args) {
		File f =new File("myFileCopy.txt");
		FileOutputStream fos = null;
		
		try {
			if(f.exists()) {
				fos = new FileOutputStream ("myFileCopy.txt", true);
			} 
			else {
				fos = new FileOutputStream ("myFileCopy.txt");
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
		try(FileInputStream fis =new FileInputStream("gaikwad.txt");
				 FileOutputStream fos1 = fos){
			int i = fis.read();
			while(i!=1) {
				fos1.write(i);
				i = fis.read();
				
			}
		}
		
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

