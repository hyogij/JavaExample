package Ds;

// Driver class to test data structure classes
public class Driver {
	private static final int MAX_SIZE = 3;

	public static void main(String[] args) {
		testStackArrayBased();
		testStackListBased();
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
}