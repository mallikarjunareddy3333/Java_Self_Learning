package com.arjun.java.thread;

class MyThread34 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("lazy thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().isDaemon());
		MyThread34 t = new MyThread34();
		System.out.println(t.isDaemon());
		t.setDaemon(true);
		t.start();		
		System.out.println(t.isDaemon());
	}
}
