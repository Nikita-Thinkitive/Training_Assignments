package com.thinkitive.threading;

public class MyThread extends Thread {

	// Synchronized block for thread safe output
	
	public synchronized  void printTable(int n) 
	{
		int ans = 0;
		Thread t=new Thread();
		System.out.println("***TABLE USING THREAD***");
		for (int i = 1; i <= 10; i++) {
			
			
			ans = n * i;
			System.out.println(t.currentThread()+" "+n + " * " + i + " = " + ans);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
