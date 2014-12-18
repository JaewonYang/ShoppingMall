package before_refactoring;

public class Control {
    private int[] speDaysN;     //기념일 날짜
    private String[] speDaysS;  //기념일 이름
    private int choosenFirstNumber;
    private int choosenSecondNumber;
    private String choosenSunFirstHolidayName;
    private String choosenSunSecondHolidayName;
    private int resultDay;
    private int daysOfFirstHoliday;
    private int daysOfSecondHoliday;
    private int firstKey;
    private int secondKey;

    Input input;
    Output output;
    Calculator calculator;
    Days days;

    public void controlProgm() {
        input = new Input();
        output = new Output();
        output = new Output();
        calculator = new Calculator();
        days = new Days();

        inputFromUser();
        calculateData();
        outputData();
    }
    private void inputFromUser(){
        speDaysN = days.getDateArr();
        speDaysS = days.getStr();
        output.showIntroduceHoliday(speDaysN, speDaysS);
        input.inputdata();
        choosenFirstNumber = input.getFirstNumber();
        choosenSecondNumber = input.getSecondNumber();
    }
    private void calculateData(){
        calculator.dayHow(choosenFirstNumber, choosenSecondNumber);
        calculator.result();

        resultDay = calculator.returnDay();
        choosenSunFirstHolidayName = calculator.returnNameF();
        choosenSunSecondHolidayName = calculator.returnNameS();
        daysOfFirstHoliday = calculator.returnPassedFirstDay();
        daysOfSecondHoliday = calculator.returnPassedSecondDay();
        firstKey = calculator.returnFirstKey();
        secondKey = calculator.returnSecondKey();
    }
    private void outputData(){
        output.outputResult(resultDay, choosenSunFirstHolidayName, choosenSunSecondHolidayName,
                daysOfFirstHoliday, daysOfSecondHoliday, firstKey, secondKey);
    }

}
