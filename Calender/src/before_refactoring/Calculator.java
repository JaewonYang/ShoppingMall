package before_refactoring;

public class Calculator {

	private int[] speDaysN; // Days Ŭ���    ����� ������ ����ϵ�
    private String [] speDaysS;
    private int[] key; // ������ Ű��, �̰��� ���� ��°� ������ ����.
    private int fkey;
    private int skey;


	private int firDate; // ������� �����
	private int secDate;
	private int result; // �������� ���
	private String returnNameSFir; // ����ڰ� �? ����� �̸�
	private String retrunNameSSec;
	private int choosedNumFirst; // ����ڰ� �? ����� ��¥��
	private int choosedNumSecond;

	Days days;
	SunCal sunCal;
	MoonCal moonCal;

	// ����ڰ� ������ �ΰ��� ��, Days Ŭ�����κ��� ������ ����� ��, Ű��
	public void dayHow(int a, int b) {
		days = new Days();
		sunCal = new SunCal();
		moonCal = new MoonCal();

		speDaysN = days.getDateArr(); // days Ŭ�������� ����ϵ�� Ű������ ������
		speDaysS = days.getStr();
		key = days.getKeyArr();

		// Ű���� ���� �? ������� ������� �������� Ȯ��
		fkey = key[a];
		skey = key[b];

		choosedNumFirst = days.getDateArr()[a]; // ����ڰ� �? ����� ��¥
		choosedNumSecond = days.getDateArr()[b];

		// key���� ���� ������� �������� �����ؼ�
		if (fkey == 1) {
			sunCal.calculrateSunDays(a, choosedNumFirst); // sunCal �� ����ڰ� �?
															// ��ȣ,
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
		returnNameSFir = speDaysS[a]; // ����ڰ� �? ����� ����
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
