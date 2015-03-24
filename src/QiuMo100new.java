
public class QiuMo100new {

	public static void main(String[] args) {	
		int a=modPower(6789 ,100000,1000);
		System.out.println(a);
	}


public static int modPower(int x, int n, int mod) {
	x %= mod;
	if (x == 0)
		return 0;
	if (n == 0)
		return 1;
	if ((n & 1) == 0)
		return modPower(x * x, n >> 1, mod) % mod;
	return (modPower(x * x, n >> 1, mod) * x) % mod;}}

