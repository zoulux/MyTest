import java.util.*;

/*
 * �ж�һ�����Ƿ�������
 */
public class prime11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();

		// ������ֻ�ܱ���1���䱾����������
		int i = 2;
		while (i < num) {
			if (num % i == 0) {
				break;
			}
			i++;
		}
		if (i > Math.sqrt(num)) {// ��numȡƽ����
			System.out.println(num + "������");
		} else
			System.out.println(num + "��������");
	}
}
