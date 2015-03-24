import java.util.Scanner;

public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int year = cin.nextInt();
		if (leapyear(year))
			System.out.println("yes");
		else
			System.out.println("no");

	}

	private static boolean leapyear(int year) {
		if(year%400==0)
			return true;
		if(year%100==0)
			return false;
		if (year % 4 == 0 )
			return true;
		return false;


	}

}
