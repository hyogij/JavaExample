package Ds;

import java.util.ArrayList;
import java.util.Iterator;

// Stack class based array implementation
public class StackListIterator implements Iterable<Integer> {
	private int maxSize = 0;
	private int top = 0;
	private ArrayList<Integer> list = null;

	public StackListIterator(int maxSize) {
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

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			int seq = 0;
			public boolean hasNext() {
				return seq < maxSize;
			}
			public Integer next() {
				return list.get(seq++);
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}