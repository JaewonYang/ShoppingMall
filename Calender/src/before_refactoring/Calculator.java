package before_refactoring;

public class Calculator {

	private int[] speDaysN;
    private String [] speDaysS;
    private int[] key;
    private int fkey;
    private int skey;


	private int firDate;
	private int secDate;
	private int result;
	private String returnNameSFir;
	private String retrunNameSSec;
	private int choosedNumFirst;
	private int choosedNumSecond;

	Days days;
	SunCal sunCal;
	MoonCal moonCal;


	public void dayHow(int a, int b) {
		days = new Days();
		sunCal = new SunCal();
		moonCal = new MoonCal();

		speDaysN = days.getDateArr();
		speDaysS = days.getStr();
		key = days.getKeyArr();


		fkey = key[a];
		skey = key[b];

		choosedNumFirst = days.getDateArr()[a];
		choosedNumSecond = days.getDateArr()[b];


		if (fkey == 1) {
			sunCal.calculrateSunDays(a, choosedNumFirst);

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
		returnNameSFir = speDaysS[a];
		retrunNameSSec = speDaysS[b];
	}

	// ����ϼ� ���ϱ�.
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
