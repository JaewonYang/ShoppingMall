package before_refactoring;

public class Calculator {

	private int[] speDaysN; // Days 클래스에서 가져온 기념일들
	private String[] speDaysS;
	private int[] key; // 숫자의 키값, 이것을 통해 양력과 음력을 구분.
	private int fkey;
	private int skey;

	private int firDate; // 기념일의 경과일
	private int secDate;
	private int result; // 리턴해줄 결과값
	private String returnNameSFir; // 사용자가 고른 기념일 이름
	private String retrunNameSSec;
	private int choosedNumFirst; // 사용자가 고른 기념일 날짜들
	private int choosedNumSecond;

	Days days;
	SunCal sunCal;
	MoonCal moonCal;

	// 사용자가 선택한 두가지 값, Days 클래스로부터 가져온 기념일 값, 키값
	public void dayHow(int a, int b) {
		days = new Days();
		sunCal = new SunCal();
		moonCal = new MoonCal();

		speDaysN = days.getDateArr(); // days 클래스에서 기념일들과 키값들을 가져옴
		speDaysS = days.getStr();
		key = days.getKeyArr();

		// 키값을 통해 고른 기념일이 양력인지 음력인지 확인
		fkey = key[a];
		skey = key[b];

		choosedNumFirst = days.getDateArr()[a]; // 사용자가 고른 기념일 날짜
		choosedNumSecond = days.getDateArr()[b];

		// key값을 통해 양력인지 음력인지 구분해서
		if (fkey == 1) {
			sunCal.calculrateSunDays(a, choosedNumFirst); // sunCal 에 사용자가 고른
															// 변호,
			firDate = sunCal.getPassedsunMon();
		} else {
			moonCal.calculrateMoonDays(a, choosedNumFirst);
			firDate = moonCal.getPassedmoonMon();
		}

		if (skey == 1) {
			sunCal.calculrateSunDays(b, choosedNumSecond);
			secDate = sunCal.getPassedsunMon();
		} else {
			moonCal.calculrateMoonDays(b, choosedNumSecond);
			secDate = moonCal.getPassedmoonMon();
		}
		returnNameSFir = speDaysS[a]; // 사용자가 고른 기념일 문자
		retrunNameSSec = speDaysS[b];
	}

	// 경과일수 구하기.
	public void result() {
		if (firDate >= secDate) {
			result = firDate - secDate;
		} else {
			result = secDate - firDate;
		}
	}
	public String returnNameF() {return returnNameSFir;}	
	public String returnNameS() {return retrunNameSSec;}	
	public int returnDay() {return result;}	
	public int returnPassedFirstDay(){return firDate;}
	public int returnPassedSecondDay(){return secDate;}
	public int returnFirstKey(){return fkey;}
	public int returnSecondKey(){return skey;}
}
