import java.io.Console;

class Program {
	static void Main(String[] args) {
		System.out.println(Number(5));
	}

	static // / <summary>
	// / 递归法求桃子数
	// / </summary>
	// / <param name="n"></param>
	// / <returns></returns>
	int Number(int n) {
		if (n == 1) {
			// 最后一个是至少是六个
			return 6;
		} else {
			return (Number(n - 1) + 1) * 5;
		}
	}
}