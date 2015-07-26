package com.test.binarysearch;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTreeImpl bt = new BinarySearchTreeImpl();
		
		bt.insert(15);
		bt.insert(18);
		bt.insert(13);
		bt.insert(17);
		bt.insert(7);
		bt.insert(8);
		
		System.out.println("In Order Traversal");
		bt.inOrderTraversal(bt.root);
		System.out.println("Pre Order Traversal");
		bt.preOrderTraversal(bt.root);
		System.out.println("Post Order Traversal");
		bt.postOrderTraversal (bt.root);
		
	}

}
