import java.math.BigInteger;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

public class NJieChengN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		while(cin.hasNext()){
		
		
		BigInteger n = cin.nextBigInteger();
		BigInteger s = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		BigInteger s2=n.multiply(n);
		for (int i = 1; i <= n.intValue()/2; i++)
			s = s.multiply(s2);
		if(n.mod(two).equals(zero))
			System.out.println(s);
		else
			System.out.println(s.multiply(n));
			
	
	}}

}
