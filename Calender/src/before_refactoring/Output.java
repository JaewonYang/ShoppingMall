package before_refactoring;

public class Output { // ���, ù��°������̸�, �ι�°������̸�, ù��°�����, �ι�° �����, ù��° Ű��, �ι�°
	// Ű��
public void outputDate(int r, String firstDayS, String secondDayS,
int firstPassedDays, int secondPassedDays, int firstKey,
int secondKey) {

System.out.println("첫번째 고른 기념일 :" + firstDayS);
System.out.println("두번째 고른 기념일 :" + secondDayS);
System.out.println("두 기념일 간의 경과일은 " + r + " 일 입니다.");

if (firstKey == 1 && secondKey == 0) {
System.out.println("두번째 기념일은 음력인 기념일입니다. 두번째 기념일의 양력 1월 1일부터의 경과일은  "  +
        + secondPassedDays + " 일 입니다");

} else if (firstKey == 0 && secondKey == 1) {
System.out.println("첫번째 기념일은 음력인 기념일입니다. 첫번째 기념일의 양력 1월 1일부터의 경과일은  "
        + firstPassedDays+" 일 입니다");

} else {
System.out.println("두 기념일은 모두 음력인 기념일입니다. 첫번째 기념일의 양력  1월 1일부터의 경과일은    "
        + firstPassedDays
        + " \n  두번째 기념일의 양력  1월 1일부터의 경과일은 "
        + secondPassedDays+"일 입니다");
}
}
}

