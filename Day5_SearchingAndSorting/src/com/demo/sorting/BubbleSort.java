package com.demo.sorting;

import java.util.Arrays;
public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		 int n = arr.length;
		 
		 while(n!=0) {
			 for (int i =1; i<arr.length; i++) {
				 if (arr[i-1] > arr [i]) {
					 //swap the elements
					 int temp = arr[i-1];
					 arr [i-1] = arr[i];
					 arr[i] =temp;
					 
				 }
			 }
			 
			 System.out.println("ITerations are : " + n);
			 n--;
			 System.out.println(Arrays.toString(arr));
		 }
	}
	
	public static void bubbleSortImproved(int[] arr) {
		for (int i=0; i < arr.length; i++) {
			boolean flag=false;
			for (int j=1;  j < arr.length -i ; j++) {
				if(arr[j-1] > arr [j]) {
					flag=true;
					int temp = arr [j-1];
					arr[j-1] = arr [j];
					arr[j]=temp;
				}
			}
			
			System.out.println("Iterations are : " + i);
			System.out.println(Arrays.toString(arr));
			
			if(!flag) {
				break;
			}
			
			
		}
	}
	
	public static void bubbleSortDescending(int[] arr) {
		for(int i = 0 ; i<arr.length; i++) {
			boolean flag=false;
			for(int j =1; j < arr.length -i; j++) {
				if(arr[j-1] < arr[j]) {
					flag=true;
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]= temp;
				}
			}
			System.out.println("Iterations are :" + i);
			System.out.println(Arrays.toString(arr));
		 if(!flag) {
			break;
		}
	}
	}
}

