
public class f {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(2));

	}

	private static int f(int n) {
		if(n<=1) return 0;
		else return f(n-1)+n;
		
	}

}
