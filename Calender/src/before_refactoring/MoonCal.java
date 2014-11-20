package before_refactoring;

public class MoonCal {
	private int[] moonMon; // 음력의 달별 날짜들을 모은 배열
	private int date; // 경과일
	private int monNum; // 사용자가 고른 날짜

	public MoonCal() {
		moonMon = new int[] { 30, 29, 30, 29, 30, 29, 30, 29, 30, 30/* 윤달 */,
				29, 30, 29 };
	}

	public void calculrateMoonDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i <= monNum; i++) {
			date = moonMon[i] + date; // 음력 달력을 가져오고 날짜들을 더합니다.
		}
		date = date + (dayNum % 100);
	}

	public int getPassedmoonMon() {return date;}

}

