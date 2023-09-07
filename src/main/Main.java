package main;


import main.Basic_algorithms.Binary_Search;
import main.Basic_algorithms.Depth_First_Search;
import main.Basic_algorithms.Linear_Search;
import main.Basic_algorithms.Recursion_algo;
import main.Basic_algorithms.Two_Pointers;
import main.MyAlgos.PrintTable;
import main.ObjectClass.TreeNode;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------App Started--------");
		
		/* ------    Array Used     -------*/
//		int[] array = new int[] { 1, 2, 4, 6, 9, 9, 61, 85 };
		int[] array = new int[] { 6,18,12,19,19,20 };
		System.out.print("Array: [ ");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println(" ]");
		
		
		/* ------     Tree Used     -------*/
		TreeNode root = new TreeNode(30);
		root.left = new TreeNode(20);
		root.left.left = new TreeNode(10);
		root.left.right = new TreeNode(32);
		root.left.left.right= new TreeNode(34);
		root.right = new TreeNode(3);
		
		
		
		
		/* OVERVIEW */
		
//		1.	LINEAR SEARCH
//		Linear_Search.findElement(array, 8);
		
//		2.	BINARY SEARCH
//		Binary_Search.findElement(array,20);
		
//		3. TWO POINTERS
//		Two_Pointers.findTwoElements(array, 38);
		
//		4. RECURSION
//		Recursion_algo.calcSum(100);
		
//		5. DEPTH FIRST SEARCH
//		System.out.println("\n-------(inOrder)-------");
//		Depth_First_Search.inOrder(root);
		
//		System.out.println("\n-------(preOrder)-------");
//		Depth_First_Search.preOrder(root);
		
//		7. Print a Table of any numbers
//		PrintTable.table(29);
	}

}
