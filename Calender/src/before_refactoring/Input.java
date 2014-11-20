package before_refactoring;

import java.util.Scanner;

public class Input {
	private int n1;
	private int n2;

	public void getdays(int[] days, String[] daysS) {
		System.out.println("기념일 둘을 선택하여, 그 사이의 경과일수를 구하는 프로그램");

		for (int i = 0; i < 18; i++) {
			System.out.print(i + 1 + ". " + days[i] + " " + daysS[i] + "   ");
		}
		System.out.print("\n");

	}

	public void inputdata() {
		while (true) {
			System.out.println("첫번째 기념일을 고르세요. 1~18사이의 숫자를 입력해주세요.");
			Scanner scan1 = new Scanner(System.in);
			n1 = scan1.nextInt();

			if (n1 >= 1 & n1 <= 17) {
				System.out.println("두번째 기념일을 고르세요. 1~18사이의 숫자를 입력해주세요.");
				Scanner scan2 = new Scanner(System.in);
				n2 = scan2.nextInt();
				break;
			} else {
				System.out.println("잘못된 값을 입력하였습니다.");
				continue;
			}
		}
	}
		public int getnum1() {return n1;}
		public int getnum2() {return n2;}
}