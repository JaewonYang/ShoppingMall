package before_refactoring;

import before_refactoring.Input;
import before_refactoring.Output;

public class Control {
	private int[] speDaysN; // 사용자에게 입력을 받기위해 보여주는 기념일 전체 배열
	private String[] speDaysS;
	private int n1; // 사용자에게 입력받은 숫자 두개
	private int n2;
	private String choiceFirDayS; // 사용자가 고름 기념일 문자열
	private String choiceSecDayS;
	private int resultDay; // 결과 경과일
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

		speDaysN = days.getDateArr(); // days 클래스에서 가져온 모든 기념일
		speDaysS = days.getStr();

		input.getdays(speDaysN, speDaysS);
		input.inputdata();
		n1 = input.getnum1();
		n2 = input.getnum2();

		calculator.dayHow(n1, n2);
		calculator.result();

		resultDay = calculator.returnDay(); // 두 기념일의 경과일
		choiceFirDayS = calculator.returnNameF(); // 첫번쨰 기념일의 이름
		choiceSecDayS = calculator.returnNameS(); // 두번째 기념일의 이름
		moonPassedDayFirst = calculator.returnPassedFirstDay();
		moonPassedDaySecond = calculator.returnPassedSecondDay();
		firstKey = calculator.returnFirstKey();
		secondKey = calculator.returnSecondKey();

		output.outputDate(resultDay, choiceFirDayS, choiceSecDayS,
				moonPassedDayFirst, moonPassedDaySecond, firstKey, secondKey);
	}
}
