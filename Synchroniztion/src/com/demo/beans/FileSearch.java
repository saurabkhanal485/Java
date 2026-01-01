package com.demo.beans;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class FileSearch {
	
	 	public boolean searchWord(String fname,String search) {
	 		
	 		try(BufferedReader br= new BufferedReader(new(FileReader(fname));) {
	 			String wrd=br.readLine();
	 			
	 			while(wrd!=null) {
	 				if(wrd.equals(search)) {
	 					return true;
	 					
	 				}else {
	 					wrd=br.readLine();
	 				}
	 			}
	 			
	 			return false;
	 			
	 		}catch(FileNotFoundException e) {
	 			e.printStackTrace();
	 			
	 		}catch(IOException e) {
	 			e.printStackTrace();
	 			
	 		}
	 		return false;
	
	 	}

}
