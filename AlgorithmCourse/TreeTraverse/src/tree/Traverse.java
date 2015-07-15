package tree;

import java.util.LinkedList;
import java.util.Queue;

// Traverses tree through dfs and bfs
public class Traverse {
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

	public static void dfs(TreeNode root) {
		if (root != null) {
			System.out.println(root.val);
			dfs(root.left);
			dfs(root.right);
		}
	}

	// Breath first search using queue
	public static void bfs(TreeNode root) {
		if (root == null) {
			return;
		}

		// Queue is an interface so I need to instantiate using LinkedList
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		TreeNode node = null;
		while (queue.isEmpty() != true) {
			node = queue.remove();
			System.out.println(node.val);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) {
			val = x;
		}
	}
}
