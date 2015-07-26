package com.test.stack;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	StackArrayImplementation sa = new StackArrayImplementation(4);
		
		sa.push(1);
		sa.push(2);
		sa.push(3);
		
		sa.pop();
		
		sa.traverse();	*/
		
		StackLinkedListImplementation sla = new StackLinkedListImplementation();
		sla.doInsert(25);
		sla.doInsert(5);
		sla.doInsert(23);
		sla.getTop();
		
		sla.doPop();
		sla.getTop();
	}

}
