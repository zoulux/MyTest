package com.zlx.classics;
import java.util.Scanner;

public class FenShuJiSuanQi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		int a = cin.nextInt();
		int b = cin.nextInt();
		char op = cin.next().charAt(0);
	
		int c = cin.nextInt();
		int d = cin.nextInt();

		switch (op) {
		case '+':
			add(a, b, c, d);
			break;
		case '-':
			sub(a, b, c, d);
			break;
		case '*':
			mul(a, b, c, d);
			break;
		case '/':
			div(a, b, c, d);
			break;
		}
	}

	private static void div(int a, int b, int c, int d) {
		yuefen(a * d + b * c, b * d);
	}

	private static void sub(int a, int b, int c, int d) {
		yuefen(a * d - b * c, b * d);
	}

	private static void mul(int a, int b, int c, int d) {
		yuefen(a * c, b * d);
	}

	private static void add(int a, int b, int c, int d) {
		yuefen(a * d, b * c);
	}

	private static void yuefen(int fz, int fm) {
		int s = gys(fz, fm);
		System.out.printf("%d/%d\n", fz / s, fm / s);
	}

	private static int gys(int x, int y) {
		if (x < y) {
			int temp = x;
			x = y;
			y = temp;
		}
		int t = x;
		while ((t = x % y) != 0) {
			x = y;
			y = t;
		}
		return y;
	}
}
