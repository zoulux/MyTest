package com.zlx.javasuper;
class A {
	public void tell() {
		// TODO Auto-generated method stub
		System.out.println("我是tell方法");

	}
}

class B extends A {
	public void tell() {
		// TODO Auto-generated method stub
		super.tell();

		System.out.println("我重写了tell方法一次");
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
