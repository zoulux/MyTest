package com.zlx.test2;
import java.util.Scanner;


public class ZuiDuanBianJi {
	public static void main(String[] args) {
		Scanner cin=new Scanner (System.in);
		while(cin.hasNext()){
			System.out.println(editDist(cin.next().toLowerCase(),cin.next().toLowerCase()));
		}
	}
    public static int editDist(String s1,String s2){  
        int m=s1.length(); 
        int n=s2.length();  
        int i=0,j=0;  
        int[][] d=new int[m+1][n+1];  
        for(i=0;i<=m;i++){  
            d[i][0]=i;  
        }  
        for(j=0;j<=n;j++){  
            d[0][j]=j;  
        }  
        int cost;  
        for(i=1;i<=m;i++){  
            for(j=1;j<=n;j++){  
                if(s1.charAt(i-1)==s2.charAt(j-1)){  
                    cost=0;  
                }else{  
                    cost=1;  
                }  
                d[i][j]=min(d[i-1][j-1]+cost,d[i-1][j]+1,d[i][j-1]+1);  
            }  
        }  
        return  d[m][n];  
    }  
    public static int min(int a,int b,int c){  
        int d=a;  
        if(d>b)d=b;  
        if(d>c)d=c;  
        return d;  
    }  
}
