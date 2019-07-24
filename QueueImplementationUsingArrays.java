package arrays;

class Queue {
	int arr[];
	int front;
	int rear;

	Queue(int size) {
		arr = new int[size];
		front = 0;
		rear = 0;
	}
	void enqueue(int x) throws QueueOverFlowException {
		if (front == arr.length) {
			QueueOverFlowException q = new QueueOverFlowException("Quue is full");
			throw q;
		}
		arr[front] = x;
		front++;
		System.out.println("inserting element is" + x);
	}

	int dequeue() throws QueueUnderFlowException {
		if (rear == arr.length) {
			QueueUnderFlowException q = new QueueUnderFlowException("queu is empty");
			throw q;
		}
		int x;
		x = arr[rear];
		rear++;
		return x;
	}
}

class QueueOverFlowException extends Exception {
	QueueOverFlowException(String s) {
		super(s);
	}
}

class QueueUnderFlowException extends Exception {
	QueueUnderFlowException(String s) {
		super(s);
	}
}

public class QueueImplementationUsingArrays {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		try {
			q.enqueue(30);
			q.enqueue(40);
			q.enqueue(50);
			q.enqueue(60);
			int x = q.dequeue();
			System.out.println(x);
			int y = q.dequeue();
			System.out.println(y);
			int w = q.dequeue();
			System.out.println(w);
			int a = q.dequeue();
			System.out.println(a);
			int b = q.dequeue();
			System.out.println(b);

		} catch (QueueOverFlowException e) {
			System.out.println(e);
		}

		catch (QueueUnderFlowException e) {
			System.out.println(e);
		}
	}
}
