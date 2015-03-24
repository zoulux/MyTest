import java.util.Scanner;


public class gongyueshu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
	
		while(cin.hasNext()){
			int i=cin.nextInt();
			int j=cin.nextInt();
			System.out.print(gy(i,j)+" ");
			System.out.print(gb(i,j));
			System.out.println();
			
			
			
		}

	}

	private static int gb(int i, int j) {
		// TODO Auto-generated method stub
		int a=gy(i,j);
		int b=i/a;
		int c=j/a;
		int d=b*c*a;
		
		
		return d ;
	}

	private static int gy(int i, int j) {
		// TODO Auto-generated method stub
		
		int t=0;
		int temp=1;
		if(i<j)
			{t=i;
			i=j;
			j=t;
			}
			while((temp=i%j)!=0){
				i=j;
				j=temp;
				
				
			}
		
		return j;
	}

}
