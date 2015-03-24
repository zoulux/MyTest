package com.zlx.classics;
import java.text.DecimalFormat;
import java.util.Arrays;


public class SiSheWuRu {

	public static void main(String[] args) {
		DecimalFormat fd = new DecimalFormat("#.000#");//#±Ì æ∑«0
		DecimalFormat gd = new DecimalFormat("0.0000");
		double x = 0.12345678;
		String t = gd.format(x);
		System.out.println("x =" + fd.format(x));
		System.out.println("x =" + gd.format(x));
		System.out.println(t);
	}

}
