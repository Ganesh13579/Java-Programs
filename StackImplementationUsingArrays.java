package arrays;

class Stack1 {
	int arr[];
	int top;

	Stack1(int size) {
		arr = new int[size];
		top = 0;
	}

	void push(int x) throws StackOverflowException {
		if (top == arr.length) {
			StackOverflowException s = new StackOverflowException("Stack is full");
			throw s;
		}
		arr[top] = x;
		top++;
		System.out.println("inserting element is" + x);
	}

	int pop() throws StackUnderFlowException {

		if (top == -1) {
			StackUnderFlowException s = new StackUnderFlowException("Stack is empty");
			throw s;
		}
		top--;
		return arr[top];
	}
}

class StackOverflowException extends Exception {
	StackOverflowException(String s) {
		// super(s);
	}
}

class StackUnderFlowException extends Exception {
	StackUnderFlowException(String s) {
		// super(s);
	}
}

public class StackImplementationUsingArrays {

	public static void main(String[] args) {
		Stack1 s = new Stack1(2);
		try {
			s.push(30);
			s.push(50);
			s.push(40);

		} catch (StackOverflowException e) {
			System.out.println(e);
		}
		try {
			int x = s.pop();
			System.out.println(x);
			int y = s.pop();
			System.out.println(y);
			int z = s.pop();
			System.out.println(z);
		} catch (StackUnderFlowException e) {
			System.out.println(e);
		}
	}
}
