package com.zlx.javasuper;

interface Inter1 {
	public static final int AGE = 100;

	public abstract void say();

}

interface Inter2 {
	public abstract void tell();
}

class Inters1 extends chouxiang implements Inter1,Inter2{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("½Ó¿Ú");
	}

	@Override
	public void tell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void cx() {
		// TODO Auto-generated method stub
		
	}

}

abstract class chouxiang{
	abstract void cx();
}

interface Inter3 extends Inter2,Inter1{
	
}

public class Interface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
