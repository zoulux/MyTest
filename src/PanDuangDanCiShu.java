import java.math.BigInteger;
import java.util.Scanner;

public class PanDuangDanCiShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		String str = cin.nextLine();
		char cs[] = str.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if ((cs[i] >= 'a' && cs[i] <= 'z')
					|| (cs[i] >= 'A' && cs[i] <= 'Z'))
				System.out.print(cs[i]);
			else
				System.out.println();

		}
	}

}
