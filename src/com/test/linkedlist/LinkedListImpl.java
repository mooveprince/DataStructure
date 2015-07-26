package com.test.linkedlist;

public class LinkedListImpl {

    Node first;

    //Do a Insert 
    public void insert (int data) {
        Node n = new Node (data);
        
        if (first == null) {
            first = n;
        } else {
            Node focusNode = first;
            while (focusNode.next != null) {
                focusNode = focusNode.next;
            }
            focusNode.next = n;
        }
    }
    
    //Do a insert at the beginning
    public void insertAtBegin (int data) {
        Node n = new Node (data);
        
        if (first != null) {
            n.next = first;
            first = n;        
        } else {
            first = n;
        }
    }
    
    //Insert at nth position 
    public void insertAtN (int data, int pos) {
        Node n = new Node (data);
        
        Node focusNode = first;
        int focusNodePos = 1;
        
        while (focusNodePos < pos) {
            focusNode = focusNode.next;
            focusNodePos++;
        }
        n.next = focusNode.next;
        focusNode.next = n;
        
    }   
    
    //Delete a Node at nth Position
    public void deleteNodeAtN(int pos) {
    	Node focusNode = first;
    	int focusPos = 1;
    	
    	while ((focusPos+1) < pos) {
    		focusPos++;
    		focusNode = focusNode.next;
    	}
    	focusNode.next = focusNode.next.next;
    }
    
    //To reverse a linked list
    public void reverseLinkedList (Node focusNode, Node prevNode) {
    	
    	if (focusNode.next == null) {
    		first = focusNode;
    	}
    	
    	if (focusNode.next !=null) {
    		reverseLinkedList (focusNode.next, focusNode);
    	} 

    	focusNode.next = prevNode;
    }
    
    //TraverseUsingRecursive
    public void traverseUsingRecurs (Node focusNode) {
    	
    	if (focusNode != null) {
    		System.out.println(focusNode.data);
    		traverseUsingRecurs (focusNode.next);
    		System.out.println(focusNode.data);
    	} else {
    		System.out.println("------");
    	}
    }
    
    //Traverse the LinkedList
    public void traverseLinkedList ( ) {
    	Node focusNode = first;
    	
    	while (focusNode != null) {
    		System.out.println(focusNode.data);
    		focusNode =  focusNode.next;
    	}
    	
    }
    
    //Get first Node
    public Node getFirstNode ( ) {
    	return first;
    }
    
    

}