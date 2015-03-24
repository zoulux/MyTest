public class test000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(gcd(16, 24));
		System.out.println(16%24);

	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
