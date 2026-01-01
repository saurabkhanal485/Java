package com.demo.sorting;
import java.util.stream.IntStream;

import com.demo.sorting.BubbleSortAlgorithm;

public class TestBubbleSort {
	
	public static void main(String[] args) {
		int[]arr= {22,4,66,88,44,89,45};
		//BubbleSortAlgorithm.BubbleSort(arr);
BubbleSortAlgorithm.bubbleSortImprovedDescending(arr);
//BubbleSortAlgorithm.ImprovedBubbleSort(arr);
IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
BubbleSortAlgorithm.bubbleSortImprovedAscending(arr);
IntStream.of(arr).forEach(e->System.out.println(e + "\t"));
	}

}
