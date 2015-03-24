package com.zlx.javasuper;

public class Stringbuffer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sBuffer=new StringBuffer();
		sBuffer.append("hello word");

		sBuffer.insert(1, "i love you");
		System.out.println(sBuffer.toString());

	}

}
