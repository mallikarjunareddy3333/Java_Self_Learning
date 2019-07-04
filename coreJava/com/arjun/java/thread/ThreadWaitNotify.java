package com.arjun.java.thread;


public class ThreadWaitNotify {

	public static void main(String[] args) throws InterruptedException {
		ThreadB t = new ThreadB();
		t.start();
		
		synchronized (t) {
			System.out.println("main Thread calling wait() method");//step-1
			t.wait();
			System.out.println("main Thread got notification call");//step-4
			System.out.println(t.total);
		}
	}

}

class ThreadB extends Thread {

	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child thread starts calcuation"); // step-2
			for (int i = 0; i <= 100; i++) {
				total = total + i;
			}
			System.out.println("child thread giving notification call"); // step 3
			this.notify();
		}
	}
}

