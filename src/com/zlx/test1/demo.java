package com.zlx.test1;
import java.util.Scanner;

public class demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//??????????
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			int N=cin.nextInt();
		double sum=0;
		for(int i=1;i<=N;i++)
			sum+=Math.log10(i);
		System.out.println((int)sum+1);
		}
	}

}