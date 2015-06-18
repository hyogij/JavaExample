package Ds;

import java.util.Iterator;

// Driver class to test data structure classes
public class Driver {
	private static final int MAX_SIZE = 3;

	public static void main(String[] args) {
		testStackArrayBased();
		testStackListBased();
		testStackListIterator();
		testStackGeneric();
	}

	private static void testStackArrayBased() {
		System.out.println("Test StackArrayBased class");
		StackArrayBased stackArrayBased = new StackArrayBased(MAX_SIZE);

		for (int i = 0; i < 4; i++) {
			stackArrayBased.push(i);
			stackArrayBased.printStack();
		}

		int value = 0;
		for (int i = 0; i < 4; i++) {
			value = stackArrayBased.pop();
			stackArrayBased.printStack();
		}
	}

	private static void testStackListBased() {
		System.out.println("Test StackArrayBased class");
		StackListBased stackListBased = new StackListBased(MAX_SIZE);

		for (int i = 0; i < 4; i++) {
			stackListBased.push(i);
			stackListBased.printStack();
		}

		int value = 0;
		for (int i = 0; i < 4; i++) {
			value = stackListBased.pop();
			stackListBased.printStack();
		}
	}

	private static void testStackListIterator() {
		System.out.println("Test stackListIterator class");
		StackListIterator stackListIterator = new StackListIterator(MAX_SIZE);

		for (int i = 0; i < 4; i++) {
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
		StackGeneric stackGeneric = new StackGeneric<Integer>(MAX_SIZE);

		for (int i = 0; i < 4; i++) {
			stackGeneric.push(i);
			stackGeneric.printStack();
		}

		for (int i = 0; i < 4; i++) {
			stackGeneric.pop();
			stackGeneric.printStack();
		}
	}
}