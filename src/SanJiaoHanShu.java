import java.util.Scanner;


public class SanJiaoHanShu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		double b=(Math.PI*a)/180.0;
		System.out.printf("%.3f %.3f",Math.sin(b),Math.cos(b));

	}

}
