package before_refactoring;

public class SunCal {

	private int[] sunMon;
	private int date;
	private int monNum;

	public SunCal() {
		sunMon = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	}

	public void calculrateSunDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i < monNum; i++) {
        date = sunMon[i] + date;
    }
    date = date + (dayNum % 100);
	}

	public int getPassedsunMon() {return date;}
}
