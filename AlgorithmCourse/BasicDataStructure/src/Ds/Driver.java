package Ds;

import java.util.Iterator;

// Driver class to test data structure classes
public class Driver {
	private static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		testStackArrayBased();
		testStackListBased();
		testStackListIterator();
		testStackGeneric();

		testQueueArrayBased();
		testQueueListBased();
		testCircularQueue();
	}

	private static void testStackArrayBased() {
		System.out.println("Test StackArrayBased class");
		StackArrayBased stackArrayBased = new StackArrayBased(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			stackArrayBased.push(i);
			stackArrayBased.printStack();
		}

		int value = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			value = stackArrayBased.pop();
			stackArrayBased.printStack();
		}
	}

	private static void testStackListBased() {
		System.out.println("Test StackArrayBased class");
		StackListBased stackListBased = new StackListBased(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			stackListBased.push(i);
			stackListBased.printStack();
		}

		int value = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			value = stackListBased.pop();
			stackListBased.printStack();
		}
	}

	private static void testStackListIterator() {
		System.out.println("Test stackListIterator class");
		StackListIterator stackListIterator = new StackListIterator(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			stackListIterator.push(i);
			stackListIterator.printStack();
		}

		Iterator iterator = stackListIterator.iterator();
		int index = 0;
		while (iterator.hasNext()) {
			System.out.println("Value " + iterator.next());
		}

		for (int value : stackListIterator) {
			System.out.println("Value " + value);
		}
	}

	private static void testStackGeneric() {
		System.out.println("Test StackGeneric class");
		StackGeneric<Integer> stackGeneric = new StackGeneric<Integer>(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			stackGeneric.push(i);
			stackGeneric.printStack();
		}

		for (int i = 0; i < MAX_SIZE; i++) {
			stackGeneric.pop();
			stackGeneric.printStack();
		}
	}

	private static void testQueueArrayBased() {
		System.out.println("Test QueueArrayBased class");
		QueueArrayBased queueArrayBased = new QueueArrayBased(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			queueArrayBased.enqueue(i);
			queueArrayBased.printQueue();
		}

		int value = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			value = queueArrayBased.dequeue();
			queueArrayBased.printQueue();
		}
	}

	private static void testQueueListBased() {
		System.out.println("Test QueueListBased class");
		QueueListBased queueListBased = new QueueListBased(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			queueListBased.enqueue(i);
			queueListBased.printQueue();
		}

		int value = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			value = queueListBased.dequeue();
			queueListBased.printQueue();
		}
	}

	private static void testCircularQueue() {
		System.out.println("Test CircularQueue class");
		CircularQueue circularQueue = new CircularQueue(MAX_SIZE);

		for (int i = 0; i < MAX_SIZE; i++) {
			circularQueue.enqueue(i);
			circularQueue.printQueue();
		}

		int value = 0;
		for (int i = 0; i < MAX_SIZE; i++) {
			value = circularQueue.dequeue();
			circularQueue.printQueue();
		}
	}
}