import java.util.Scanner;

public class QiuZhu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n >= 1) {
			int number = sc.nextInt();
			Integer s = new Integer(number);
			char chr = (char) (48);
			String strnum = s.toString();
			StringBuffer newnum = new StringBuffer();
			for (int i = 1; i < strnum.length(); i++) {
				if (strnum.charAt(i) != chr) {
					newnum.append(strnum.charAt(i));
				}
			}
			if (newnum.length() != 0) {
				System.out.println(newnum);
			} else
				System.out.println("0");
			n--;
		}

	}

}
