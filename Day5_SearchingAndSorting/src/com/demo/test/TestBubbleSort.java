package com.demo.test;
import java.util.stream.IntStream;

import com.demo.sorting.BubbleSort;
public class TestBubbleSort {
	
	public static void main(String[] args) {
		int[] arr = {21, 2, 5, 1,7, 8,10,3};
		BubbleSort.bubbleSort(arr);
		BubbleSort.bubbleSortImproved(arr);
		
		BubbleSort.bubbleSortDescending(arr);
		
		IntStream.of(arr).forEach(e-> System.out.println(e + "\t"));
	}

}
