package dataStructure;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		Node1 n = list.insert(20);
		Node1 n1 = list.insert(30);
		// list.delete(20);
		// list.delete(30);
		// list.delete(40);
		Node1 n2 = list.insert(40);
		Node1 n3 = list.insert(50);
		int x = list.count();
		System.out.println("number of elements in linked list" + x);
		list.printmiddletoright(x);
		list.printlefttomiddle(x);
		try {
			list.print();

		} catch (NullPointerException e) {
			e.getMessage();
		}

	}

}
