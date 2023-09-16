package main.Basic_algorithms;

import java.util.LinkedList;
import java.util.Queue;

import main.ObjectClass.TreeNode;

public class Breadth_First_Search {
	public static void bfs(TreeNode root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.key+" ");		
		
			if(node.left!=null) {
				queue.offer(node.left);
			}
			if(node.right!=null) {
				queue.offer(node.right);
			}
		}
		
	}
}
