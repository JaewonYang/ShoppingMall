package before_refactoring;

public class Control {
    private int[] speDaysN;             //기념일 날짜
    private String[] speDaysS;          //기념일 이름
    private int choosenFirstNumber;     //사용자에게 입력받은 첫번째 숫자
    private int choosenSecondNumber;    //사용자에게 입력받은 두번째 숫자
    private String choosenSunFirstHolidayName;  //사용자가 선택한 첫번째 기념일의 문자값
    private String choosenSunSecondHolidayName; //사용자가 선택한 두번쨰 기념일의 문자값
    private int resultDay;              //두 기념일의 날짜의 차
    private int daysOfFirstHoliday;     //첫번째 선택한 기념일의 1월 1일부터의 경과일
    private int daysOfSecondHoliday;    //두번째 선택한 기념일의 1월 1일부터의 경과일
    private int firstKey;               //첫번째 기념일의 키값(양력인지 음력인지 판단하는 값)
    private int secondKey;              //첫번째 기념일의 키값(양력인지 음력인지 판단하는 값)

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
    //기념일들을 사용자에게 처음 보여주고 사용자에게 입력을 받아오는 부분
    private void inputFromUser(){
        speDaysN = days.getDateArr();
        speDaysS = days.getStr();
        output.showIntroduceHoliday(speDaysN, speDaysS);
        input.inputdata();
        choosenFirstNumber = input.getFirstNumber();
        choosenSecondNumber = input.getSecondNumber();
    }
    //사용자에게 받아온 입력을 통해 연산을 하는 부분
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
    //연산한 값들을 출력하는 부분
    private void outputData(){
        output.outputResult(resultDay, choosenSunFirstHolidayName, choosenSunSecondHolidayName,
                daysOfFirstHoliday, daysOfSecondHoliday, firstKey, secondKey);
    }

}
