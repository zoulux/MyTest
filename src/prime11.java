import java.util.*;

/*
 * 判断一个数是否是素数
 */
public class prime11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数：");
		int num = input.nextInt();

		// 素数是只能被被1和其本身整数的数
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				break;
			}
			i++;
		}
		if (i > Math.sqrt(num)) {// 对num取平方根
			System.out.println(num + "是素数");
		} else
			System.out.println(num + "不是素数");
	}
}
