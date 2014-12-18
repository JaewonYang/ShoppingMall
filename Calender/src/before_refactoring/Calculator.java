package before_refactoring;

public class Calculator {
    private int[] speDaysN;
    private String [] speDaysS;
    private int[] key;
    private int firstDayKey;
    private int secondDayKey;

    private int firstDate;
    private int secondDate;
    private int result;
    private String returnNameSFir;
    private String retrunNameSSec;
    private int choosedNumFirst;
    private int choosedNumSecond;

    Days days;
    MonthDates monthDates;

    public void dayHow(int choosenFirstNumber, int choosenSecondNumber) {
        days = new Days();
        monthDates = new MonthDates();

        speDaysN = days.getDateArr();
        speDaysS = days.getStr();
        key = days.getKeyArr();

        firstDayKey = key[choosenFirstNumber];
        secondDayKey = key[choosenSecondNumber];

        choosedNumFirst = days.getDateArr()[choosenFirstNumber];
        choosedNumSecond = days.getDateArr()[choosenSecondNumber];


        monthDates.calculrateDays(choosenFirstNumber, choosedNumFirst, firstDayKey);
        firstDate = monthDates.getPassedDays();

        monthDates.calculrateDays(choosenFirstNumber, choosedNumFirst, secondDayKey);
        secondDate = monthDates.getPassedDays();

        returnNameSFir = speDaysS[choosenFirstNumber];
        retrunNameSSec = speDaysS[choosenSecondNumber];
    }
    public void result() {
        if (firstDate >= secondDate) {
            result = firstDate - secondDate;
        } else {
            result = secondDate - firstDate;
        }
    }
    public String returnNameF() {return returnNameSFir;}
    public String returnNameS() {return retrunNameSSec;}
    public int returnDay() {return result;}
    public int returnPassedFirstDay(){return firstDate;}
    public int returnPassedSecondDay(){return secondDate;}
    public int returnFirstKey(){return firstDayKey;}
    public int returnSecondKey(){return secondDayKey;}
}
