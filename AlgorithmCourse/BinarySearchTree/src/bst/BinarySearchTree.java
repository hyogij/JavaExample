package bst;

import Traverse.TreeNode;

public class BinarySearchTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		System.out.println("DFS");
		dfs(root);

		System.out.println("BFS");
		bfs(root);
	}

	// Insert, Delete, Search, Traverse
	// Insert recursive and iterative
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
}
