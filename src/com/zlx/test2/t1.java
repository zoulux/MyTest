package com.zlx.test2;

import java.util.HashMap;
import java.util.Vector;

public class t1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> aIntegers=new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			aIntegers.add(i*i);
			
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(aIntegers.get(i)-1);
		}
		
	}

}
