package com.zlx.javasuper;
class A {
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("����tell����");

	}
}

class B extends A {
	public void tell() {
		// TODO Auto-generated method stub
		super.tell();

		System.out.println("����д��tell����һ��");
	}

}

public class Super {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.tell();
	}

}
