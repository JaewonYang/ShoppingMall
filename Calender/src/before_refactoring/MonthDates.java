package before_refactoring;

/**
 * Created by Jaewon on 2014-12-09.
 */
public class MonthDates {
    private int[] sunMon;   //양력 음력의 각 달의 총 일의 수
    private int[] moonMon;
    private int monNum;
    private int date;   //전달까지의 일의 수와 해당달의 일의 수를 더한 1월 1일부터 해당 기념일까지의 일의 수

    private final void dates() {
        sunMon = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        moonMon = new int[]{30, 29, 30, 29, 30, 29, 30, 29, 30, 30/* 윤달 */, 29, 30, 29};
    }

    public void calculrateDays(int clientChoosenDaysNumber, int dayNum, int key) {
        monNum = clientChoosenDaysNumber - 1;
        if (key == 1) {
            for (int i = 0; i < monNum; i++) {
                date = sunMon[i] + date;
            }
            date = date + (dayNum % 100);
        }else{
            for (int i = 0; i < monNum; i++) {
                date = moonMon[i] + date;
            }
            date = date + (dayNum % 100);
        }
    }

    public int getPassedDays() {return date;}

}
