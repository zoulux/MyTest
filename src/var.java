public class var {
	public static void main(String[] args) {
		print("JAVA", "PHP");
		System.out.println();
		print("JAVA", "PHP", "JAVA");
	}

	private static void print(String... var) {
		for (int i = 0; i < var.length; i++)
			System.out.print(var[i] + " ");

	}
}
