import java.math.BigInteger;
import java.util.Scanner;

public class e56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();

		while (T-- > 0) {

			int n = cin.nextInt();

			BigInteger m = cin.nextBigInteger();
			BigInteger a = new BigInteger("1");
			for (int i = 1; i <= n; i++)
				a = a.multiply(BigInteger.valueOf(i));
			BigInteger resurt = new BigInteger("1");
			BigInteger shang = new BigInteger("0");
			int i = 0;
			long start = System.currentTimeMillis();
			for (i = 0;; i++) {
				resurt = a.divide(m);
				if (resurt.mod(m.pow(5)).equals(shang)) {
					a = resurt;
				} else
					break;

			}
			long end = System.currentTimeMillis();
			System.out.println(i + 5);
			System.out.println(end - start);

		}

	}
}
