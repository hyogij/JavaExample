package Ds;

import java.util.ArrayList;

// Stack class based array implementation
public class StackListBased {
	private int maxSize = 0;
	private int top = 0;
	private ArrayList<Integer> list = null;

	public StackListBased(int maxSize) {
		this.maxSize = maxSize;
		list = new ArrayList<Integer>(maxSize);
	}

	private boolean isEmpty() {
		return list.isEmpty();
	}

	public void push(int num) {
		if (list.size() == maxSize) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		list.add(num);
	}

	public int pop() {
		if (list.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		top = top - 1;
		int result = list.get(top);
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