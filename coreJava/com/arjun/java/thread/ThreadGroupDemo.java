package com.arjun.java.thread;

public class ThreadGroupDemo {

	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("Printing Threads");
		Thread t1 = new Thread(g, "Header Printing");
		Thread t2 = new Thread(g, "Body Printing");
		Thread t3 = new Thread(g, "Footer Printing");
		
		t1.start();
		t2.start();
		t3.start();
		
		g.stop();
		
	}

}
