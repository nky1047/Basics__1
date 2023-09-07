package main;

import main.Basic_algorithms.Binary_Search;
import main.Basic_algorithms.Linear_Search;
import main.Basic_algorithms.Two_Pointers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Main Started--------");
		//----------------------{ 0, 1, 2, 3, 4, 5,  6,  7 };
		int[] array = new int[] { 1, 2, 4, 6, 9, 9, 61, 85 };
		
		System.out.print("Array: [ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ]");
		
		/* OVERVIEW */
		
//		1.	LINEAR SEARCH
//		Linear_Search.findElement(array, 5);
//		2.	BINARY SEARCH
//		ind = Binary_Search.findElement(array,85);

		
		
		

		/*---------------------Linear Search Starts--------------------------*/

//		When single element is present
		Linear_Search.findElement(array, 5);

//		When multiple elements are present
//		linearSearch.findElement(array, 6);

//		When element is not present
//		linearSearch.findElement(array, 10);
		/*---------------------Linear Search Ends--------------------------*/

		/*---------------------Binary Search Ends--------------------------*/
//		When single element is present in last
		Binary_Search.findElement(array,85);

//		When multiple elements are present
//		ind = Binary_Search.findElement(array,9);

//		When element is not present
//		ind = Binary_Search.findElement(array, 5);		
		/*---------------------Binary Search Ends--------------------------*/
		
		/*---------------------Two Pointer Starts--------------------------*/
//		When single element is present
		Two_Pointers.findTwoElements(array, 5);

//		When multiple elements are present
//		linearSearch.findElement(array, 6);

//		When element is not present
//		linearSearch.findElement(array, 10);
		/*---------------------Two Pointer Ends--------------------------*/
	}

}
