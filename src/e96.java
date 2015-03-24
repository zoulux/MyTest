import java.util.Scanner;

public class e96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int T = cin.nextInt();
		while (T-- > 0) {
			String str = cin.next();
			int array[] = new int[str.length()];
			for (int i = 0; i < str.length(); i++){
				array[i] = str.charAt(i);}
			for(int t:array)
				System.out.print(t+" ");
//			for (int t = 1; t < str.length(); t++) {
//				if (array[t] != 0)
//					System.out.print(array[t]);
//			}
//			System.out.println();

		}

	}

}
