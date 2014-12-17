package before_refactoring;

import java.util.Scanner;

public class Input {
	private int choosenNumber, choosenFirstNumber, choosenSecondNumber;
    private int countNumber=0;      // 사용자가 몇번째 입력을 하는지 나타내는 수
    private Scanner scan ;

	public void inputdata() {
		while (true) {
            countNumber++;
            inputInfo(countNumber);
            choosenFirstNumber =choosenNumber;
            if (choosenNumber >= 1 & choosenNumber <= 17) {
                countNumber++;
                inputInfo(countNumber);
                choosenSecondNumber =choosenNumber;
                break;
            } else {
                System.out.println("잘못누르셨습니다. ");
                continue;
            }
        }
    }

    public int getFirstNumber() {return choosenFirstNumber;}
    public int getSecondNumber() {return choosenSecondNumber;}

    private int inputInfo(int orderNumber){
            System.out.println(orderNumber+ " 번째 기념일을 고르겠습니다. 기념일 중 하나를 골라주세요.");
            scan = new Scanner(System.in);
            choosenNumber = scan.nextInt();
            return choosenNumber;
    }
}