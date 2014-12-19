package before_refactoring;

public class Calculator {
    private int[] holidaysNumberArray;      //기념일들의 날짜와 이름 배열
    private String [] holidaysStringArray;
    private int[] keyArray;                 //키는 기념일이 양력인지 음력인지 확인할 수 있도록 하는 값
    private int firstDayKey;
    private int secondDayKey;

    private int firstDate;          //첫번째 기념일의 1월 1일부터의 경과일
    private int secondDate;         //두번째 기념일의 1월 1일부터의 경과일
    private int result;             //두 기념일의 날짜 차이
    private String returnFristHolidayName;  //사용자가 고른 첫번째 기념일의 이름
    private String returnSecondHolidayName; //사용자가 고름 두번째 기념일의 이름
    private int choosedNumberFirst;    //사용자가 고른 첫번째 기념일의 날짜
    private int choosedNumberSecond;   //사용자가 고름 두번째 기념일의 날짜

    Days days;
    MonthDates monthDates;

    public void dayHow(int choosenFirstNumber, int choosenSecondNumber) {
        days = new Days();
        monthDates = new MonthDates();

        //Days 클래스로 부터 기념일들 받아옴
        holidaysNumberArray = days.getDateArr();
        holidaysStringArray = days.getStr();
        keyArray = days.getKeyArr();

        firstDayKey = keyArray[choosenFirstNumber];
        secondDayKey = keyArray[choosenSecondNumber];

        choosedNumberFirst = days.getDateArr()[choosenFirstNumber];
        choosedNumberSecond = days.getDateArr()[choosenSecondNumber];

        //MonthDates 를 통해서 사용자가 고른 기념일의 경과일을 구함
        monthDates.calculrateDays(choosenFirstNumber, choosedNumberFirst, firstDayKey);
        firstDate = monthDates.getPassedDays();

        monthDates.calculrateDays(choosenFirstNumber, choosedNumberSecond, secondDayKey);
        secondDate = monthDates.getPassedDays();

        returnFristHolidayName = holidaysStringArray[choosenFirstNumber];
        returnSecondHolidayName = holidaysStringArray[choosenSecondNumber];
    }

    //두 기념일의 경과일을 비교해서 경과일의 차이를 구함
    public void result() {
        if (firstDate >= secondDate) {
            result = firstDate - secondDate;
        } else {
            result = secondDate - firstDate;
        }
    }

    //연산 결과들을 Control 클래스로 return 해줌
    public String returnNameF() {return returnFristHolidayName;}
    public String returnNameS() {return returnSecondHolidayName;}
    public int returnDay() {return result;}
    public int returnPassedFirstDay(){return firstDate;}
    public int returnPassedSecondDay(){return secondDate;}
    public int returnFirstKey(){return firstDayKey;}
    public int returnSecondKey(){return secondDayKey;}
}
