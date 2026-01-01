package com.demo.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;

public class TestDataStream {
	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("myFile.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("myFile.txt"))
				){
			dos.writeDouble(3456.32);
			dos.writeInt(777);
			dos.writeUTF("Rajan");
			
			System.out.println("Writing data to file successfull!!" + "\n");
			
			System.out.println("Readind data Started :" + "\n");
			
			double num=dis.readDouble();
			int num1= dis.readInt();
			String nm=dis.readUTF();
			
			System.out.println(num + "------" + num1 + "--------" + nm);
			
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
