
public class Pi {

	public static void main(String[] args) {
			long M=100000000l;
		double N=0;
		for(int i=0;i<M;i++)
		{double x=Math.random();
		double y=Math.random();
		if(ok(x,y))
			N++;
		
		}
		double Pi=4*N/M;
		System.out.printf("%.6f\n",Pi);

		
				

	}

	private static boolean ok(double x, double y) {
		// TODO Auto-generated method stub
		return (x*x+y*y<1);
	}
	
}
