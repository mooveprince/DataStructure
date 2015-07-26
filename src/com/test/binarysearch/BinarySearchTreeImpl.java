package com.test.binarysearch;

public class BinarySearchTreeImpl {

    Node root;

    //do an insert
    public void insert (int data) {
        Node n = new Node (data);
        
        if (root == null){
            root = n;
        } else {
            Node focusNode = root;
            
            while (true) {
                if (data < focusNode.data) {
                    if (focusNode.leftChild == null) {
                        focusNode.leftChild = n;
                        System.out.println("Insert " + data + " to the left of " + focusNode.data);
                        return;
                    }
                    focusNode = focusNode.leftChild;
                } else {
                    if (focusNode.rightChild == null) {
                        focusNode.rightChild = n;
                        System.out.println("Insert " + data + " to the right of " + focusNode.data);
                        return;
                    }
                    focusNode = focusNode.rightChild;
                }
            }
        }
    }
        
    //In order Traversal
    public void inOrderTraversal (Node focusNode) {
    	if (focusNode == null) {
    		return;
    	}
    		inOrderTraversal(focusNode.leftChild);
    		System.out.println(focusNode.data);
    		inOrderTraversal(focusNode.rightChild);
    	}
    
    //Pre-order traversal root-left-right
    public void preOrderTraversal (Node focusNode) {
    	if (focusNode == null) {
    		return;
    	}
    	System.out.println(focusNode.data);
    	preOrderTraversal(focusNode.leftChild);
    	preOrderTraversal(focusNode.rightChild);
    }
    
    //Pre-order traversal root-left-right
    public void postOrderTraversal (Node focusNode) {
    	if (focusNode == null) {
    		return;
    	}
    	postOrderTraversal(focusNode.leftChild);
    	postOrderTraversal(focusNode.rightChild);
    	System.out.println(focusNode.data);
    }
    
    public void getLeftChildAlone ( ) {
    	Node focusChild = root;
    	while (focusChild != null) {
    		System.out.println(focusChild.data);
    		focusChild = focusChild.leftChild;
    	}
    }

}