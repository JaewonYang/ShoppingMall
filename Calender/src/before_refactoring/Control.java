package before_refactoring;

public class Control {
	private int[] speDaysN;
	private String[] speDaysS;
	private int n1;
	private int n2;
	private String choiceFirDayS;
	private String choiceSecDayS;
	private int resultDay;
	private int moonPassedDayFirst;
	private int moonPassedDaySecond;
	private int firstKey;
	private int secondKey;

	Input input;
	Output output;
	Calculator calculator;
	Days days;

	public void controlProgm() {
		input = new Input();
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
        input.getdays(speDaysN, speDaysS);
        input.inputdata();
        n1 = input.getnum1();
        n2 = input.getnum2();
    }
    private void calculateData(){
        calculator.dayHow(n1, n2);
        calculator.result();

        resultDay = calculator.returnDay();
        choiceFirDayS = calculator.returnNameF();
        choiceSecDayS = calculator.returnNameS();
        moonPassedDayFirst = calculator.returnPassedFirstDay();
        moonPassedDaySecond = calculator.returnPassedSecondDay();
        firstKey = calculator.returnFirstKey();
        secondKey = calculator.returnSecondKey();
    }
    private void outputData(){
        output.outputDate(resultDay, choiceFirDayS, choiceSecDayS,
                moonPassedDayFirst, moonPassedDaySecond, firstKey, secondKey);
    }

}
