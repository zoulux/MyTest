package com.REC;

public class Rec {
	public double x = 1.0;
	public double y = 1.0;

	public Rec(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getarea() {
		return x * y;
	}

	public double getcie(double x, double y) {
		return 2 * (x + y);
	}

	public static void main(String[] args) {
		Rec r = new Rec(10, 9);
		// r.x=10;
		// r.y=9;
		System.out.println(r.getarea());
		System.out.println(r.getcie(r.x, r.y));

	}

}
