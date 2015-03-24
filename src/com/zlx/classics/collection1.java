package com.zlx.classics;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class collection1 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Vector<Integer> arr = new Vector<Integer>();
		for (int i = 0; i < 10; i++)
			arr.add(2 * i);
		for (int i = 0; i < 10; i++)
			arr.add(2 * i);
		System.out.println(arr);
		Collections.rotate(arr, 2);
		
		System.out.println(arr);
		System.out.println(Collections.frequency(arr, 2));//判断arr中2出现的次数

	}

}
