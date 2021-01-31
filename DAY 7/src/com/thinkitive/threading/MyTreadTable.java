package com.thinkitive.threading;

public class MyTreadTable implements Runnable{
	
	MyThread t=new MyThread();
	
	Thread th=new Thread(t);

	


	public MyTreadTable(MyThread t) 
	{
		this.t=t; //If you not use static in synchronize then create constructor of that class object
	}




	@Override
	public void run() {
		
		t.printTable(5);
		
		
		
	}

}


 class MyTreadTable1 implements Runnable{
	
	
	MyThread t=new MyThread();

	public MyTreadTable1(MyThread t) {
		this.t=t;
	}

	@Override
	public void run() {
		
		t.printTable(10);
		
		
		
	}

}
