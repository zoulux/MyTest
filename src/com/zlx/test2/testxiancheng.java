package com.zlx.test2;

import java.util.Random;
import java.util.Scanner;

public class testxiancheng extends Thread {
	
	/**
	 * @param args
	 * @author zlx
	 */
	static Scanner cin=new Scanner(System.in);
	public void run() {
		while(true){
	Random random=new Random();
	int i=random.nextInt(3);
	if (i==0) {
		System.out.println("123");
	}else if (i==1) {
		System.out.println("456");
	}else if (i==2) {
		System.out.println("789");
	}else {
		System.out.println("000");
	}
	}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new testxiancheng().start();
		new testxiancheng().start();
		new testxiancheng().start();
		new testxiancheng().start();
		

	}

}
