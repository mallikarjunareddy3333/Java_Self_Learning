package com.arjun.java.thread;

class MyThread1 extends Thread {
	@Override
	public void run() {
		super.run();
	}
}

public class ThreadName {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		MyThread1 t = new MyThread1();
		System.out.println(t.getName());
		t.setName("Arjun Thread");
		System.out.println(t.getName());
		System.out.println(Thread.currentThread().getName());
		
	}

}
