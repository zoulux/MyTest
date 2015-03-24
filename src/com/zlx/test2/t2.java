package com.zlx.test2;
import java.util.Vector;


public class t2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int path[]={0,0,0,1,1,4,4,6};
		Vector<Integer> vec=new Vector<Integer>();
		lujing(path, 7,vec);
		String str=7+""+"->";
		for (Integer i : vec) {
			str=str+i+"->";
		
		}
		System.out.println(str.substring(0, str.length()-2));

	}
	
	
	private static int lujing(int[] path, int i, Vector<Integer> vec) {

		if (i == 1) {
			vec.add(0);
			return 0;
		} else {
			return lujing(path, find(path, i,vec), vec);

		}

	}

	private static int find(int[] path, int j, Vector<Integer> vec) {
		// TODO Auto-generated method stub
				int index = 0;
				for (int i = 0; i < path.length; i++) {
					if (i ==path[j]) {
						index = i;
					}
				}
				vec.add(index);
				return index;
	}



}
