package com.zlx.classics;


import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriter1 {
	public static void main(String[] args) {
		double sum = 0;
		while (cin.hasNext()) {
			cin.next();
			double unit = cin.nextDouble();
			double price = cin.nextDouble();
			sum += unit * price;
		}
		cout.println(String.format("%.2f", sum));
		cin.close();
		cout.close();
	}

	static Scanner cin = new Scanner(System.in);
	static PrintWriter cout = new PrintWriter(System.out);
}
