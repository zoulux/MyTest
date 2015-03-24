import java.math.BigInteger;
import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		System.out.println(f(3));  
	}
		private static long f(int n) {
			// TODO Auto-generated method stub
			long s=1;
			long sum=0;
		
			for(int k=1;k<=n;k++){
			
			for(int j=1;j<=k;j=j+2)
				s=s*j;
			
			sum=sum+s;
		}
			return sum;
		}
	}
