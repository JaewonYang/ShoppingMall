package before_refactoring;

import java.util.Scanner;

public class Input {
	private int n1;
	private int n2;

	public void getdays(int[] days, String[] daysS) {
		System.out.println("두개의 기념일의 날짜의 차이를 구하는 프로그램입니다. 기념일 두개지를 골라주세요");

		for (int i = 0; i < 18; i++) {
			System.out.print(i + 1 + ". " + days[i] + " " + daysS[i] + "   ");
		}
    System.out.print("\n");
}

	public void inputdata() {
		while (true) {
			System.out.println("첫번째 기념일을 고르겠습니다. 기념일 중 하나를 골라주세요.");
			Scanner scan1 = new Scanner(System.in);
			n1 = scan1.nextInt();

			if (n1 >= 1 & n1 <= 17) {
				System.out.println("두번째 기념일을 고르겠습니다. 기념일중 하나를 골라주세요");
				Scanner scan2 = new Scanner(System.in);
				n2 = scan2.nextInt();
				break;
			} else {
				System.out.println("잘못누르셨습니다. ");
				continue;
			}
		}
	}
		public int getnum1() {return n1;}
		public int getnum2() {return n2;}
}