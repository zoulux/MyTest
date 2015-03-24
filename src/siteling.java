import java.util.Scanner;

public class siteling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		long n = cin.nextLong();
		System.out.println(0.5 * Math.log10(2 * Math.PI * n) + n
				* Math.log10(n / Math.E));

	}
}
