package main.Basic_algorithms;

import main.ObjectClass.TreeNode;

public class Depth_First_Search {
	
	TreeNode root;
	public static void inOrder(TreeNode root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(""+root.key+ " ");
		inOrder(root.right);
	}
	
	public static void preOrder(TreeNode root) {
		if (root != null) {
		System.out.print("-->"+root.key+ " ");
		preOrder(root.left);
		preOrder(root.right);
		}
	}
}
