package main;


import main.Basic_algorithms.Binary_Search;
import main.Basic_algorithms.Breadth_First_Search;
import main.Basic_algorithms.Depth_First_Search;
import main.Basic_algorithms.Linear_Search;
import main.Basic_algorithms.Recursion_algo;
import main.Basic_algorithms.Two_Pointers;
import main.Collections.LinkedList.SinglyLinkedList;
import main.MyAlgos.PrintTable;
import main.ObjectClass.TreeNode;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------App Started--------");
		
		/* ------    Array Used     -------*/
		/*
		 * int[] array = new int[] { 6,18,12,19,19,20 }; System.out.print("Array: [ ");
		 * for(int i=0; i<array.length; i++) { System.out.print(array[i]+" "); }
		 * System.out.println(" ]");
		 */
		
		
		/* ------     Tree Used     -------*/
		/*
		 * TreeNode root = new TreeNode(30); root.left = new TreeNode(20);
		 * root.left.left = new TreeNode(10); root.left.right = new TreeNode(32);
		 * root.left.left.right= new TreeNode(34); root.right = new TreeNode(3);
		 * root.left.left.left = new TreeNode(9);
		 * 
		 * System.out.println("\t\t---Root---->"+root.key
		 * +"\n\t\t"+root.left.key+"\t\t\t"+root.right.key
		 * +"\n\t"+root.left.left.key+"\t\t"+root.left.right.key
		 * +"\n"+root.left.left.left.key+"\t\t"+root.left.left.right.key);
		 */
		
		SinglyLinkedList slist = new SinglyLinkedList();
		slist.addNode(1);
		slist.addNode(2);
		slist.addNode(3);
		slist.addNode(4);
		slist.addNode(5);
		slist.addNode(6);
		
		
//		---------------------------------------------------------------------------	
		
		/* OVERVIEW BASIC ALGORITHMS */
		
//		1.	LINEAR SEARCH
//		Linear_Search.findElement(array, 8);
		
//		2.	BINARY SEARCH
//		Binary_Search.findElement(array,20);
		
//		3. TWO POINTERS
//		Two_Pointers.findTwoElements(array, 38);
		
//		4. RECURSION
//		Recursion_algo.calcSum(100);
		
//		5. DEPTH FIRST SEARCH   (DEPTH WISE VALUES SEARCHED)
//		System.out.println("\n-------(InOrder)-------");
//		Depth_First_Search.inOrder(root);
		
//		System.out.println("\n-------(PreOrder)-------");
//		Depth_First_Search.preOrder(root);
		
//		6. BREADTH FIRST SEARCH (LEVEL WISE VALUES SEARCHED)
//		System.out.println("\n-------(Breadth_First_Search)-------");
//		Breadth_First_Search.bfs(root);

//		--------------------------------------------------------------------
		
		/* OVERVIEW MY ALGORITHMS */
//		1. Print a Table of any numbers
//		PrintTable.table(6);
		
//		--------------------------------------------------------------------
		
		/* OVERVIEW COLLECTIONS */
//		1. SinglyLinkedList
		System.out.println("\n\n-------(SinglyLinkedList)-------");
		slist.display();
		System.out.println("Size: "+slist.size());
		
	}

}
