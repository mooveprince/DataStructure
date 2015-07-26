package com.test.stack;

public class StackArrayImplementation {

    public int stackSize;
    public int currentSize = 0;
    public int[] stackArray;

    public StackArrayImplementation (int size) {
        this.stackArray = new int [size];
        this.stackSize = size;
    }

    //do an insert
    public void push (int data) {
        if (currentSize+1 < stackSize) {
            stackArray[currentSize] = data;
            currentSize ++;
        } 
    }
    
    //do an pop
    public void pop ( ) {
    	currentSize = currentSize-1;
    }
    
    //do an iteration
    public void traverse () {
        for (int i=0; i<currentSize; i++) {
            System.out.println (stackArray[i]);
        }
    }

}
