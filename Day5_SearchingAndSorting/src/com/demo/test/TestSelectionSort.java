package com.demo.test;

import com.demo.sorting.SelectionSort;

public class TestSelectionSort {

	public static void main(String[] args) {
		int[] arr= {15,13,30,20,5,7,21,2};
		//SelectionSortAlgorithm.selectionSortAscending(arr);
		SelectionSort.selectionSortDescending(arr);
	}

}
