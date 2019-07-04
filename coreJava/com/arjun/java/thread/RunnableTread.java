package com.arjun.java.thread;

public class RunnableTread implements Runnable {
	
	@Override
	public void run() {
		System.out.println("thead method");
	}
	
	public static void main(String[] args) {
		RunnableTread r = new RunnableTread();
		Thread t1 = new Thread();
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
		System.out.println("Main method");
		
	}

}
