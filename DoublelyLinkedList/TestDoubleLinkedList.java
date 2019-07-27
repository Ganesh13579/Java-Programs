package dataStructure;

public class TestDoubleLinkedList {

	public static void main(String[] args) {
		DoubleLinkedList list=new DoubleLinkedList();
		Node2 n=list.insert(30);
		Node2 n1=list.insert(40);
		Node2 n2=list.insert(50);
		Node2 n3=list.insert(60);
		
		int x=list.count();
		list.printreverseorder(x);
		list.print();
		System.out.println("number of elements in given double linked list is :"+x);

	}

}
