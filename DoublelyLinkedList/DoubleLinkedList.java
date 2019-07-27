package dataStructure;

public class DoubleLinkedList {
	Node2 head, last;

	Node2 insert(int data) {
		Node2 new_node = new Node2(data);
		if (head == null && last == null) {
			head = new_node;

			last = new_node;
		} else {
			last.next = new_node;
			new_node.prev = last;
			last = new_node;
			last.next = null;

		}
		return new_node;
	}

	void print() {
		Node2 temp = head;
		System.out.println("elements in linked list:");
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);

	}

	int count() {
		Node2 temp = head;
		int count = 0;
		while (temp != null) {
			count = count + 1;
			temp = temp.next;
		}
		return count;
	}

	void printreverseorder(int x) {
		Node2 temp = last;
		System.out.println("printing reverse order ");
		while (temp.prev != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println(temp.data);
	}
}
