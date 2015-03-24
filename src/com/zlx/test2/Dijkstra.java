package com.zlx.test2;
import java.util.Scanner;
import java.util.Vector;

public class Dijkstra {

	/**
	 * @param args
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
			// G[col][row] = val;
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

		int dist[] = new int[n];
		int path[] = new int[n];
		boolean flag[] = new boolean[n];
		for (int i = 1; i < n; i++) {
			dist[i] = Integer.MAX_VALUE;
		}

		flag[0] = true;
		while (true) {
			int minstart = 0, minend = 0, min = Integer.MAX_VALUE;
			// flag[index] = true;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (P[i][j] == 1 && flag[j] == false && flag[i] == true) {
						if (dist[i] + G[i][j] < min) {
							min = dist[i] + G[i][j];
							minstart = i;
							minend = j;
							//
							// System.out.println("i"+"j"+":"+i+""+j);
							// System.out.println("min"+min);
							// System.out.println("???????");
						}
					}
				}
			}

			path[minend] = minstart;
			dist[minend] = min;
			flag[minend] = true;
			System.out
					.println(minend + " " + dist[minend] + " " + path[minend]);

			// for (int i = 0; i < index; i++) {
			// flag[i] = true;
			// for (int j = 0; j < n; j++) {
			// // System.out.println("j"+j);
			// // System.out.println("p"+P[i][j]);
			// // System.out.println("flag"+flag[j]);
			// if (j != i && P[i][j] == 1 && flag[j] == false) {
			//
			// // int temp = G[i][j] + dist[i];
			// // System.out.println("G"+G[i][j]);
			// // System.out.println("d"+dist[j]);
			// // if (temp < dist[j]) {
			// // dist[j] = temp;
			// // path[j] = i;
			// // P[i][j]=0;
			// //
			// // System.out.println(j+" "+dist[j]+" "+path[j]);
			// System.out.println("<<<<<<<<<<<<<<<");
			// // }
			// int min = Math.min(G[i][j] + dist[i], dist[j]);
			// dist[j] = min;
			// path[j] = i;
			// // P[i][j] = 0;
			// flag[j] = true;
			// System.out.println(j + " " + dist[j] + " " + path[j]);
			//
			// }
			// }
			// }
			//System.out.println("<<<<<<<<<<<<<<<");
			boolean bool = true;
			for (boolean it : flag) {
				if (!it) {
					bool = false;
					break;
				}
			}
			if (bool) {
				break;
			}
		}
		

	}


}
