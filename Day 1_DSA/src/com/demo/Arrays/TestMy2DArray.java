package com.demo.Arrays;

public class TestMy2DArray {
	
	public static void main(String [] args) {
		My2DArray ob1=new My2DArray();
		My2DArray ob2=new My2DArray();
		ob1.acceptData();
		ob1.displayData();
		ob1.RowRotation(true, 1);
		ob1.displayData();
		ob1.RowRotation(false, 1);
		ob1.displayData();
		
		ob1.ColumnRotation(true, 1);
		ob1.displayData();
		ob1.ColumnRotation(false, 1);
		ob1.displayData();
		
		
		int [][] arr=ob1.transpose();
		displayarray(arr);
		
		
		if(ob1.isSymmetric()) {
			System.out.println("symmetric matrix");
		}else {
			System.out.println("not symmetric matrix");
		}
		
		if(ob1.isIdentity()) {
			System.out.println("Identity matrix");
		}else {
			System.out.println("not Identity matrix");
		}
	}

	private static void displayarray(int[][] arr) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	

}
