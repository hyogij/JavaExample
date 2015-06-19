package Ds;

// Stack class based array implementation
public class StackArrayBased {
	private int maxSize = 0;
	private int top = 0;
	private int[] array = null;

	public StackArrayBased(int maxSize) {
		this.maxSize = maxSize;
		array = new int[maxSize];
	}

	private boolean isEmpty() {
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int num) {
		if (top == maxSize) {
			System.out.println("Stack is full");
			return;
		}
		array[top++] = num;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return array[--top];
	}

	public void printStack() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.print("Stack : ");
		for (int i = 0; i < top; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		return;
	}
}