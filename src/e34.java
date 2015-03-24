import java.util.Scanner;

public class e34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt();
		int c = cin.nextInt();

		for (int t = 10; t < 100; t++)

			if (t % 3 == a && t % 5 == b && t % 7 == c) {
				System.out.println(t);

				break;
			}
		
	}

}
