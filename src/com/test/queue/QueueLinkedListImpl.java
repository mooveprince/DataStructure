package com.test.queue;

public class QueueLinkedListImpl {
    Node first, last;
    
    //do an insert
    public void doInsert (int data) {
        Node n = new Node (data);
        
        if (first == null) {
            first = n;
            last = first;
        } else {
            last.next = n;
            last = last.next;
        }
    }

    //do a delete
    public void doDelete ( ) {
        first = first.next;
    }

    //getFirst last
    public void getFirstLast (){
        System.out.println (first.data + "  " + last.data);
    }

}