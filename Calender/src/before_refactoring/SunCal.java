package before_refactoring;

public class SunCal {

	private int[] sunMon; // 양력의 달별 날짜들을 모은 배열
	private int date; // 경과일
	private int monNum; // 사용자가 고른 날짜

	public SunCal() {
		sunMon = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	}

	public void calculrateSunDays(int a, int dayNum) {
		monNum = a - 1;

		for (int i = 0; i < monNum; i++) {
			date = sunMon[i] + date; // 양력달력을 가져오고 날짜들을 더합니다.
		}
		date = date + (dayNum % 100);
	}

	public int getPassedsunMon() {return date;}
}
