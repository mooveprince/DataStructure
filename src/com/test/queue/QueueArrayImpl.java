package com.test.queue;

public class QueueArrayImpl { 

    int[] qArray;
    int qArraySize;
    int first, last = -1;
    
    public QueueArrayImpl (int size) {
        this.qArraySize = size;
        this.qArray = new int [size];
    }

    //do an insert
    public void doInsert (int data) {
    
    if (last+1 < qArraySize) {
        last++;
        if (first == -1) {
            first = last;
            qArray[first] = data;
        } else {
        	qArray[last] = data;
        }    
    }

    }
    
    //do an delete
    public void doDelete ( ) {
    	first = first+1;
    }
    
    //get first and last
    public void getFirstLast ( ) {
        System.out.println(qArray[first] + "  " + qArray[last]);
    }
}