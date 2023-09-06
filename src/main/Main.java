package main;

import main.Basic_algorithms.Binary_Search;
import main.Basic_algorithms.Linear_Search;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------Main Started--------");
		//----------------------{ 0, 1, 2, 3, 4, 5,  6,  7 };
		int[] array = new int[] { 1, 2, 4, 6, 9, 9, 61, 85 };
		int ind=0;
		
		
		/* OVERVIEW */
//		1.	LINEAR SEARCH
//		Linear_Search.findElement(array, 5);
//		2.	BINARY SEARCH
//		ind = Binary_Search.findElement(array,85);

		
		
		

		/*---------------------Linear Search Starts--------------------------*/

//		When single element is present
//		linearSearch.findElement(array, 5);

//		When multiple elements are present
//		linearSearch.findElement(array, 6);

//		When element is not present
//		linearSearch.findElement(array, 10);
		/*---------------------Linear Search Ends--------------------------*/


//		When single element is present in last
//		ind = Binary_Search.findElement(array,85);

//		When multiple elements are present
//		ind = Binary_Search.findElement(array,9);

//		When element is not present
//		ind = Binary_Search.findElement(array, 5);

		if (ind != -1) {
			System.out.println("Element present at index: " + ind);
		} else {
			System.out.println("Element not prensent in array!");
		}

		/*---------------------Binary Search Ends--------------------------*/
	}

}
