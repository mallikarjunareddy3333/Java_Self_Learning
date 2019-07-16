package com.arjun.java.innerclasses;

class Popcorn {
	public void taste() {
		System.out.println("spicy");
	}
}

public class AnonymusInnerClass {

	public static void main(String[] args) {
		Popcorn p = new Popcorn() {
			@Override
			public void taste() {
				System.out.println("salty");
				rating();
			}
			
			public void rating() {
				System.out.println("Good");
			}
			
		};
		
		p.taste();//salty
		
		Popcorn p1=new Popcorn();
		p1.taste();//spicy
		
		Thread t = new Thread() {
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("child thread");
				}
			};
		};
		
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
		
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++)
				{
					System.out.println("Child2 thread");
				}
			}
		};
		
		Thread t2 = new Thread(r);
		t2.start();
	}

}
