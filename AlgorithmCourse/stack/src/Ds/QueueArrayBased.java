package Ds;

public class QueueArrayBased {
	// First in, First out
	private int front = 0;
	private int rear = 0;
	private int maxSize = 0;
	private int[] queue = null;

	public QueueArrayBased(int maxSize) {
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
		if (rear == maxSize) {
			return true;
		}
		return false;
	}

	public void printQueue() {
		for (int i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}

	public void enqueue(int num) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue[rear++] = num;
	}

	public int dequeue() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		return queue[front++];
	}
}
