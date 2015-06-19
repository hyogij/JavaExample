package Ds;

import java.util.ArrayList;

public class QueueListBased {
	// First in, First out
	private int maxSize = 0;
	private ArrayList<Integer> queue = null;

	public QueueListBased(int maxSize) {
		this.maxSize = maxSize;
		queue = new ArrayList<Integer>(maxSize);
	}

	private boolean isEmpty() {
		if (queue.size() == 0) {
			return true;
		}
		return false;
	}

	private boolean isFull() {
		if (queue.size() == maxSize) {
			return true;
		}
		return false;
	}

	public void printQueue() {
		for (int value : queue) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	public void enqueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue.add(num);
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue.remove(0);
	}
}
