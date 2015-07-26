package com.test.stack;

public class StackLinkedListImplementation {

    Node top;
    
    //do Push
    public void doInsert (int data) {
        Node n = new Node (data);
        
        n.next = top;
        top = n;
    }


    //do pop
    public void doPop ( ) {
    	top = top.next;
    }
    
    //getTop
    public void getTop ( ) {
    	System.out.println( top.data);
    }
}