package com.zlx.classics;
import java.util.Scanner;

public class FenShuChaiFen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		while (n-- > 0) {
			int k = cin.nextInt();
			int x = 1;
			int y = 1;

			for (y = k + 1; y <= 2 * k; y++)
				if (k * y % (y - k) == 0) {
					x = k * y / (y - k);
					System.out.printf("1/%d=1/%d+1/%d\n", k, x, y);

				}
		}
	}
}
