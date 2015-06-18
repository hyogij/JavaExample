package Ds;

import java.util.ArrayList;

// Generic stack class
public class StackGeneric<T> {
	private int maxSize = 0;
	private int top = 0;
	private ArrayList<T> list = null;

	public StackGeneric(int maxSize) {
		this.maxSize = maxSize;
		list = new ArrayList<T>(maxSize);
	}

	private boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(T num) {
		if (list.size() == maxSize) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		list.add(num);
	}

	public T pop() {
		if (list.isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		top = top - 1;
		T result = list.get(top);
		list.remove(top);
		return result;
	}

	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack : ");
		for (int i = 0; i < top; i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		return;
	}
}