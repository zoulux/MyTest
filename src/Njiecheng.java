import java.math.BigInteger;
import java.util.Scanner;

public class Njiecheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
//		int b=n;
//		for( n=1;n<=b;n++){
		
		BigInteger a = new BigInteger("1");
		for (int i = 1; i <= n; i++)
			a = a.multiply(BigInteger.valueOf(i));
		System.out.println(a);}
	
	// }

}
