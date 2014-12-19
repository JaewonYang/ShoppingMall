package before_refactoring;

public class Output {
    //기념일들을 사용자에게 보여주는 메소드
    public void showIntroduceHoliday(int[] days, String[] daysS){
        System.out.println("두개의 기념일의 날짜의 차이를 구하는 프로그램입니다. 기념일 두가지를 골라주세요");
        for (int i = 0; i < 18; i++) {
            System.out.print(i + 1 + ". " + days[i] + " " + daysS[i] + "   ");
        }
        System.out.println("\n");
    }
    //결과값을 출력하는 메소드
    public void outputResult(int passedDay, String firstDayName, String secondDayName,
                             int firstPassedDays, int secondPassedDays, int firstKey,
                             int secondKey) {

        System.out.println("첫번째 고른 기념일 :" + firstDayName);
        System.out.println("두번째 고른 기념일 :" + secondDayName);
        System.out.println("두 기념일 간의 경과일은 " + passedDay + " 일 입니다.");

        if (isCerti(firstKey, secondKey)) {
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

    private boolean isCerti(int firstKey, int secondKey) {
        return firstKey == 1 && secondKey == 0;
    }
}

