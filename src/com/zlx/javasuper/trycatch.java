package com.zlx.javasuper;

public class trycatch  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = new int[100];
		try {
			System.out.println(A[100]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Ô½½ç");
		}

	}

}
