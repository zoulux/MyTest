import java.io.Console;

class Program {
	static void Main(String[] args) {
		System.out.println(Number(5));
	}

	static // / <summary>
	// / �ݹ鷨��������
	// / </summary>
	// / <param name="n"></param>
	// / <returns></returns>
	int Number(int n) {
		if (n == 1) {
			// ���һ��������������
			return 6;
		} else {
			return (Number(n - 1) + 1) * 5;
		}
	}
}