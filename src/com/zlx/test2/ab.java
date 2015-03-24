package com.zlx.test2;

public class ab {
public static int ab (int a,int b) {
	if (a<=0||b<=0)
		throw new IllegalArgumentException("All parameters must be >0");
	else
	return a+b+Math.abs(a-b)/2;
	
}
public static void main(String[] args) {
	new ab();
}
}
