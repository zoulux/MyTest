
import java.util.Arrays;
import java.util.Scanner;


public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		boolean prime[]=new boolean[N];
		Arrays.fill(prime,true);
		prime[0]=prime[1]=false;
		for(int i=2;i*i<N-1;i++)
			if(prime[i])
				for(int j=2*i;j<N;j=j+i)
					prime[i]=false;
		for(int n=6;n<N;n=n+2){
			for(int p=3;p<N/2;p=p+2)
				if(prime[p]&&prime[n-p])
				{
//					System.out.println(String.format("%d=%d+%d",n,p,n-p));
					break;
				}
			
			
			
			
		}

	}

}
