import java.math.BigInteger;
import java.util.Scanner;

public class QiuMo100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		BigInteger a = cin.nextBigInteger();
		BigInteger b = cin.nextBigInteger();
		BigInteger c = new BigInteger("1000");
		System.out.println(a.modPow(b, c));
	}

}
