package com.zlx.classics;
import java.lang.reflect.Array;
import java.util.Arrays;


public class p21_QuanPaiLie {

	/**
	 * @param args
	 */
	public static void perm(Object [] list,int k,int m) {
		if (k==m) {
			for (int i = 0; i <= m; i++) {
				System.out.print(list[i]);
			}
			System.out.println();
		}
		else {
			for (int i = k; i <= m; i++) {
				swap(list,k,i);
				perm(list, k+1, m);
			    swap(list, k, i);
			}
		}
	}
	
	public static void swap(Object[] list, int k, int i) {
		// TODO Auto-generated method stub
		Object temp=list[k];
		list[k]=list[i];
		list[i]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] arr="123".split("");
		String[] arr={"1","2","3"};
//		System.out.println(arr.length);
//		System.out.println(Arrays.toString(arr));
		//perm(arr,1,arr.length-1) ;
		perm(arr, 0, 2);
	}
}
