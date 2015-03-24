package com.zlx.classics;

public class p28_binarysearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A=new int[100];
		for (int i = 0; i < A.length; i++) {
			A[i]=i*2;
		}
//		for (int i : A) {
//			System.out.println(i);
//		}
		System.out.println(binarysearch(A, 22, A.length));

	}
	public static int binarysearch(int [] A,int x,int n) {
		
		int left=0,right=n-1;
		
		
		while (left<=right) {
			int middle=(int)((left+right)/2);
			if (x==A[middle]) {
				return middle;
			}
			 if (x<A[middle]) {
				right=middle-1;
			}
			 if(x>A[middle]) {
				left=middle+1;
			}
			//System.out.println(A[middle]);
			
		}
		return -1;
		
		
		
	}

}
