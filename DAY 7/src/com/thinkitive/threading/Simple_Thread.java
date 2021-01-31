package com.thinkitive.threading;

public class Simple_Thread {
	public static void main(String[] args) {
		//SIMPLE MULTITHREADING
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		
		
		
		
			//For Sequential Programming so run is just method after start it will run the method
			  m1.run(); 
			  m2.run();
			 
			//Parallel Programming where two threads running programming
			
			  m1.start();
			   m2.start();
			 
		
		Mythreading thread1=new Mythreading();
		
		thread1.start(); //Parallel processing
		m1.start();
		
	}

}
