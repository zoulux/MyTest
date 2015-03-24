import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		boolean isLeapYear = false;
		if (year % 400 == 0) {
			isLeapYear = true;
		} else if ((year % 4 == 0) && (year % 100 != 0)) {
			isLeapYear = true;
		} else {
			isLeapYear = false;
		}
		if (isLeapYear) {
			System.out.println("今年是闰年！");
		} else {
			System.out.println("今年不是闰年！");
		}
	}

}
