package com.zlx.classics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

public class Dijkstra {

	/**
	 * @param args
	 * @author zlx
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);

		int n = cin.nextInt();// 矩阵阶数
		// 初始化图的矩阵
		int[][] G = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					G[i][j] = 0;
					continue;
				}
				G[i][j] = Integer.MAX_VALUE;
			}
		}

		// 输入权值
		while (cin.hasNext()) {

			int row = cin.nextInt();

			int col = cin.nextInt();

			int val = cin.nextInt();
			G[row][col] = val;
			//G[col][row] = val;
		}

		// 初始化邻接矩阵
		int[][] P = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (G[i][j] != 0 && G[i][j] != Integer.MAX_VALUE) {
					P[i][j] = 1;
				}
			}
		}

		// 初始化p标号，t标红



		Map<Integer, Integer> pb=new TreeMap<Integer, Integer>();
		Map<Integer, Integer> tb=new TreeMap<Integer, Integer>();
		
		pb.put(1, 0);
		for (int i = 2; i != n+1; ++i) {

			tb.put(i, Integer.MAX_VALUE);
		} 


		String str = "";
		
		//for j=1:n-1

		for (int j = 1; j <=n-1; j++) {
			int spb=pb.size();
			int stb=tb.size();
			for (int i = 1; i <= stb; i++) {
				int k=tb.get(i);
				int distance=G(spb-1,k)+pb.get(spb);
				if (distance<tb.get(i)) {
					  tb.put(i, distance);
					  System.out.println("put"+i);
				}
				
			}
			
			int min=Integer.MAX_VALUE,index=0;
			for (int i = 1; i <= tb.size(); i++) {
				if (tb.get(i)<min) {
					min=tb.get(i);
					index=i;
				}
			}
		pb.put(index, min);
		tb.remove(index);
			
	
			   // gd=PB(1,end);
			   // [m1,n1]=size(TB);
			    //for i=1:n1
			       // k=TB(1,i);
			      //  dij=D(gd,k)+PB(2,end);
			     //   if dij<TB(2,i)
			        //    TB(2,i)=dij;TB(3,i)=gd;
//			        end
//			    end
//			    m2=find(TB(2,:)==min(TB(2,:)));
//			    PB=[PB,TB(:,m2)];
//			    TB(:,m2)=[];
//			end
//		
//		
		
		
		
		
		}
		
		
		
		
		
		
//		for (int i = 0; i < n-1; i ++) {
//			int min = Integer.MAX_VALUE;
//			String strtemp = "";
//			for (int j = 0; j < n; j++) {
//				int temp;
//				if (P[i][j] == 1
//					&& (temp = Math.min(tb.get(j), pb.get(i) + G[i][j])) < min) {
//					min = temp;
//	
//					tb.put(j, min);
//					last = j;
//					strtemp = i + "->";
//					System.out.println(j);
//
//				} 
//			}
//			System.out.println("<<<<<<<<<<<<<<<<");
//			//P[last][i] = 0;
//			str = str + strtemp;
//			int t=Integer.MAX_VALUE,index = 0;
//			for (int j = 1; j < tb.size(); j++) {
//				if (tb.get(j)<t) {
//					t=tb.get(j);
//					index=j;
//				}
//			}
//			pb.put(index, min);
//			tb.remove(index);
//
//			System.out.println("last:" + last);
//
//			System.out.println();
//
//			if (last == 7)
//				break;
//		}

		System.out.println(str);

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(G[i][j] + " ");
//			}
//			System.out.println();
//		}

	}

	private static int G(int i, int k) {
		// TODO Auto-generated method stub
		return 0;
	}

}
