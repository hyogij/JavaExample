package Ds;

public class CircularQueue {
	// First in, First out
	private int front = 0;
	private int rear = 0;
	private int maxSize = 0;
	private int[] queue = null;

	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		queue = new int[maxSize];
	}

	private boolean isEmpty() {
		if (front == rear) {
			return true;
		}
		return false;
	}

	private boolean isFull() {
		if (front == (rear + 1) % maxSize) {
			return true;
		}
		return false;
	}

	public void printQueue() {
		for (int i = front; i < rear;) {
			System.out.print(queue[i] + " ");
			i = (i + 1) % maxSize;
		}
		System.out.println();
	}

	public void enqueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue[rear] = num;
		rear = (rear + 1) % maxSize;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		front = (front + 1) % maxSize;
		return queue[front];
	}
}
