package com.thinkitive.threading;

public class Table {
	public static void main(String[] args) {
		
		
		MyThread th=new MyThread();
		
		MyTreadTable table=new MyTreadTable(th);
		MyTreadTable1 table1=new MyTreadTable1(th);
		
		Thread thread=new Thread(th);
		
		Thread thread1=new Thread(table);
		Thread thread2=new Thread(table1);
		
		
		thread1.setName("Table of 5: ");
		
		thread2.setName("Table of 10 :");
		
		th.setName("Table");
		
		thread2.setPriority(10);
		//thread2.setDaemon(true); To running resources in background 
		System.out.println(thread1.getPriority());
		
			thread1.start();
			thread2.start();
			
			
			
		
		
		
	}

}