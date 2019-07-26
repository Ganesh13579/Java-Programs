package dataStructure;

public class LinkedList1 {
	Node1 last, head;

	public Node1 insert(int data) {
		Node1 new_node = new Node1(data);
		new_node.data = data;
		if (head == null && last == null) {
			head = new_node;
			last = new_node;
		} else {
			last.next = new_node;
			last = new_node;
		}
		return new_node;
	}

	void print() throws NullPointerException {
		Node1 temp = head;
		System.out.println("given linked list is :");
		while (temp.next != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
	int count() {
		Node1 temp=head;
		int count=0;
		while(temp!=null) {
			count ++;
			temp=temp.next;
		}
		return count;
	}
	void delete(int key) {
		Node1 temp = head, prev = null;
		if (temp != null && temp.data == key) {
			System.out.println("key found and deleted ");
			head = temp.next;
		}
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}
		if (temp != null) {
			prev.next = temp.next;
			System.out.println("element found and deleted");
		}
		if (temp == null) {
			System.out.println("element not found ");
		}

	}
	void printmiddletoright(int size) {
		Node1 temp=head;
		System.out.println("printing linked list from left to middle");
		for(int j=1;j<=size/2;j++) {
			temp=temp.next;
		}
		for(int i=size/2;i>=1;i--) {
			
			System.out.println(temp.data);
			temp=temp.next;
		
	}
}
	void printlefttomiddle(int size) {
		Node1 temp=head;
		System.out.println("Printing linked list from start to middle");
		for(int i=1;i<=size/2;i++) {
			
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}
