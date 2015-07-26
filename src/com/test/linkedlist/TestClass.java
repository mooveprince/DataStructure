package com.test.linkedlist;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl li = new LinkedListImpl();
		
		li.insert(10);
		li.insert(39);
		li.insert(5);
		//System.out.println( "First Node.." + li.getFirstNode().data);
	//	li.insertAtBegin(100);
		//System.out.println(li.getFirstNode().data);
	//	li.insertAtN(3, 3);
	//	li.deleteNodeAtN(2);
		
	//	li.reverseLinkedList(li.first, null);
	//	li.traverseLinkedList();
		li.traverseUsingRecurs(li.first);
	}

}
