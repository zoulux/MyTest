import java.util.Scanner;

public class FenShuZhuanXiaoShu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		long a = cin.nextLong();//a=1
		long b = cin.nextLong();//b=6
		int c = cin.nextInt();//c=4
		long A[] = new long[101];
		long x = a / b;
		a %= b;
		for (int i = 0; i <= c; i++) {//A[0]=1;A[1]=6...
			A[i] = (a * 10 / b);
			a = a * 10 % b;
		}
		long sc = 0;
		if (A[c] >= 5) {
			sc = 1;
			for (int i = c - 1; i >= 0; i--) {
				long temp = A[i] + sc;
				A[i] = temp % 10;
				sc = temp / 10;
				if (sc == 0)
					break;

			}
		}
		System.out.print(x + ".");
		for (int i = 0; i < c; i++)
			System.out.print(A[i]);
		System.out.println();

	}
}
