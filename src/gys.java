public class gys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gys = gys(0, 9);
		System.out.println(gys);
	}

	private static int gys(int a, int b) {

		int t = 1;
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while ((t = a % b) != 0) {
			a = b;
			b = t;
		}
		return b;
	}

}
