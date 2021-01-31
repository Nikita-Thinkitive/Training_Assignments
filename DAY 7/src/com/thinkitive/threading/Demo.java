package com.thinkitive.threading;

public class Demo {
public static void main(String[] args) {
	
		  Mythreading thread2=new Mythreading(); 
		  thread2.start();
		 
	MyRunnable my=new MyRunnable(); //Runnable Interface
	Thread t1=new Thread(my);
	Thread t2=new Thread(my);
	t1.start();
	t2.start();
	
}
}
