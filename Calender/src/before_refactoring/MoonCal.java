package before_refactoring;

public class MoonCal {
	private int[] moonMon;
	private int date;
	private int monNum;

	public MoonCal() {
		moonMon = new int[] { 30, 29, 30, 29, 30, 29, 30, 29, 30, 30/* 윤달 */,
				29, 30, 29 };
	}

	public void calculrateMoonDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i <= monNum; i++) {
			date = moonMon[i] + date;
		}
		date = date + (dayNum % 100);
	}

    public int getPassedmoonMon() {return date;}

}

