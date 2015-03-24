package com.zlx.classics;
import java.util.Scanner;

public class JiuDeYuShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int m = cin.nextInt();
		while (m-- > 0) {
			String str = cin.next();
			int[] a = new int[1000001];
			for (int i = 0; i < str.length(); i++)
				a[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			int sum = 0;
			for (int i = 0; i < a.length; i++)
				sum += a[i];
			System.out.println(sum % 9);
		}
	}
}
