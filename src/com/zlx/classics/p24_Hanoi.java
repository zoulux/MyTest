package com.zlx.classics;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;


public class p24_Hanoi {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(64,1,2,3);
	}
	
	public static void hanoi(int n,int first,int second,int third) {
		if (n==1) {
			move(n,first,third);
		}
		else {
			hanoi(n-1, first, third, second);
			move(n, first, third);
			hanoi(n-1, second, first, third);
		}
	}

	private static void move(int n,int first, int third) {
		// TODO Auto-generated method stub
		System.out.println("µÚ"+n+"¸öÅÌ×Ó"+":"+first+"->"+third);
	}
}
