package com.test.queue;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	QueueArrayImpl qa = new QueueArrayImpl (5);
		
		qa.doInsert(10);
		qa.doInsert(5);
		qa.doInsert(9);
		qa.doInsert(15);
		
		qa.getFirstLast();
		
		qa.doDelete();
		
		qa.getFirstLast(); */
		
		QueueLinkedListImpl ql = new QueueLinkedListImpl();
		ql.doInsert(98);
		ql.doInsert(65);
		ql.doInsert(56);
		ql.doInsert(105);
		
		ql.getFirstLast();
		
		ql.doDelete();
		ql.getFirstLast();
	}

}
