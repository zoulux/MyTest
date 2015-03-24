package com.zlx.classics;
public class ZuiXiaoGongBeiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int gys(int a, int b) {
		return b==0?a:gys(b,a%b);

	}

	static int gbs(int a, int b) {
		return a * b / (gys(a, b));

	}

}
