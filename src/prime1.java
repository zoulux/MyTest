import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		System.out.println(prime(a));

	}

	private static boolean prime(int n) {
		// TODO Auto-generated method stub
		boolean resurt = true;
		if (n == 1)
			resurt = false;
		else if (n == 2)
			resurt = true;
	
		else
			for (int i = 2; i * i <= n; i++)
				if (n % i == 0)
					resurt = false;
		return resurt;
	}

}
