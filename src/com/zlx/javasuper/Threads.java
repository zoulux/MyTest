package com.zlx.javasuper;

public class Threads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(){
			@Override
			public void run() {
				super.run();
				
				try {
					sleep(5000);
					System.out.println("hello Android");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}.run();
		new Thread(){
			@Override
			public void run() {
				super.run();
				
				try {
					sleep(5000);
					System.out.println("hello Android");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}.run();
		new Thread(){
			@Override
			public void run() {
				super.run();
				
				try {
					sleep(5000);
					System.out.println("hello Android");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}.run();

		
		
	}

}
