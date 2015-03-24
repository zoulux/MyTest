package com.zlx.classics;
public class p22_ZhengShuHuaFen {

	/**
	 * @param args
	 * 6
	 * 5+1
	 * 4+1+1,4+2
	 * 3+1+1+1,3+2+1,3+3
	 * 2+1+1+1+1,2+2+1+1,2+2+2,
	 * 1+1+1+1+1+1+1
	 * 
	 */

	public static int q(int n, int m) {
		
		if (n < 1 || m < 1) {
			return 0;
		}
		if (n == 1 && m == 1) {
			return 1;
		}
		if (m > n) {
			q(n, n);
		}
		if (m == n) {
			return 1 + q(n, n - 1);
		}
		return q(n, m - 1) + q(n - m, m);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(q(6, 5));
	}

}
