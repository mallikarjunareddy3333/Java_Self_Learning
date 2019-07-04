package com.arjun.java.thread;

class MyThread3 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child1 thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
}

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child2 thread");
		}
	}
}

public class ThreadPriorityDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(9);
		MyThread3 t = new MyThread3();
		MyThread4 t1 = new MyThread4();
		//System.out.println(t.getPriority());
		
		//t.setPriority(4);	    //----> 1
		//t1.setPriority(8);
		System.out.println(t.getPriority());
		t.start();
		t1.start();
		
		//t.yield();
		
		//t1.join();
		
	}

}
